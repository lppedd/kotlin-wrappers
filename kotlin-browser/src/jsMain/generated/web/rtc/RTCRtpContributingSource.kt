// Automatically generated - do not modify!

package web.rtc

import web.time.DOMHighResTimeStamp

sealed external interface RTCRtpContributingSource {
    var audioLevel: Double?
    var rtpTimestamp: Int
    var source: Int
    var timestamp: DOMHighResTimeStamp
}
