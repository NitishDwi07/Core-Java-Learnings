
 class Student
    {
       private String rollno;
       private static int count=1;
       private String generaterollno()
       {
       String rn="Univ-"+2024+"-"+count;
       count++;       
       return rn;
       }
       public Student()
       {
        rollno=generaterollno();
       }
       public String getrollno()
       {
        return rollno;
       }
    }
     public class Scstatic extends Student
    {
        public static void main(String args[])
        {
            Student s1=new Student();
            Student s2=new Student();
            Student s3=new Student();
           System.out.println(s1.getrollno());
           System.out.println(s2.getrollno());
           System.out.println(s3.getrollno());
        }
    }


