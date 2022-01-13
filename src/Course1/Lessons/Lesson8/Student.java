package Course1.Lessons.Lesson8;

public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String name1, int course1) {
        count++;
        name = name1;
        course = course1;
        System.out.println("student # " + count + " sozdan ");
    }
    public static void showCount(){
        System.out.println("Vsego sozdano studentov = "+count);
    }
        public void showInfo(){
            System.out.println("Welcome to the Student class!!!");
        }

        void abc(){
        a++;
        count++;

        }

        static void abcd(){
        count++;
        Student st2 = new Student("Petor",1);
        st2.a++;
        }
        public static void main(String[] args) {
        abcd();
        Student st3 = new Student("ivan",3);
        st3.abc();

        }
    }

