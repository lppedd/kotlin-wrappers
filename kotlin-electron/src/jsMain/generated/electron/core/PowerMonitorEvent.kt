// Generated by Karakum - do not modify it manually!

package electron.core


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface PowerMonitorEvent : node.events.EventType {
    sealed interface LOCK_SCREEN : PowerMonitorEvent
    sealed interface ON_AC : PowerMonitorEvent
    sealed interface ON_BATTERY : PowerMonitorEvent
    sealed interface RESUME : PowerMonitorEvent
    sealed interface SHUTDOWN : PowerMonitorEvent
    sealed interface SPEED_LIMIT_CHANGE : PowerMonitorEvent
    sealed interface SUSPEND : PowerMonitorEvent
    sealed interface THERMAL_STATE_CHANGE : PowerMonitorEvent
    sealed interface UNLOCK_SCREEN : PowerMonitorEvent
    sealed interface USER_DID_BECOME_ACTIVE : PowerMonitorEvent
    sealed interface USER_DID_RESIGN_ACTIVE : PowerMonitorEvent

    companion object {
        @seskar.js.JsValue("lock-screen")
        val LOCK_SCREEN: LOCK_SCREEN

        @seskar.js.JsValue("on-ac")
        val ON_AC: ON_AC

        @seskar.js.JsValue("on-battery")
        val ON_BATTERY: ON_BATTERY

        @seskar.js.JsValue("resume")
        val RESUME: RESUME

        @seskar.js.JsValue("shutdown")
        val SHUTDOWN: SHUTDOWN

        @seskar.js.JsValue("speed-limit-change")
        val SPEED_LIMIT_CHANGE: SPEED_LIMIT_CHANGE

        @seskar.js.JsValue("suspend")
        val SUSPEND: SUSPEND

        @seskar.js.JsValue("thermal-state-change")
        val THERMAL_STATE_CHANGE: THERMAL_STATE_CHANGE

        @seskar.js.JsValue("unlock-screen")
        val UNLOCK_SCREEN: UNLOCK_SCREEN

        @seskar.js.JsValue("user-did-become-active")
        val USER_DID_BECOME_ACTIVE: USER_DID_BECOME_ACTIVE

        @seskar.js.JsValue("user-did-resign-active")
        val USER_DID_RESIGN_ACTIVE: USER_DID_RESIGN_ACTIVE
    }
}
