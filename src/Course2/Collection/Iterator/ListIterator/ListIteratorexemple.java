package Course2.Collection.Iterator.ListIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorexemple {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch :s.toCharArray()){
            list.add(ch);
        }
        ListIterator <Character> iterator = list.listIterator();
        ListIterator <Character> reverseiterator = list.listIterator(list.size());
        boolean isPolinndrom = true;
        while (iterator.hasNext() && reverseiterator.hasPrevious()){
            if (iterator.next() !=reverseiterator.previous()){
                isPolinndrom=false;
                break;
            }
        }
        if (isPolinndrom){
            System.out.println("polindrom");
        }else {
            System.out.println("Not polindrom");
        }
    }

}
