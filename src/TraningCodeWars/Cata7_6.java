package TraningCodeWars;

public class Cata7_6 {
    public static int abc(int x,int y){
        int bOtx=x-1;
        int bOty=y-1;

        if (x<=y && y%x==0){
            return x;
        }else if(y<=x && x%y==0){
            return y;
        }else if (x<y){
            while (y%bOtx!=0 && x%bOtx!=0){
                bOtx--;
            }
            return bOtx;
        }while (y<x && x%bOty!=0 && y%bOty!=0 ){
            bOty--;
        }
        return bOty;
    }

    public static void main(String[] args) {
        int i = abc(12,10);
        System.out.println(i);
    }
}
