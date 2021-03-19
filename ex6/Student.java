package testOOP;

import java.util.ArrayList;

public class Student
{
    public String name;
    public int age;
    public ArrayList<Integer> grades;
    public float average;

    public Student(String _name, int _age, ArrayList<Integer> _grades)
    {
        name = _name;
        age = _age;
        grades = _grades;

        int total = 0;

        for (Integer grade : grades) {
            total += grade;
        }

        average = total / grades.size();
    }


    @Override
    public String toString() {
        return name;
    }
}