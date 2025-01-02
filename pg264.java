import java.util.Scanner;
class pg264
{
public static void main(String k[])
{
Scanner sc=new Scanner(System.in);
int weight=sc.nextInt();   //sc.input1
char level=sc.nextLine().charAt(0);   //nextLine() will give you both upper case and lower case//take only the first character of input
int esttime=0;
if(weight==0)
{
esttime=0;
}
if((weight>0 && weight<2000) && (level=='L'||level=='l'))
{
esttime=25;
}
if((weight>2000 && weight<4000) && (level=='M'||level=='m'))
{
esttime=35;
}
if((weight>4000 && weight<7000) && (level=='H'||level=='h'))
{
esttime=45;
}
if(weight>7000)
{
System.out.println("OVERLOADED");
}
if(weight<0)
{
System.out.println("INVALID");
}
System.out.println("Estimated time"+esttime);
}
}