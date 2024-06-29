fun main() {
var obj=BankAccouunt(121)
println("balance is ${obj.checkbalance()}")
obj.addamt(1000.0)
println("balance is ${obj.checkbalance()}")
obj.withdraw(500.0)
println("balance after withdrawing is ${obj.checkbalance()}")

    
}
class BankAccouunt(var accountnumber: Int = 1)
{
    //var accountnumber: Int= 1 
    var balance: Double = 0.0
    fun withdraw(amt : Double)
    {
        if(balance==0.0 || balance < amt)
        println("withdraw is not possible")
        else
        {
            balance=balance-amt
        }
    }
    fun addamt(amt : Double)
    {
    balance+=amt
    }
    fun checkbalance(): Double{
    return balance
    }
}
