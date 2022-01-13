package Course1.Homework.Lesson16;

public class Mail {
   void email(String mail){
        String s = mail;
if (mail.contains("@yahoo.com;") ){
    System.out.println(mail.replace(mail,"yahoo"));
}else if(mail.contains("@mail.com;")){
    System.out.println(mail.replace(mail,"mail"));
}else if (mail.contains("@gmail.com;")){
    System.out.println(mail.replace(mail,"gmail"));
}else {
    System.out.println("Вы ввели неверный email");
}

    }

    public static void main(String[] args) {
       Mail s = new Mail();
        s.email("ya@yahoo.com;");
    }
}
