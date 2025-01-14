// Generated by Karakum - do not modify it manually!

package node.process


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface ProcessEvent : node.events.EventType {
    sealed interface BEFOREEXIT : ProcessEvent
    sealed interface DISCONNECT : ProcessEvent
    sealed interface EXIT : ProcessEvent
    sealed interface REJECTIONHANDLED : ProcessEvent
    sealed interface UNCAUGHTEXCEPTION : ProcessEvent
    sealed interface UNCAUGHTEXCEPTIONMONITOR : ProcessEvent
    sealed interface UNHANDLEDREJECTION : ProcessEvent
    sealed interface WARNING : ProcessEvent
    sealed interface MESSAGE : ProcessEvent
    sealed interface MULTIPLERESOLVES : ProcessEvent
    sealed interface WORKER : ProcessEvent

    companion object {
        @seskar.js.JsValue("beforeExit")
        val BEFOREEXIT: BEFOREEXIT

        @seskar.js.JsValue("disconnect")
        val DISCONNECT: DISCONNECT

        @seskar.js.JsValue("exit")
        val EXIT: EXIT

        @seskar.js.JsValue("rejectionHandled")
        val REJECTIONHANDLED: REJECTIONHANDLED

        @seskar.js.JsValue("uncaughtException")
        val UNCAUGHTEXCEPTION: UNCAUGHTEXCEPTION

        @seskar.js.JsValue("uncaughtExceptionMonitor")
        val UNCAUGHTEXCEPTIONMONITOR: UNCAUGHTEXCEPTIONMONITOR

        @seskar.js.JsValue("unhandledRejection")
        val UNHANDLEDREJECTION: UNHANDLEDREJECTION

        @seskar.js.JsValue("warning")
        val WARNING: WARNING

        @seskar.js.JsValue("message")
        val MESSAGE: MESSAGE

        @seskar.js.JsValue("multipleResolves")
        val MULTIPLERESOLVES: MULTIPLERESOLVES

        @seskar.js.JsValue("worker")
        val WORKER: WORKER
    }
}
