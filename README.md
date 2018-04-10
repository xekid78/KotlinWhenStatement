# KotlinWhenStatement
when文

## 処理
`Random.nextInt()`メソッドを使用して0 ～ 12のランダムな数字でおみくじの結果を出力します。

## コード
```
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
```

## 出力結果  
```
大吉
```

## 開発環境
| 開発ツール |  |
|:-|:-|
| OS | Windows10 |
| 仮想化ソフト | Oracle VM VirtualBox 5.2 |
| 構築ソフト | Vagrant 2.0.2 |
| 仮想化上OS | CentOS 6.9 |
| SSHクライアント | PuTTY 0.6.8 |
| FTPクライアント | Cyberduck 6.3.5 |
| エディタ | Atom 1.24.0 |
| 開発言語 | Kotlin 1.2.31 |
