class Idcard{
    private String college_name;
    private String college_address;
    private int ay_start;
    private int ay_end;
    private int id;
    private String student_name;
    private String course_name;
    private String aadhar_no;
    public void setCollege_name(String college_name){this.college_name=college_name;}
    public void setCourse_name(String course_name){this.course_name=course_name;}
    public void setAy_start(int ay_start){this.ay_start=ay_start;}
    public void setAy_end(int ay_end){this.ay_end=ay_end;} 
    public void setId(int ay_end){this.ay_end=ay_end;}
    public void setStudent_name(String student_name){this.student_name=student_name;}
    public void setAadhar_no(String aadhar_no){this.aadhar_no=aadhar_no;}
    public String getCollege_name(){return college_name;}
    public String getCollege_address(){return college_address;}
    public int getAy_start(){return ay_start;}
    public int getAy_end(){return ay_end;}
    public int getId(){return id;}
    public String getStudent_name(){return student_name;}
    public String getCourse_name(){return course_name;}
    public String getAadhar_name(){return aadhar_no;}
}
class CSE
{
    public static void main(String args[])
    {
    Idcard i=new Idcard();
    i.setCollege_name("mother theresa institute of engineering and technology");
    i.setCollege_address("Palamaner,Melmoi");
    i.setAy_start(2023);
    i.setAy_end(2026);
    i.setId(32417);
    i.setStudent_name("K.M.Faisal");
    i.setCourse_name("CSE");
    i.setAadhar_no("822139468311");
    System.out.println("college_name"+i.getCollege_name());
    System.out.println("college_address"+i.getCollege_address());
    System.out.println("ay_start"+i.getAy_start());
    System.out.println("ay.end"+i.getAy_end());
    System.out.println("id"+i.getId());
    System.out.println("college_name"+i.getStudent_name());
    System.out.println("course_name"+i.getCourse_name());
    System.out.println("aadhar_no"+i.getAadhar_no());
    }
}

    








    

