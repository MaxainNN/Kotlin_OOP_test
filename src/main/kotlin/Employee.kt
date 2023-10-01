open class Employee {
    open val name:String = ""
    open val hour:Int = 40
    open val salary:Double = 40000.0

    open fun vacationDays() = 365 / (hour * 2)

    open fun bonus() = (salary / 2) * 40
}

class Secretary(
    override val name:String
):Employee(){
    override val hour: Int
        get() = super.hour + 10

    fun translate() {
        println("$name is translating the workbook!")
    }
}

class Developer(
    override val name:String,
    val isAndroidDev:Boolean
):Employee(){
    fun assignCoddingProject(){
        if (isAndroidDev) println("Android project assigned.")
        else println("Web developer project assigned.")
    }

    override val salary:Double
        get()= super.salary + 1000
    override val hour:Int
        get() = super.hour + 10

    override fun vacationDays():Int {
        return hour / 2
    }

    override fun bonus(): Double {
        return salary / hour
    }
}