// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util/types")

package node.util.types


/**
 * Returns `true` if the value is an [async function](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/async_function).
 * This only reports back what the JavaScript engine is seeing;
 * in particular, the return value may not match the original source code if
 * a transpilation tool was used.
 *
 * ```js
 * util.types.isAsyncFunction(function foo() {});  // Returns false
 * util.types.isAsyncFunction(async function foo() {});  // Returns true
 * ```
 * @since v10.0.0
 */
external fun isAsyncFunction(`object`: Any?): Boolean
