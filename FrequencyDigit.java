import java.util.Scanner;
class FrequencyDigit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char ch=sc.next().charAt(0);
int count=0;
for(int i=0;i<=str.length()-1;i++){
if((Str.charAt(0)=='0')||(Str.charAt(i)=='1')||(Str.charAt(i)=='2')||
(Str.charAt(i)=='3')||(Str.charAt(i)=='4')||(Str.charAt(i)=='5')||
(Str.charAt(i)=='6')||(Str.charAt(i)=='7')||(Str.charAt(i)=='8')||(Str.charAt(i)=='9')){
count++;
}
}
System.out.println(count);
}
}