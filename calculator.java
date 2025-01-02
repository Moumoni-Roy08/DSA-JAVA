import java.util.Scanner;0
class calculator()
{
public static void main(String[] k)
{
Sacnner sc=new Scanner(System.in);
System.out.println("Enter a");
int a=sc.nextInt();
System.out.println("Enter b");
int b=sc.nextInt();
int c=0;
boolean validop=true;
System.out.println("enter your operator");
char operator=sc.next().charAt(0);
switch(ch)
{
case '+':
c=a+b;
break;
case '-':
c=a-b;
break;
case '*':
c=a*b;
break;
case '/':
c=a/b;
break;
case '%':
if(b>0)
{
c=a%b;
break;
}
else
{
System.out.println("b should be greater than zero");
validop=false;
}
break;
default:
System.out.println("Invalid");
break;
}
if(validop)
{
System.out.println(c);
}
}
}