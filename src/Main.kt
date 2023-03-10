import kotlinx.coroutines.*
suspend fun main(){
    try {
        var Tovar: Tovar = Tovar(
            "Робот пылесос",
            1000.0, "шт", "Электроника", 10, 10000.0
        )
        print("Сколько будет повторений?: ")
        var povtor = readLine()!!.toInt()
        var scanner = Tovar.Sc()
        if (scanner)
            println(Tovar.Info())
        GlobalScope.launch {
            for (i in 1..povtor) {
                println("$i раз\n")
                Tovar.input()
                var prov = Tovar.Money()
                scanner = Tovar.Sc()
                if (scanner) {
                    if (prov) {
                        Tovar.CountBuy()
                        println("\n${Tovar.Info()}")
                    }
                }
            }
        }
        runBlocking { delay(300000L) }
    }
    catch (e:Exception)
    {
        println("Некорректный ввод данных!")
    }
}
