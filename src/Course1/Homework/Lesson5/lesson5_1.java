package Course1.Homework.Lesson5;

public class lesson5_1 {

        double popolnenieScheta(double popolnenie){
            popolnenie += balance;
            return popolnenie;

        }
        double snytieScheta(double snytie){
            snytie += balance;
            return snytie;

        }

        int id ;
        String name;
        double balance;

        public static void main(String[] args) {

            lesson5_1 MyAccount = new lesson5_1();
            lesson5_1 YourAccount = new lesson5_1();

            lesson5_1 HisAccount = new lesson5_1();

            MyAccount.id = 1;
            MyAccount.name = "Artem";
            MyAccount.balance = 15.15;
            double plusSchet1 = MyAccount.popolnenieScheta(200.5);
            double minusSchet1 = MyAccount.snytieScheta(120.0);
            System.out.println(MyAccount.name+" popolnil schet: "+plusSchet1);
            System.out.println(MyAccount.name+" snyal so scheta: "+minusSchet1);

            YourAccount.id = 2;
            YourAccount.name = "Andrey";
            YourAccount.balance = 20.20;
            double plusSchet2 = YourAccount.popolnenieScheta(200.5);
            double minusSchet2 = YourAccount.snytieScheta(120.0);
            System.out.println(YourAccount.name+" popolnil schet: "+plusSchet2);
            System.out.println(YourAccount.name+" snyal so scheta: "+minusSchet2);

            HisAccount.id = 3;
            HisAccount.name = "Kirill";
            HisAccount.balance = 30.30;
            double plusSchet3 = HisAccount.popolnenieScheta(200.5);
            double minusSchet3 = HisAccount.snytieScheta(120.0);
            System.out.println(HisAccount.name+" popolnil schet: "+plusSchet3);
            System.out.println(HisAccount.name+" snyal so scheta: "+minusSchet3);
        }
    }

