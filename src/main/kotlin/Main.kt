// 常量
const val CONSTANT_VALUE: String = "This is a constant value"


fun main() {

    //只读变量 和 可变变量
    val a: Int = 1 // 只读变量
    var b: Int = 2 // 可变变量
    b += 1
    println("a: $a, b: $b")


    //类型推断
    val c = 3 // 编译器自动推断为 Int 类型
    println("c: $c")
    val str = "Hello, Kotlin!" // 编译器自动推断为 String 类型
    println("str: $str")

    //////

    /*
     * 数据类型
     * java有引用类型和基本类型
     * kotlin只有引用类型，基本类型在编译时会被优化为对应的的基本类型
     * kotlin的引用类型: Int, Double, Float, Long, Short, Byte, Char, Boolean
     */
    val intNum: Int = 10
    val doubleNum: Double = 10.5
    val floatNum: Float = 10.5f
    val longNum: Long = 100000L
    val shortNum: Short = 10
    val byteNum: Byte = 10
    val charNum: Char = 'A'
    val booleanNum: Boolean = true
    println("intNum: $intNum, doubleNum: $doubleNum, floatNum: $floatNum, longNum: $longNum, shortNum: $shortNum, byteNum: $byteNum, charNum: $charNum, booleanNum: $booleanNum")


    /*
     * if/elseIf/else 和Java一样
     */
    val number = (1 .. 10).random()
    if (number == 5) {
        println("number is 5")
    } else if (number > 5) {
        println("number is greater than 5")
    } else {
        println("number is less than 5")
    }

    /**
     * when表达式
     * 类似于Java的switch语句，但功能更强大
     * 可以匹配任意类型的值
     * 可以作为表达式返回值
     */
    val school = (1..4).random()
    val level = when (school) {
        1 -> "小学阶段"
        2 -> "初中阶段"
        3 -> "高中阶段"
        else -> "未知阶段"
    }
    println("school: $school, level: $level")

    /**
     * string模板
     * 模板支持在字符串引号内嵌入变量和表达式
     */
    val name = "Kotlin"
    println("$name is a great programming language.")
    //使用转义符\就会使得$name原样输出
    //表达式里面可以引用方法
    println("Is $name fun to learn? ${if (randomBoolean()) "Yes" else "No"}")


    //当调用默认值的函数时，可以省略该参数
    greet() // 使用默认值 "Guest"
    greet("Alice") // 使用提供的值 "Alice"

    //具名参数机制可以让调用kotlin函数时，不必按照定义时的参数顺序传递参数,但是仍需指定参数名
    fun3(str = "Kotlin", int = 2024) //传递时String在前,Int在后   但实际上该函数定义时Int在前,String在后  但是kotlin仍然能正确识别参数

    //非具名情况下按照函数的定义顺序映射
    fun3(2024, "Kotlin") //传递时Int在前,String在后  符合函数定义时的顺序

}

//函数的完整格式为: 修饰符 fun 函数名(参数1: 类型, 参数2: 类型, ...): 返回值类型 { 函数体 }
private fun sum(a: Int, b: Int): Int { return a + b }

//如果函数没有返回值，可以省略返回值类型，默认返回Unit类型
fun sum2(a: Int, b: Int) {println("$a + $b")} //当函数未声明修饰符时,默认是public的

// 函数的参数可以使用默认值
fun greet(name: String = "Guest") {
    println("Hello, $name!")
}

fun fun3(int: Int, str: String) {println("$int + $str")}

//定义1个加法函数
fun add(x: Int, y: Int): Int {
    return x + y
}

//定义1个随机返回true/false的函数
fun randomBoolean(): Boolean {
    return listOf(true, false).random()
}
