package test;

/**
 * Created by admin on 2016/5/15.
 */
public class JavaBeanMain {

    public static void main(String[] arg){
        Student s1 = new Student("2","account");
        System.out.println("before:" + s1.toString());
        s1 =new JavaBeanMain().find(s1);
        System.out.println(">>>>>>>>>>>>>>>>>"+s1.getId()+"\t"+s1.getName());

    }

   public Student find(Student student){
        System.out.println("after:"+student.toString());
        student = new Student("1","toma");
       return  student;
    }
}

class Student {
   private String id;
   private String name;

    Student(String id,String name){
        this.id=id;
        this.name=name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
