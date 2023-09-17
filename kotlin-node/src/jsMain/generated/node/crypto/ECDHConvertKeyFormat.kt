package node.crypto


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{uncompressed: 'uncompressed', compressed: 'compressed', hybrid: 'hybrid'}/*union*/)""")
sealed external interface ECDHConvertKeyFormat {
    companion object {
        val uncompressed: ECDHConvertKeyFormat
        val compressed: ECDHConvertKeyFormat
        val hybrid: ECDHConvertKeyFormat
    }
}
