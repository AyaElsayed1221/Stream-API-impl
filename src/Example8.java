import java.util.List;

public class Example8 {
    /**
     * takeWhile()
     * dropWhile()
     **/

    public static void main(String[] args) {

        // takeWhile(Predicate): means take the elements from the stream while the predicate is true.
        //example:
        List<Integer> l1 = List.of(1,30,44,100,101,2,1,300);

//        l1.stream()
//          .takeWhile(x -> x <= 100)
//          .forEach(System.out::println);


        /***********************************************************/

        //dropWhile(Predicate): Is the opposite of takeWhile(), it will drop all the elements from the stream while the predicate is true.
        //example:
        List<Integer> l2 = List.of(1,30,44,100,101,2,1,300);

        l2.stream()
                .dropWhile(x -> x <= 100)
                .forEach(System.out::println);

    }
}
