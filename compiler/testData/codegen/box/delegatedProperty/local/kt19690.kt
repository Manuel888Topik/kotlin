// KJS_WITH_FULL_RUNTIME
// IGNORE_BACKEND: JVM_IR
//WITH_REFLECT

import kotlin.properties.Delegates

interface MyInterface {
    fun something(): String {
        var foo: String by Delegates.notNull();
        foo = "OK"
        return foo
    }
}

fun box(): String {
    return object : MyInterface {

    }.something()
}