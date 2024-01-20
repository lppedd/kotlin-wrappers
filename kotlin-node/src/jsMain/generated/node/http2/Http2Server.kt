// Generated by Karakum - do not modify it manually!


package node.http2


@Suppress("INTERFACE_WITH_SUPERCLASS")

sealed external interface Http2Server : node.net.Server, HTTP2ServerCommon {
    fun addListener(
        event: Http2ServerEvent.CHECKCONTINUE,
        listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit,
    ): Unit /* this */

    fun addListener(
        event: Http2ServerEvent.REQUEST,
        listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit,
    ): Unit /* this */

    fun addListener(event: Http2ServerEvent.SESSION, listener: (session: ServerHttp2Session) -> Unit): Unit /* this */
    fun addListener(
        event: Http2ServerEvent.SESSIONERROR,
        listener: (err: Throwable /* JsError */) -> Unit,
    ): Unit /* this */

    fun addListener(
        event: Http2ServerEvent.STREAM,
        listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Double) -> Unit,
    ): Unit /* this */

    fun addListener(event: Http2ServerEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    override fun addListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    fun addListener(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun emit(event: Http2ServerEvent.CHECKCONTINUE, request: Http2ServerRequest, response: Http2ServerResponse): Boolean
    fun emit(event: Http2ServerEvent.REQUEST, request: Http2ServerRequest, response: Http2ServerResponse): Boolean
    fun emit(event: Http2ServerEvent.SESSION, session: ServerHttp2Session): Boolean
    fun emit(event: Http2ServerEvent.SESSIONERROR, err: Throwable /* JsError */): Boolean
    fun emit(
        event: Http2ServerEvent.STREAM,
        stream: ServerHttp2Stream,
        headers: IncomingHttpHeaders,
        flags: Number,
    ): Boolean

    fun emit(event: Http2ServerEvent.TIMEOUT): Boolean
    override fun emit(event: String, vararg args: Any?): Boolean

    override fun emit(event: js.symbol.Symbol, vararg args: Any?): Boolean
    fun on(
        event: Http2ServerEvent.CHECKCONTINUE,
        listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit,
    ): Unit /* this */

    fun on(
        event: Http2ServerEvent.REQUEST,
        listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit,
    ): Unit /* this */

    fun on(event: Http2ServerEvent.SESSION, listener: (session: ServerHttp2Session) -> Unit): Unit /* this */
    fun on(event: Http2ServerEvent.SESSIONERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun on(
        event: Http2ServerEvent.STREAM,
        listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Double) -> Unit,
    ): Unit /* this */

    fun on(event: Http2ServerEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    override fun on(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    fun on(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun once(
        event: Http2ServerEvent.CHECKCONTINUE,
        listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit,
    ): Unit /* this */

    fun once(
        event: Http2ServerEvent.REQUEST,
        listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit,
    ): Unit /* this */

    fun once(event: Http2ServerEvent.SESSION, listener: (session: ServerHttp2Session) -> Unit): Unit /* this */
    fun once(event: Http2ServerEvent.SESSIONERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun once(
        event: Http2ServerEvent.STREAM,
        listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Double) -> Unit,
    ): Unit /* this */

    fun once(event: Http2ServerEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    override fun once(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    fun once(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun prependListener(
        event: Http2ServerEvent.CHECKCONTINUE,
        listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit,
    ): Unit /* this */

    fun prependListener(
        event: Http2ServerEvent.REQUEST,
        listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit,
    ): Unit /* this */

    fun prependListener(
        event: Http2ServerEvent.SESSION,
        listener: (session: ServerHttp2Session) -> Unit,
    ): Unit /* this */

    fun prependListener(
        event: Http2ServerEvent.SESSIONERROR,
        listener: (err: Throwable /* JsError */) -> Unit,
    ): Unit /* this */

    fun prependListener(
        event: Http2ServerEvent.STREAM,
        listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Double) -> Unit,
    ): Unit /* this */

    fun prependListener(event: Http2ServerEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    override fun prependListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    fun prependListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    fun prependOnceListener(
        event: Http2ServerEvent.CHECKCONTINUE,
        listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: Http2ServerEvent.REQUEST,
        listener: (request: Http2ServerRequest, response: Http2ServerResponse) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: Http2ServerEvent.SESSION,
        listener: (session: ServerHttp2Session) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: Http2ServerEvent.SESSIONERROR,
        listener: (err: Throwable /* JsError */) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: Http2ServerEvent.STREAM,
        listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Double) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: Http2ServerEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    override fun prependOnceListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    fun prependOnceListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */
}
