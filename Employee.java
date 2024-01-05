class Employee{
int eid;
String ename;
String department;
void insertRecord(int r,String n,String d){
eid=r;
ename=n;
department=d;
}
void displayInformation(){System.out.println(eid+" "+ename+" "+department);}
}
class TestStudent5{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee();
e1.insertRecord(503,"faizu","CSE");
e2.insertRecord(502,"vijay","ECE");
e1.displayInformation();
e2.displayInformation();
}
}