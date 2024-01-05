// Generated by Karakum - do not modify it manually!


package electron.core


external interface ProtocolRequest {
    // Docs: https://electronjs.org/docs/api/structures/protocol-request
    var headers: js.objects.ReadonlyRecord<String, String>
    var method: String
    var referrer: String
    var uploadData: js.core.ReadonlyArray<UploadData>?
    var url: String
}
