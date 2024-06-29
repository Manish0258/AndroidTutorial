fun main() {
println("factorial is ${fact(5)}")
    
}
fun fact(n: Int): Int
{
  if(n==0 || n==1)
  return 1
  else
    {
        return  (n * fact(n-1))
    }
}
