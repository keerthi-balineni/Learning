import java.lang.Comparable;

public class Student implements Comparable<Student> {

    int rollno;
    String name;
    int age;
    float salary;

    public Student(int rollno, String name, int age, float salary){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    @Override
    public int compareTo(Student o) {
        if (this.age==o.age){
            return 0;
        }
        else if (this.age>o.age){
            return -1;
        }
        else{
            return 1;
        }
    }
}