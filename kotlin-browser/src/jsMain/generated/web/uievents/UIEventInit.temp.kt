// Automatically generated - do not modify!

package web.uievents

import js.objects.jso
import web.events.EventInitMutable
import web.window.Window

inline fun UIEventInit(
    block: UIEventInitMutable.() -> Unit,
): UIEventInit =
    jso(block)

external interface UIEventInitMutable :
    UIEventInit,
    EventInitMutable {
    override var detail: Int?
    override var view: Window?
}
