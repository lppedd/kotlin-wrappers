package node.crypto


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{pkcs1: 'pkcs1', pkcs8: 'pkcs8', sec1: 'sec1'}/*union*/)""")
sealed external interface PrivateKeyInputType {
    companion object {
        val pkcs1: PrivateKeyInputType
        val pkcs8: PrivateKeyInputType
        val sec1: PrivateKeyInputType
    }
}
