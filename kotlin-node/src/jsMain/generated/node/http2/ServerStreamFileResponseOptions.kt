// Generated by Karakum - do not modify it manually!


package node.http2

import node.http.OutgoingHttpHeaders


sealed external interface ServerStreamFileResponseOptions {
    // eslint-disable-next-line @typescript-eslint/no-invalid-void-type
    fun statCheck(
        stats: node.fs.Stats,
        headers: OutgoingHttpHeaders,
        statOptions: StatOptions,
    ): Any /* void | boolean */

    var waitForTrailers: Boolean?
    var offset: Double?
    var length: Double?
}
