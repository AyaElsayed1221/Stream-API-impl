import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example6 {

    public static void main(String[] args) {

        //sort(Comparator)
        List<Integer> l2 = List.of(9,9,1,4,2,4,3,8);
        Comparator<Integer> c1 = Collections.reverseOrder();

        l2.stream()
                .distinct()
                .sorted(c1)
                .forEach(System.out::println);
    }
}
