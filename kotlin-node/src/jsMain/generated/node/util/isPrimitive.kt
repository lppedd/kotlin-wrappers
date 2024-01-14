// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util")

package node.util


/**
 * Returns `true` if the given `object` is a primitive type. Otherwise, returns`false`.
 *
 * ```js
 * const util = require('util');
 *
 * util.isPrimitive(5);
 * // Returns: true
 * util.isPrimitive('foo');
 * // Returns: true
 * util.isPrimitive(false);
 * // Returns: true
 * util.isPrimitive(null);
 * // Returns: true
 * util.isPrimitive(undefined);
 * // Returns: true
 * util.isPrimitive({});
 * // Returns: false
 * util.isPrimitive(() => {});
 * // Returns: false
 * util.isPrimitive(/^$/);
 * // Returns: false
 * util.isPrimitive(new Date());
 * // Returns: false
 * ```
 * @since v0.11.5
 * @deprecated Since v4.0.0 - Use `(typeof value !== 'object' && typeof value !== 'function') || value === null` instead.
 */
external fun isPrimitive(`object`: Any?): Boolean
