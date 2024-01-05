import java.io.*;
import java.util.*;
class Test1{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int inpVar=sc.nextInt();
System.out.println(Test.printMonth(inpVar));
}
public static String printMonth(int monthno){
String month;
switch(monthno){
case 0:{day="january";break;}
case 1:{day="february";break;}
case 2:{day="march";break;}
case 3:{day="april";break;}
case 4:{day="may";break;}
case 5:{day="june";break;}
case 6:{day="july";break;}
default:day="invalid";
}
return day;
}}