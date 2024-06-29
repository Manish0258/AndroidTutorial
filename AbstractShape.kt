fun main() {
    val objrect=Rectangle(20.0,3.0)
    val objcircle=Circle(4.0)
    println("Rectangle area:-${objrect.area()}   perimeter:-${objrect.peri()}")
    println("Circle area:-${objcircle.area()}    peimeter:-${objcircle.peri()}")
}
abstract class Shape{
    abstract fun area(): Double
}
class Rectangle( var side : Double,var breadth : Double): Shape()
{
    override fun area(): Double {
        return side * breadth
    }
    fun peri(): Double{
    return (2.0 * side * breadth)
    }
}
class Circle(var side : Double): Shape(){
    override fun area(): Double{
        return (3.141 * side * side)
    }
    fun peri(): Double
    {
        return (2.0 * 3.141 * side)
    }
}
