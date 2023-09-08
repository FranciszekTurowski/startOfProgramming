import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);


        }
        System.out.println(list);
        Integer integer = list.get(2);
        System.out.println(integer);
        int size = list.size();
        System.out.println(size);
        list.clear();
        System.out.println(list);

    }
}
