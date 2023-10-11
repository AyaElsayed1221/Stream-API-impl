import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example4 {

    public static void main(String[] args) {
        /** flatMap **/

        /**
         *You transform something to a stream
         * what happens is that with a flatmap you transform something to a stream
         * S, it is used basically when u have such kind of input that can be output as a stream
         * so, you can process afterwords not the element itself, but what is inside this element
         */

        //example:
        List<List<Integer>> list =List.of(
                List.of(1,2,3),
                List.of(4,5,6),
                List.of(7,8,9)
        );

       var res = list.stream()                     // [1, 2, 3], [4, 5, 6], [7, 8, 9]    Stream of lists<Integer>
            .flatMap(x -> x.stream())         // 1, 2, 3, 4, 5, 6, 7, 8, 9    Stream of integers
            //.forEach(System.out::println);
            .reduce(0,(a,b)-> a+b);

       // System.out.println(res);


        /**
         * flatMap() V/s map() :
         * 1) map() takes a Stream and transform it to another Stream. It applies a function on each element of Stream and store return value into new Stream. It does not flatten the stream. But flatMap() is the combination of a map and a flat operation i.e, it applies a function to elements as well as flatten them.
         * 2) map() is used for transformation only, but flatMap() is used for both transformation and flattening.
         **/

        //The flatMap() can also change the type of the stream not just the value
        //flatMap()
        //flatMapToInt()
        //flatMapToDouble()



        /******************************************** Challenge :) **************************************************************/

        /***
         * I want to count the number of digits exist in the list of string
         */

        List<String> l1 = List.of("Room1", "2nd floor", "3 spoons of Sugar","4 pars of chocolate");

        String digits = "123456789";

        var y = l1.stream()
                        .flatMap(s -> Arrays.stream(s.split("")))
                        .filter(s -> digits.contains(s))
                        .map(s -> Integer.parseInt(s))
                        .reduce(0,(a,b) -> a+b);

                     //.forEach(System.out::println);
                        //.count(); //return Long and It counts how many elements have reached here  //4

        System.out.println(y);
    }


}
