package Course1.Homework.Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 0b1100;
        byte b3 = 014;
        byte b4 = 0xC;

        short s1 = 1300;
        short s2 = 0b0101_0001_0100;
        short s3 = 02424;
        short s4 = 0x514;

        int i1 = 0;
        int i2 = 0b0;
        int i3 = 00;
        int i4 = 0x0;

        long l1 = 123456789L;
        long l2 = 0b0111_0101_1011_1100_1101_0001_0101L;
        long l3 = 0726746425L;
        long l4 = 0x75BCD15L;

        float f1 = 2.1f;
        float f2 = 5.5f;

        double d1 = 2.3;
        double d2 = 6.7;

        boolean bool1 = true;
        boolean bool2 = false;

        char c1 = 'a';
        char c2 = '2';
        char c3 = 300;
        char c4 = '\u3456';

        System.out.print(b1+" ");
        System.out.print(b2+" ");
        System.out.print(b3+" ");
        System.out.println(b4);

        System.out.print(s1+" ");
        System.out.print(s2+" ");
        System.out.print(s3+" ");
        System.out.println(s4);

        System.out.print(i1+" ");
        System.out.print(i2+" ");
        System.out.print(i3+" ");
        System.out.println(i4);

        System.out.print(l1+" ");
        System.out.print(l2+" ");
        System.out.print(l3+" ");
        System.out.println(l4);

        System.out.print(f1+" ");
        System.out.println(f2);

        System.out.print(d1+" ");
        System.out.println(d2);

        System.out.print(bool1+" ");
        System.out.println(bool2);

        System.out.print(c1 + " ");
        System.out.print(c2 + " ");
        System.out.print(c3 + " ");
        System.out.print(c4 + " ");

    }
}
