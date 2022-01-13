package Course1.Homework.Lesson15;

public class L15 {
    void time(){
        int chas =0;

        OUTER: while (chas<7){
        int minuta = -1;
            MIDDLE:do {
                minuta++;
                if (chas>1 && minuta%10==0){
                    break OUTER;
                }
                int secunda = 0;
                INNER: while (secunda<=59){

                    if (secunda*chas>minuta){
                        continue MIDDLE;
                    }
                    System.out.println(chas+":"+minuta+":"+secunda);
                    secunda++;
                }
            }while (minuta<59);
            chas++;
        }
    }

    public static void main(String[] args) {
        L15 t = new L15();
        t.time();
    }
}
