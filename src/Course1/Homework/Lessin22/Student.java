package Course1.Homework.Lessin22;

public class Student {
    StringBuilder name = new StringBuilder();
    int course;
    int grade;

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }

    public void setName(StringBuilder i) {
        if (i.length()>3){
            name = i;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int i) {
        if (i>0 && i<11){
            course = i;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int i) {
        if (i>0 && i<5){
            grade = i;
        }
    }

    public void showInfo(){
        System.out.println("Name: "+ getName()+" "+"Course: "+getCourse()+" "+"Grade: "+getGrade());
    }
}

class TestStudent{
    public static void main(String[] args) {
        Student st = new Student();
        st.setName(new StringBuilder("ivan"));
        st.setCourse(5);
        st.setGrade(3);
        st.showInfo();
    }
}
