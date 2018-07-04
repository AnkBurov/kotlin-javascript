import org.w3c.dom.HTMLInputElement
import kotlin.browser.document
import kotlin.browser.window

fun main(args: Array<String>) {
    val message = "Hello JavaScript!"
    println(message)
    document.bgColor = "FFAA12"

    val email = document.getElementById("email") as HTMLInputElement
    email.value = "hadi@jetbrains.com"

    window.onload = {

    }
}

@JsName("whatever")
fun whatever() {
    println("kotlinafnafn")
//    throw IllegalArgumentException("!!!!!!!!!!!!!!!!!!!11")
}

fun button() {
    val email = document.getElementById("addFormText") as HTMLInputElement
    email.value = "some@jetbrains.com"
}