fun main() {
   var s= Square()
   var t= Triangle()
   s.draw()
   t.draw()
    
}
interface Drawable{
    fun draw()
}
class Square() : Drawable
{
   override fun draw()
    {
        println("i am able to draw square")
    }
}
class Triangle(): Drawable
{
    override fun draw()
    {
        println("able to draw Triangle")
    }
}
