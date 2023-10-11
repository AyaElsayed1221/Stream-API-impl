import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/*
* Note:
* Streams most of the time is not the best approach in performance but, it makes the code more readable
* */

public class Example1 {
    public static void main(String[] args) {
        // Streams consist of three main parts
        // Source
        // Intermediate
        //Terminal

        // We can generate streams i many ways:

        //1. Using stream.empty() function: hich creates an empty stream
        Stream<Integer> s1 = Stream.empty();

        //2. Second way is by using the of() function
        Stream<String> s2 = Stream.of("aya","amal","mohammed");

        //3. using the generate method, but note that the generate method creates INFINITE stream so we have to limit its output
        //The generate method takes a supplier as a parameter
        Stream<Integer> s3 = Stream.generate(()->new Random().nextInt());
        //s3.limit(10).forEach(System.out::println);


        //4. the last method is the iterate method take a seed and a uni-operator
        Stream<Integer> s4 = Stream.iterate(1,n -> n*2);
        //s4.limit(4).forEach(System.out::println);

        //5. another overloaded iterate method take 3 parameters a seed, a predicate that acts as a condition and a uni-operator that acts as an increment
        Stream<Integer> s5 = Stream.iterate(1, n->n>=4, n -> n*2);
        //s5.forEach(System.out::println);

        /*************************************************************************************/

        //We will also review some stream terminals like
        //anyMatch(Predicate p)
        //It returns true if any of the values of the stream matches the predicate
        //example:
        Stream<Integer> st = Stream.of(1,2,3,4);
//        st.anyMatch(x -> x==2);  //true
//
//        //allMatch()
//        st.allMatch(x -> x==2);  //false
//
//        //nonMatch()
//        st.noneMatch(x -> x==2); //false

        /***************************************************************************************/

        //We have 4 maps functions in stream class, map function is a function that take a paramter and convert it to a new output
        //map()
        List<String> list1 = List.of("aya","Rahma","mohammed");
        Integer res = list1.stream()   //"aya","Rahma","kasem"
                .map(x -> x.length())  //3,5,8
                //reduce method takes an identity which is the initial value of the first operator, and it takes a BinaryOperator as a second parameter.
                .reduce(0,(a,b)->a+b);
                // 0 + 3
                // 3 + 5
                // 8 + 8

        System.out.println("res: "+res);

// Make sure tht the stream is a finite before doing in it the operation
        //so the map is an intermediate operation transform the input to the output
        //mapToInt()
        //mapToDouble()
        //mapToLong()
    }
}