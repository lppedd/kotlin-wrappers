// Automatically generated - do not modify!

package actions.io

import js.core.ReadonlyArray
import kotlinx.coroutines.await

suspend fun findInPath(
    tool: String,
): ReadonlyArray<String> =
    findInPathAsync(
        tool = tool,
    ).await()