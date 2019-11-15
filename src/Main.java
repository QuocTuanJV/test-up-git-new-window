import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> myMap = new HashMap<>();
        myMap.put(1,"A");
        myMap.put(2,"B");
        List<String> myList = new ArrayList<>(myMap.values());
        System.out.println(myMap.values());
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        Main.printName();
    }

    public static void printName(){
        System.out.println("My name is ");
    }
}
