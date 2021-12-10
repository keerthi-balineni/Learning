import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Predicate;

public class PracticeExamples {

    public static void main(String args[]) {

        /*Parent p = new Child();
        Child c = (Child)p;

        p.show();
        c.show();
        String str1 = "satish";
        String str2 = "Satish";
        System.out.println(str1.compareTo(str2));

        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(1,"Vaydeesh",2,2000));
        al.add(new Student(2,"Satish",32,200000));
        al.add(new Student(3,"Keerthi",30,30000));
        Collections.sort(al);
        for(Student st:al){
          System.out.println(st.rollno + " " + st.name + " " + st.salary + " " + st.age);
        }

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Mango");
        list1.add("Orange");
        list1.add("Pineapple");
        System.out.println("Iterator example");
        Iterator iterator=list1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            }
        ArrayList<Integer> predicateexample = new ArrayList<Integer>();
        predicateexample.add(1);
        predicateexample.add(2);
        predicateexample.add(3);
        predicateexample.add(4);
        predicateexample.add(5);
        System.out.println("Preicate Example using lambda");
        Predicate<Integer> btf = n -> n>2;
        predicateexample.stream().filter(btf).forEach(System.out::println);


*/      int count = 7, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers:");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");

            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }

        System.out.println("Palindrome program");
        String original,reverse= "";
        System.out.println("Enter a string to find palindrome :");
        Scanner input = new Scanner(System.in);
        original=input.nextLine();
        int length= original.length();
        for(int i=length-1;i>=0;i--)
            reverse = reverse + original.charAt(i);
        if(original.equals(reverse))
            System.out.println("Entered string is a palindrome");

        else
            System.out.println("Entered string is not a palindrome");


    }

}
