class Tovar(var name1:String, var price1:Double, var ed1:String,var vid1:String,var count1:Int, var Money1:Double):Abstract(){
    override var name=name1
    override var price=price1
    override var ed=ed1
    override var vid=vid1
    override var count=count1
    override var Money=Money1
    override fun Info():String
    {
        return "Информация о товаре:\nНаименование товара: ${name}\nЦена за 1 товар: ${price}\nЕдиницы измерения товара (${name}): ${ed}\nВид товара: ${vid}\nКоличество товара на складе: ${count}"
    }
    fun Sc():Boolean
    {
        if (price>0)
        {
            if (count>0)
                return true;
            else
            {println("Ввод отрицательного количества товара!"); return false;}
        }
        else { println("Введена отрицательная цена за товар") ; return false;}
    }
    fun Money():Boolean
    {
        print("Сколько у вас денег?: ")
        Money=readLine()!!.toDouble()
        if (Money<0.0)
        {
            println("Введена отрицательная сумма денег!")
            return false;
        }
        else return true;
    }

    fun CountBuy()
    {
        println("Введите количество товара ($name), которое хотели бы купить?")
        var count2= readLine()!!.toInt()
        if (count2<0)
        {
            println("Количество не может быть меньше нуля, автоматически выставлен один товар")
            count2=1;
        }
        else
            if (count2<count)
            {
                if (count2*price<=Money)
                {
                    println("Покупка прошла успешно!")
                }
                else println("Покупка отклонена, недостаточно средств!")
            }
        else println("Товара на складе меньше указаного!")


}
}