// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util/types")

package node.util.types


/**
 * Returns `true` if the value is a built-in [`SharedArrayBuffer`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer) instance.
 * This does _not_ include [`ArrayBuffer`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer) instances. Usually, it is
 * desirable to test for both; See `util.types.isAnyArrayBuffer()` for that.
 *
 * ```js
 * util.types.isSharedArrayBuffer(new ArrayBuffer());  // Returns false
 * util.types.isSharedArrayBuffer(new SharedArrayBuffer());  // Returns true
 * ```
 * @since v10.0.0
 */
external fun isSharedArrayBuffer(`object`: Any?): Boolean
