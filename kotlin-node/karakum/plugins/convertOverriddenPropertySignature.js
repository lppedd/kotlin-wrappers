import ts from "typescript";
import * as karakum from "karakum";

const overriddenProps = {
    // crypto
    "GeneratePrimeOptionsArrayBuffer": {
        "bigint": null,
    },
    "GeneratePrimeOptionsBigInt": {
        "bigint": "requiredBigInt",
    },

    // dns
    "LookupAllOptions": {
        "all": "requiredAll",
    },
    "LookupOneOptions": {
        "all": null,
    },
    "ResolveWithTtlOptions": {
        "ttl": null,
    },

    // tls
    "TlsOptions": {
        "sessionTimeout": null,
        "ticketKeys": null,
    }
}

export default function (node, context, render) {
    if (
        ts.isPropertySignature(node)
        && ts.isInterfaceDeclaration(node.parent)
        && node.parent.name.text in overriddenProps
        && ts.isIdentifier(node.name)
        && node.name.text in overriddenProps[node.parent.name.text]
    ) {
        const readonly = node.modifiers?.find(modifier => modifier.kind === ts.SyntaxKind.ReadonlyKeyword)

        const modifier = readonly
            ? "val "
            : "var "

        const name = render(node.name)

        const isOptional = Boolean(node.questionToken)

        const type = karakum.renderNullable(node.type, isOptional, context, render)

        const overrideConfig = overriddenProps[node.parent.name.text][node.name.text]

        const hasAlias = overrideConfig !== null

        if (hasAlias) {
            let alias
            let parentType

            if (Array.isArray(overrideConfig)) {
                [alias, parentType] = overrideConfig
            } else {
                alias = overrideConfig
            }

            const jsName = `@JsName("${name}")`
            const aliasSignature = `${modifier}${alias}: ${type}`

            if (parentType) {
                const deprecation = `@Deprecated(message = "use ${alias}", level = DeprecationLevel.HIDDEN)`
                const signature = `override ${modifier}${name}: ${parentType}`

                return [
                    deprecation,
                    signature,
                    jsName,
                    aliasSignature,
                ].join("\n")
            } else {
                return [
                    jsName,
                    aliasSignature,
                ].join("\n")
            }
        }

        return `override ${modifier}${name}: ${type}`
    }
    return null
}
