import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class task1 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("первый");
        al.add("второй");
        al.add("третий");
        al.add("четвертый");
        al.add("первый");
        al.add("первый");
        al.add("второй");
        al.add("первый");
        al.add("третий");
        al.add("пятый");


        System.out.println(al);

//        HashSet<String> hs = new HashSet<>(al); //уникальные элементы без подсчета
//        System.out.println(hs);

        amountElIsArr(al);

    }
//считает и выводит уникальные элементы
    public static void amountElIsArr(ArrayList arrL) {
        HashMap<String, Integer> hm = new HashMap();

        for (int i = 0; i < arrL.size(); i++) {
            if (hm.containsKey(arrL.get(i))) {
                hm.computeIfPresent((String) arrL.get(i), (k, v) -> v + 1);
            } else {
                hm.put((String) arrL.get(i), 1);
            }
        }
        System.out.println(hm);

    }
}
