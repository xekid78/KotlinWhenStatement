import java.util.Random

fun main(args: Array<String>) {
    val r = Random()
    val num = r.nextInt(12)
    val omikuji =
        when (num) {
            0 -> "大吉"
            1, 2 -> "中吉"
            in 3..6 -> "小吉"
            in 7..9 -> "吉"
            10, 11 -> "凶"
            else -> "大凶"
        }
        println(omikuji)
}
