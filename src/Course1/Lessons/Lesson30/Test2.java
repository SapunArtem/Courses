/*
package Course1.Lessons.Lesson30;

import java.util.ArrayList;

*/
/*public class Test2 {
}
class Student{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student(String name,char sex,int age,int course,double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course=course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {
    void printStudent(Student st) {
        System.out.println("Имя студента: " + st.name + " пол: " + st.sex + " возраст: " + st.age + " курс: " + st.course + " средняя оценка: " + st.avgGrade);
    }
    void testStudents(ArrayList<Student> aL,StudentChecks sc){
        for (Student s:aL){
            if (sc.testStudent(s)){
                printStudent(s);
            }
        }
    }



    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan",'m',22,3,8.3);
        Student st2 = new Student("Nikolay",'m',28,2,6.4);
        Student st3 = new Student("Elena",'f',19,1,8.9);
        Student st4 = new Student("Petor",'m',35,4,7);
        Student st5 = new Student("Mariya",'f',23,3,9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo si = new StudentInfo();

    }
}

interface StudentChecks{
    boolean testStudent(Student s);
}*//*

class FindStudentOverGrade implements StudentChecks{
    public boolean testStudent(Student s){
        return s.avgGrade>8.5;
    }
}
*/

