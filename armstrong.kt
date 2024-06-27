fun main() {
    var n= 153
    var d=0
    var sum=0
    var n1=n
    var rem=0
    while(n>0)
    {
        rem=n%10
        n=n/10
        sum =sum +rem*rem*rem
        
    }
    if(sum==n1)
    {
        println("armstrong")
        
    }
    else
    {
        println("not a armstrong")
    }

}
