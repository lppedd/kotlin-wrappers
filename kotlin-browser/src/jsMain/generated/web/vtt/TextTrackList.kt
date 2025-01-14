// Automatically generated - do not modify!

package web.vtt

import js.array.ArrayLike
import js.iterable.JsIterable
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList)
 */
sealed external class TextTrackList :
    EventTarget,
    ArrayLike<TextTrack>,
    JsIterable<TextTrack> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/addtrack_event)
     */
    var onaddtrack: EventHandler<TrackEvent>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/change_event)
     */
    var onchange: EventHandler<Event>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/removetrack_event)
     */
    var onremovetrack: EventHandler<TrackEvent>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/getTrackById)
     */
    fun getTrackById(id: String): TextTrack?
}
