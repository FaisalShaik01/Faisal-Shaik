import java.util.Scanner;
class PrintNumbers {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=n;
while(i>=0){
System.out.print(i + ",");
i=i-5;
}
}
}