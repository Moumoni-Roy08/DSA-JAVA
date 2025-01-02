import java.util.Scanner;
class sumofdigits()
{
public static void main(String[] k)
{
Scanner sc=new(System.in);
int a=sc.nextInt();
sum=0;
while(n>0)
{
int lastdigit=n%10;
sum=sum+lastdigit;
n=n/10; 
System.out.println("sum"+sum);
}

}

}