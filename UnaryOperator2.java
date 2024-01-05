//java program for unary NOT operator!
//input at compile time
import java.util.Scanner;
class UnaryOperator2{
public static void main(String args[])
{
boolean cond=true;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Cond is:"+cond);
System.out.println("Var1 is:"+a);
System.out.println("Var2 is:"+b);
System.out.println("Now cond is:"+!cond);
System.out.println("!(a<b)="+!(a<b));
System.out.println("!(a>b)="+!(a>b));
}
}
 