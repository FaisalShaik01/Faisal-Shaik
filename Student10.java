class Student{
    private int id;
    public void setId(int id){this.id=id;}
    public int getId(){return this.id;}
    }
    class BCA{
        public static void main(String args[])
        {
            Student ob=new Student();
            ob.setId(23415);
            System.out.println("id:"+ob.getId());
        }
    }

    