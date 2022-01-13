package Course1.Lessons.Lesson20;

import java.util.HashMap;
import java.util.Map;

public class Test11 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(777,"Ivanov Mihail");
        map.put(778,"Sapun Artem");
        map.put(779,"Sapun Kirill");
        map.put(780,"Sapun Andrey");
        map.remove(777);
        System.out.println("map: = "+map);
    }
}
