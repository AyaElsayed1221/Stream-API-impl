import java.util.ArrayList;
import java.util.List;

public class Example7 {


    /**
     *  skip()
     *  peek()
     **/


    /**
     * Rule of the thumb: We don't use any method inside the stream to change values outside the stream (that is NOT RECOMMENDED).
     **/

    public static void main(String[] args) {

        //skip() : used to skip number of values in the stream and you can use the skip method multiple times.

        List<Integer> l1 = List.of(3,1,8,5,9,4,7,2,6);

        l1.stream()  // 3,1,8,5,9,4,7,2,6
           .skip(4);//skip the first 4 ->    9,4,7,2,6
           //.forEach(System.out::println);

     /*********************************************************************************************/

     // peek() : doesn't affect the stream, it just consumes the values inside the stream.
        //Stream<T> peek(Consumer<? super T> action)
        //Here, Stream is an interface and T is the type of stream element.
        // action is a non-interfering action to perform on the elements as they are consumed from the stream
        // and the function returns the new stream.

        /** non-interfering action:
         * Streams enable you to execute possibly-parallel aggregate operations over a variety of data sources,
         * including even non-thread-safe collections such as ArrayList.
         * This is possible only if we can prevent interference with the data source during the execution of a stream pipeline.
         **/

        l1.stream()  // 3,1,8,5,9,4,7,2,6
                .peek(x -> System.out.println(x)) //it takes a consumer, and doesn't affect the stream it just consumes the stream elements and return it without any change.
                .forEach(System.out::println); // 3,1,8,5,9,4,7,2,6


        /** challenge:
         * you have an input list containing integers
         * you need to collect the even integers and put them in the output list using peek()
         * Note: using peek() method is not recomended in this case instead u have to use the collector, but is just for practice
         */

        List<Integer> outputList = new ArrayList<>();
        l1.stream()
           .filter(x -> x%2 == 0)
           .peek(x -> outputList.add(x))
           .forEach(System.out::println);

        System.out.println(outputList);
    }
}
