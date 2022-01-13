package Course1;

public class StroySberejeniya {
    //Вклад с фиксированной ставкой,капитализацией и пополнением.

    public static void vklad(final int srok,final int summaVklada,int summaPopolneniya,final double stavka){
        double procentOtSum =0;
        double summa=0;
        summa+=summaVklada;
        for (int i = 1;i<=srok-1;i++) {

                summa +=summaPopolneniya + (summa / 100) * (stavka / 12);


        }
        summa+=(summa / 100) * (stavka / 12);


        System.out.println("Сумма вклада :          "+summaVklada);
        System.out.println("Ставка :                "+stavka);
        System.out.println("Сумма пополнения :      "+summaPopolneniya*(srok-1));
        System.out.println("Сумма в конце срока :   "+summa);
        System.out.println("Прибыль :               " + (summa - summaPopolneniya * (srok-1) - summaVklada));
    }

    public static void main(String[] args) {
        vklad(36,1400,1400,10);
    }
}
