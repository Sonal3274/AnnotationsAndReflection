import kotlin.reflect.KClass

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class MyAnnotation(val value: KClass<*>)

@MyAnnotation(String::class)
class MyClass

fun main() {
    val annotation = MyClass::class.java.getAnnotation(MyAnnotation::class.java)
    println(annotation?.value)
}
