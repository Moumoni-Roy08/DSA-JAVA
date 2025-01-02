import java.util.Scanner;
class boolfibopgm271
{
static boolean isFib(int n)
{
int check1= 5*n*n+4;
int check2= 5*n*n-4;
return perfectsq(check1)||perfectsq(check2);
}
static boolean perfectsq(int value1)
{
int sq=(int)Math.sqrt(value1);
return sq*sq==value1;
}
public static void main(String[] args)
{ 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(isFib(n))
{
System.out.println("Given no is fibo");
}
else
{
System.out.println("not a fibo");
}
}
}