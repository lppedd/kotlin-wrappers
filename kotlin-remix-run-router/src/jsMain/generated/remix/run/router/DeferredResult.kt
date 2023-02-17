@file:JsModule("@remix-run/router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router

import web.http.Headers

/**
 * Successful defer() result from a loader or action
 */

external interface DeferredResult {
    var type: ResultType /* ResultType.deferred */
    var deferredData: DeferredData
    var statusCode: Double?
    var headers: Headers?
}
