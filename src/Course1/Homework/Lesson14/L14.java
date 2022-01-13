package Course1.Homework.Lesson14;

public class L14 {
    void time(){
        OUTER: for(int chas = 0;chas<7;chas++){
        INNER1:for (int minuta = 0;minuta<=59;minuta++){
            if (chas>1 && minuta%10==0){
                break OUTER;
            }
            INNER1_2: for (int secunda = 0;secunda<=59;secunda++){
                if (secunda*chas>minuta){
                    continue INNER1;
                }
                System.out.println(chas+":"+minuta+":"+secunda);
            }
        }
        }
    }

    public static void main(String[] args) {
        L14 t = new L14();
        t.time();
    }
}
