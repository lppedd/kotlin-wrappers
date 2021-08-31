@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

@JsName("matchPath")
external fun rawMatchPath(
    pathName: String,
    options: MatchOptions,
    parent: Match? = definedExternally,
): Match?
