fun main() {
    var c=0
   var s="hello eveyone"
    for (i in 'a'..'z')
    {
        for(j in s)
        {
            if(i==j)
            {
                c++
            }
        }
        if(c!=0)
        {
            println("$i is present $c times")
        }
        c=0
    }
}
