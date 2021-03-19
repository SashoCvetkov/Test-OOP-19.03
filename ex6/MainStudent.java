package testOOP;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainStudent {

    public static void main(String arg[])
    {
        ArrayList<Student> students = new ArrayList<Student>();

        Student student1 = new Student("Sasho", 17, new ArrayList<Integer>(Arrays.asList(6,5,6)));
        Student student2 = new Student("Valia", 17, new ArrayList<Integer>(Arrays.asList(6,6,6)));
        Student student3 = new Student("Vladi", 17, new ArrayList<Integer>(Arrays.asList(4,4,6)));
        Student student4 = new Student("Misho", 17, new ArrayList<Integer>(Arrays.asList(4,3,4)));
        Student student5 = new Student("Ivan", 17, new ArrayList<Integer>(Arrays.asList(5,2,6)));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for (Student student : students) {
            System.out.println(student.name + " " + student.average);
        }

        for (int i = 0; i < students.size()-1; i++)
            for (int j = 0; j < students.size()-i-1; j++)
                if (students.get(j).average < students.get(j+1).average)
                {
                    Student temp = students.get(j);
                    students.set(j, students.get(j+1));
                    students.set(j+1, temp);
                }

        System.out.println();

        for (Student student : students) {
            System.out.println(student.name + " " + student.average);
        }
    }
}