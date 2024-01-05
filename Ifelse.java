import java.util.Scanner;
class DayIf{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int dn;
dn=sc.nextInt();
if(dn==0){System.out.println("Sunday");}
else if(dn==1){System.out.println("Monday");}
else if(dn==2){System.out.println("Tueday");}
else if(dn==3){System.out.println("Wednesday");}
else if(dn==4){System.out.println("Thursday");}
else if(dn==5){System.out.println("Fridayday");}
else if(dn==6){System.out.println("Saturdayday");}
else {System.out.println("Invalid");}
}
}

