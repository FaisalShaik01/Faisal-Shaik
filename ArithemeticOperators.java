import java.util.Scanner;
public class ArithemeticOperators{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number");
double num1=sc.nextInt();
System.out.println("Enter the second number");
double num2=sc.nextInt();
double sum=num1+num2;
double difference=num1-num2;
double product=num1*num2;
double div=num1/num2;
double modulo=num1%num2;
System.out.println("The sum is:"+sum);
System.out.println("The difference is:"+difference);
System.out.println("The product is:"+product);
System.out.println("The div is:"+div);
System.out.println("The modulo is:"+modulo);
}
}





