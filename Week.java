import java.io.*;
import java.util.*;
class Test{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int inpVar=sc.nextInt();
System.out.println(Test.printDay(inpVar));
}
public static String printDay(int dayno){
String day;
switch(dayno){
case 0:{day="sunday";break;}
case 1:{day="monday";break;}
case 2:{day="tuesday";break;}
case 3:{day="wednesday";break;}
case 4:{day="thursday";break;}
case 5:{day="friday";break;}
case 6:{day="saturday";break;}
default:day="invalid";
}
return day;
}}