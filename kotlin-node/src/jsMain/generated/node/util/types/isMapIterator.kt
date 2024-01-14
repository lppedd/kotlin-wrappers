// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util/types")

package node.util.types


/**
 * Returns `true` if the value is an iterator returned for a built-in [`Map`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Map) instance.
 *
 * ```js
 * const map = new Map();
 * util.types.isMapIterator(map.keys());  // Returns true
 * util.types.isMapIterator(map.values());  // Returns true
 * util.types.isMapIterator(map.entries());  // Returns true
 * util.types.isMapIterator(map[Symbol.iterator]());  // Returns true
 * ```
 * @since v10.0.0
 */
external fun isMapIterator(`object`: Any?): Boolean
