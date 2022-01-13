package Course1.Homework.Lesson6;

public class Student {

        int id;
        String name;
        String surname;
        int courses;
        double everageMarkMath;
        double everageMarkEconomic;
        double everageMarkForeignLan;


        Student(int id1, String name1, String surname1, int courses1, double everageMarkMath1, double everageMarkEconomic1,
                double everageMarkForeignLan1) {
            id = id1;
            name = name1;
            surname = surname1;
            courses = courses1;
            everageMarkMath = everageMarkMath1;
            everageMarkEconomic = everageMarkEconomic1;
            everageMarkForeignLan = everageMarkForeignLan1;
        }

        Student(int id2, String name2, String surname2, int courses2) {
            this(id2, name2, surname2, courses2, 0.0, 0.0, 0.0);
        }

        Student() {

        }
    }
    class StudentTest{
        public static void main(String[] args) {
            Student st1=new Student();
            Student st2 = new Student(1,"Andrey","Petrov",1,5,6,7);
            Student st3 = new Student(2,"Artem","Sapun",3,7,8,9);
        }
    }


