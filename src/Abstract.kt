abstract class Abstract():Input {
    abstract var name:String
    abstract var price:Double
    abstract var ed:String
    abstract var vid:String
    abstract var count:Int
    abstract var Money:Double
    override fun input()
    {
        print("Введите наименование товара: ")
        name=readLine()!!.toString()
        print("Введите цену за $name: ")
        price= readLine()!!.toDouble()
        print("Введите единицы измерения товара: ")
        ed= readLine()!!.toString()
        print("Введите вид товара: ")
        vid= readLine()!!.toString()
        print("Введите количество товара: ")
        count= readLine()!!.toInt()
    }
    abstract fun Info():String
}