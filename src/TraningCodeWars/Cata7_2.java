package TraningCodeWars;

public class Cata7_2 {
            public Long notVisibleCubes(Long n) {
                if (n == 0 || n == 1 || n == 2) {
                    return 0L;
                }
                return ((n - 2)*(n-2)) * (n - 2);

        }

    public static void main(String[] args) {
        Cata7_2 c = new Cata7_2();
        System.out.println(c.notVisibleCubes(4L));
    }
    }


