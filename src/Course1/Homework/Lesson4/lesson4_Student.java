package Course1.Homework.Lesson4;

public class lesson4_Student {

        int studentIDNubmber;
        String name;
        String Family;
        int YearOfStudy;
        double everageMarkMath;
        double everageMarkEconomic;
        double everageMarkForeignLan;


    }
    class StudentTest1 {
        public static void main(String[] args) {

            lesson4_Student student1 = new lesson4_Student();
            lesson4_Student student2 = new lesson4_Student();
            lesson4_Student student3 = new lesson4_Student();

            student1.studentIDNubmber = 1;
            student1.name = "Artem";
            student1.Family = "Sapun";
            student1.YearOfStudy = 1;
            student1.everageMarkMath = 7;
            student1.everageMarkEconomic = 8;
            student1.everageMarkForeignLan = 8;
            double result1 = (student1.everageMarkMath + student1.everageMarkEconomic+ student1.everageMarkForeignLan) /3;


            student2.studentIDNubmber = 2;
            student2.name = "Andrey";
            student2.Family = "Krivoy";
            student2.YearOfStudy = 2;
            student2.everageMarkMath = 8;
            student2.everageMarkEconomic = 9;
            student2.everageMarkForeignLan = 10;
            double result2 = (student2.everageMarkMath+ student2.everageMarkEconomic+ student2.everageMarkForeignLan)/3;


            student3.studentIDNubmber = 3;
            student3.name = "Kirill";
            student3.Family = "Kosoy";
            student3.YearOfStudy = 3;
            student3.everageMarkMath = 5;
            student3.everageMarkEconomic = 6;
            student3.everageMarkForeignLan = 6;
            double result3 = (student3.everageMarkMath+ student3.everageMarkEconomic+ student3.everageMarkForeignLan)/3;


            System.out.println("Student: "+ student1.name+" "+ student1.Family);
            System.out.println("Student ID: " + student1.studentIDNubmber);
            System.out.println("Everage mark: "+ result1);
            System.out.println("");

            System.out.println("Student: "+ student2.name+" "+ student2.Family);
            System.out.println("Student ID: " + student2.studentIDNubmber);
            System.out.println("Everage mark: "+ result2);
            System.out.println("");

            System.out.println("Student: "+ student3.name+" "+ student3.Family);
            System.out.println("Student ID: " + student3.studentIDNubmber);
            System.out.println("Everage mark: "+ result3);
        }
}
