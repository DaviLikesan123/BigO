package bigO

import kotlin.system.measureTimeMillis

fun measureExecutionTime(block: () -> Unit): Long {
    return measureTimeMillis {
        block()
    }
}

