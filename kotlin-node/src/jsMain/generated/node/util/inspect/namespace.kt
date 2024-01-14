// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util")
@file:JsQualifier("inspect")

package node.util.inspect

import node.util.InspectOptions

external var colors: node.Dict<js.array.JsTuple2<Double, Double>>

external var styles: Styles

external var defaultOptions: InspectOptions

/**
 * Allows changing inspect settings from the repl.
 */
external var replDefaults: InspectOptions

/**
 * That can be used to declare custom inspect functions.
 */
external val custom: /* unique */ js.symbol.Symbol
