import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    static HashMap<String, ArrayList<Integer>> pb = new HashMap<>();

    public static void main(String[] args) {

        add("Alex",123456);
        add("Alex",987747);
        add("Ivan",232323);
        add("Petr",349403);
        add("Max",230922);
        add("Boris",857537);
        add("Boris",858637);

        System.out.println(pb.get("Alex"));//получение по имени
        System.out.println(pb);
    }

    public static void add(String name, Integer num) {

        if (pb.containsKey(name)) {
            ArrayList<Integer> arr1 = pb.get(name);
            arr1.add(num);
            pb.put(name, arr1);
        } else {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(num);
            pb.put(name, arrayList);
        }
    }





}
