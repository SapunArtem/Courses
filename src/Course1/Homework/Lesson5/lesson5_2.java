package Course1.Homework.Lesson5;

public class lesson5_2 {


        int studentIDNubmber;
        String name;
        String Family;
        int YearOfStudy;

        double everage(double Math, double Economic, double Foreign) {
            double result = (Math +Economic + Foreign)/3;
            return result;
        }
}
class StudentTest {
    public static void main(String[] args) {

        lesson5_2 student1 = new lesson5_2();
        lesson5_2 student2 = new lesson5_2();
        lesson5_2 student3 = new lesson5_2();

        student1.studentIDNubmber = 1;
        student1.name = "Artem";
        student1.Family = "Sapun";
        student1.YearOfStudy = 1;


        student2.studentIDNubmber = 2;
        student2.name = "Andrey";
        student2.Family = "Krivoy";
        student2.YearOfStudy = 2;


        student3.studentIDNubmber = 3;
        student3.name = "Kirill";
        student3.Family = "Kosoy";
        student3.YearOfStudy = 3;


        System.out.println("Student: " + student1.name + " " + student1.Family);
        System.out.println("Student ID: " + student1.studentIDNubmber);
        System.out.println("Everage mark: " + student1.everage(5,6,6));
        System.out.println("");

        System.out.println("Student: " + student2.name + " " + student2.Family);
        System.out.println("Student ID: " + student2.studentIDNubmber);
        System.out.println("Everage mark: " + student3.everage(8,8,5));
        System.out.println("");

        System.out.println("Student: " + student3.name + " " + student3.Family);
        System.out.println("Student ID: " + student3.studentIDNubmber);
        System.out.println("Everage mark: " + student3.everage(9,8,10));
    }

}




