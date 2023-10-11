import java.util.List;

public class Example3 {
    public static void main(String[] args) {

        /**
         * In case you know your output will be specific type,
         * they will be of elements of type Integer, Double or Long and u'll do specific operations that relate that type
         * it is easier to u to use  mapToInt(),  mapToDouble() and  mapToLong() to transform the Stream
         * from more General and abstract Stream contract to more particular Stream contract
         * and this is will u perform operations easily on Int, Double and Long
         * **/


        List<String> list1 = List.of("aya","Rahma","mohammed");

        Integer res = list1.stream()   //"aya","Rahma","kasem"

                .mapToInt(x -> x.length())  //3,5,8
                //maoToInt is the same as a map() function,
                // but the output of the map function is a normal Stream
                // and the output of the mapToInt is a IntStream
                //the IntStream is a special type of ObjectStream
                // where it is more specific have the same functions provided to the normal Stream
                // and hase extra functions related specif to int like the sum method instead of using reduce(0,(a,b)->a+b)
                .sum();
                //.reduce(0,(a,b)->a+b);


    /** Stream **/
        // map()            Stream -> Stream
        // mapToInt()       Stream -> IntStream
        // mapToDouble()    Stream -> DoubleStream
        //mapToLong()       Stream -> LongStream

    /** IntStream **/
        // map()            IntStream -> IntStream
        // mapToDouble()    IntStream -> DoubleStream
        //mapToLong()       IntStream -> LongStream
        //mapToObj()        IntStream -> Stream


        list1.stream()   //"aya","Rahma","kasem"

                .mapToInt(x -> x.length())  //3,5,8  IntStream
                .mapToObj(x -> x)   //3,5,8  Stream
                .mapToInt(x -> x)   //3,5,8  IntStream
                .sum();
    }
}
