// Generated by Karakum - do not modify it manually!


package node.http

import node.net.LookupFunction
import node.net.Socket
import web.abort.AbortSignal


sealed external interface ClientRequestArgs {
    var _defaultAgent: Agent?
    var agent: Any? /* Agent | boolean | undefined */
    var auth: String?

    // https://github.com/nodejs/node/blob/master/lib/_http_client.js#L278
    var createConnection: ((options: ClientRequestArgs, oncreate: (err: Throwable /* JsError */, socket: Socket) -> Unit) -> Socket)?
    var defaultPort: Any? /* number | string | undefined */
    var family: Double?
    var headers: OutgoingHttpHeaders?
    var hints: Double?
    var host: String?
    var hostname: String?
    var insecureHTTPParser: Boolean?
    var localAddress: String?
    var localPort: Double?
    var lookup: LookupFunction?

    /**
     * @default 16384
     */
    var maxHeaderSize: Double?
    var method: String?
    var path: String?
    var port: Any? /* number | string | null | undefined */
    var protocol: String?
    var setHost: Boolean?
    var signal: AbortSignal?
    var socketPath: String?
    var timeout: Double?
    var uniqueHeaders: Array<Any /* string | string[] */>?
    var joinDuplicateHeaders: Boolean?
}
