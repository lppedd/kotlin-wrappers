@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

import kotlin.reflect.KProperty

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
// TODO: make external in IR
sealed class StateInstance<T> {
    inline operator fun component1(): T = asDynamic()[0]
    inline operator fun component2(): StateSetter<T> = asDynamic()[1]

    inline operator fun getValue(
        thisRef: Nothing?,
        property: KProperty<*>,
    ): T =
        asDynamic()[0]

    inline operator fun setValue(
        thisRef: Nothing?,
        property: KProperty<*>,
        value: T,
    ) {
        asDynamic()[1](value)
    }
}
