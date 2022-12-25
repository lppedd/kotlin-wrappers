package react.beautiful.dnd

import react.Component
import react.Props

external interface DraggableProps : Props {
    var draggableId: DraggableId
    var index: Int
    var children: DraggableChildrenFn
    var isDragDisabled: Boolean?
    var disableInteractiveElementBlocking: Boolean?
    var shouldRespectForcePress: Boolean?
}

external val Draggable: Component<DraggableProps, *>