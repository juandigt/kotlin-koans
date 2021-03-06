package i_introduction._3_Default_Arguments

import util.TODO
import util.doc2

fun todoTask3(): Nothing = TODO(
        """
        Task 3.
        Several overloaded 'foo' functions in the class 'JavaCode3' can be replaced with one function in Kotlin.
        Change the declaration of the function 'foo' in a way that makes the code using 'foo' compile.
        You have to add 'foo' parameters and implement its body.
        Uncomment the commented code and make it compile.
    """,
        documentation = doc2(),
        references = { name: String -> JavaCode3().foo(name); foo(name, 1, true) })

fun foo(name: String, number: Int, toUpperCase: Boolean): String {
    if (toUpperCase) return name.toUpperCase() + number

    return name + number
}


fun task3(): String {

    return (foo("a", 42, false) +
            foo("b", 1, false) +
            foo("c", 42, true) +
            foo("d", 2, true))
}
