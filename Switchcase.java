import java.util.Scanner;
class Switch{
public static void displayDay(int n)
{
switch(n){
case 0:System.out.println("Sunday");break;
case 1:System.out.println("Monday");break;
case 2:System.out.println("Tueday");break;
case 3:System.out.println("Wednesday");break;
case 4:System.out.println("Thursday");break;
case 5:System.out.println("Fridayday");break;
case 6:System.out.println("Saturdayday");break;
default:System.out.println("Invalid");break;
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int dn=sc.nextInt();
displayDay(dn);
}
}
