 public class Bank
{
 static float current_balance=100f;
 static float amount;
public static void currentbalance()
{
System.out.println("current balance is:" + current_balance);
}
public static void greetCustomer()
{ 
System.out.println("hi,welcome to the bank app");
}
public static void deposit(float amount)
{
current_balance=current_balance+amount;
System.out.println("deposit successfully:"+ amount);}
public void Withdrawal(float amount){
current_balance=current_balance-amount;
System.out.println("withdrawal successfully:"+ amount);
}
public float getcurrentbalance()
{
return current_balance;
}
public static void main(String[] args)
{Bank b=new Bank();
greetCustomer();
currentbalance();
deposit(2000f);
System.out.println("current balance is:" + current_balance);
b.Withdrawal(1000f);
System.out.println("current balance is:" + current_balance);
b.getcurrentbalance();}
}








  
