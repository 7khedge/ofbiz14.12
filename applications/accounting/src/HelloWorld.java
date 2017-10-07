import javolution.util.*;

public class HelloWorld {
    public static void main(String... args) {
        FastList<String> list = FastList.newInstance();
        list.add("Hello");
        list.add("World");
        list.add("How");
        list.add("Are");
        list.add("Hello");
        list.add("You?");
        System.out.println("list = " + list);
        for (String s : list) {
            list.remove("Hello");
            System.out.println("s = " + s);
        }
        System.out.println("list = " + list);
    }
}
