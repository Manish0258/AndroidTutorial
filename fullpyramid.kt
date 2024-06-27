fun main() {
    var k=0
   for (i in 1..5)
    {
        for (j in 1..5-i)
        {
            print(" ")
        }
        while(k!= 2 * i - 1)
        {
            print("*")
            k++
        }
        println()
        k=0
    }
    for (i in 5 downTo 1)
    {
        for (j in 5-i downTo 1)
        {
            print(" ")
        }
        while(k!= 2 * i - 1)
        {
            print("*")
            k++
        }
        println()
        k=0
    }
}
