import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example5 {

    /**
     * distinct()
     * sort()
     * sort(Comparator)
     **/
    public static void main(String[] args) {

        List<Integer> l1 = List.of(9,9,1,4,2,4,3,8);

        l1.stream()
            .distinct() //extract only the distinct elements
            .sorted() //The Integer class implements the comparable interface as the Integer has the natural order
            .forEach(System.out::println);

    }





}
