package Course1.Homework.Lesson12;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
}

class StudentTest{
    void pervoeSravnenie(String name1,String name2,int course1,int course2,double grade1,double grade2) {
        if (name1.equals(name2) && course1 == course2 && grade1 == grade2) {
            System.out.println("Имена, курс и оценки одинаковы");
        } else if (name1.equals(name2) && course1 != course2 && grade1 == grade2) {
            System.out.println("Имена и оцнгки совпадают,курс отличается");
        }else if (name1.equals(name2) && course1 != course2 && grade1 != grade2){
            System.out.println("Имена совпадают, курс и оценки отличаются");
        }else {
            System.out.println("ничего не совпадает");
        }
    }
    void vtoroeSravnenie(String name1,String name2,int course1,int course2,double grade1,double grade2){
        if(name1.equals(name2)){
            if (course1==course2){
                if (grade1==grade2){
                    System.out.println("Имена,курс и оценки совпадают");
                }else {
                    System.out.println("Имена,курс совпадают,оценки отличаются");
                }
            }else {
                System.out.println("Имена совпадают, курс и оценки отлличаются");
            }
        }else {
            System.out.println("Ничего не совпадает");
        }
    }
    public static void main(String[] args) {
        StudentTest t1 = new StudentTest();
    Student s1 = new Student("Ivan",3,9.5);
    Student s2 = new Student("Petor",1,5.3);
    t1.vtoroeSravnenie(s1.name, s2.name, s1.course, s2.course, s1.grade, s2.grade);
    }
}

