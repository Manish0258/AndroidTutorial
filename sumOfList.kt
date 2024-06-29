fun main() {
   println("sum of no is :- ${sumOfList(1,2,3,4,5,6,7,8,9)}")
    
}
fun sumOfList(vararg num: Int): Int
{
    var sum =0
    for(i in num)
    sum+=i
    return sum
}
