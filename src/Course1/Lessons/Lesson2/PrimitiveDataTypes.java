package Course1.Lessons.Lesson2;

public class PrimitiveDataTypes {

        public static void main(String[] args) {
            byte b1 = 10;
            byte b2 = 20;
            byte b3 = 100;

            short s1 = 5;
            short s2 = -10;
            short s3 = 0;

            int i1 = 500;

            long l1 = 1000;
            long l2 = 10000000000L;
            long l3 = 53L;

            float f1 = 3.14f;
            float f2 = 2.5f;

            double d1 = 5.5;
            double d2 = 87.65;

            char c1 = 'a';
            char c2 = 'A';
            char c3 = '7';
            char c4 = 300;      // 10-тиричная система счисления
            char c5 = '\u0300'; //ABCDF (16-тиричная система счисления)

            boolean bool1 = true;
            boolean bool2 = false;

            int a1 = 50;
            int a2 = 0b01110;   //число в 2-ичной системе счисления
            int a3 = 0B01110;   // регистр буквы Bb не имеет значения
            int a4 = 074;       // запись 8-миричной системы счисления(после 0 кампилятор все понимает)
            int a5 = 0x3c;      // запись 16-тиричной системы счисления

            int a6 = 1_000_000;     // нижнее подчеркивание используется для удобства


            System.out.println(a4);

        }
    }

