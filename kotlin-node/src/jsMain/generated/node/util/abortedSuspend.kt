// Generated by Karakum - do not modify it manually!

package node.util

import js.promise.await
import web.abort.AbortSignal


suspend fun aborted(signal: AbortSignal, resource: Any?): Unit =
    abortedAsync(
        signal, resource
    ).await()
