fun main() {
   if(isPalindrom("mammm"))
   println("it is plandriom")
   else
    println("not a palindrom")
    
}
fun isPalindrom(s : String): Boolean
{
   var s1 =""
   for(i in s.length-1 downTo 0)
    s1=s1+s[i]
  
    if(s1==s)
    return true
    else 
    return false
}
