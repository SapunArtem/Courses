package Course1.Homework.Lesson13;

public class Month {
    int number;
static void monthNumber(int n){
    switch (n){

        case 2:
            System.out.println("В феврале 28 дней");
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("В этом месяце' 30 дней");
            break;
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("В этом месяце 31 дней");
            break;

        default:
            System.out.println("такого месяца не существует");
    }
}

    public static void main(String[] args) {
        monthNumber(2);
    }
}
