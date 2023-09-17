package node.crypto


sealed external interface CipherGCMOptions : node.stream.TransformOptions {
    var authTagLength: Double?
}
