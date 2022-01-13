package TraningCodeWars;

import java.util.List;

public class Cata8_4 {
    public static String howMuchILoveYou(int nb_petals) {
        List<String> array = List.of("I love you", "a little", "a lot", "passionately", "madly", "not at all");
        if (nb_petals > 6 && nb_petals % 6 != 0) {
            return array.get((nb_petals % 6) - 1);
        } else if (nb_petals % 6 == 0){
            return array.get(5);
    }
        return array.get(nb_petals - 1);
    }

    public static void main(String[] args) {
        String s = howMuchILoveYou(12);
        System.out.println(s);

    }
    }
