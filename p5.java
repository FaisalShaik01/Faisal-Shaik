class A{
public void funA1(){
System.out.print("Fun a1 called from classA");
}
public void funA2(){
System.out.print("FunA2 called from classA");
}
}
class B
{
public static void main(String args[]){
A a=new A();
a.funA1();
a.funA2();
}
}