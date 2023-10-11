import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class example2 {
    public static void main(String[] args) {
        /** reverse each value on the stream **/

        List<String> list = List.of("Ahmed","Mohammed","Omar","Islam");

      list.stream()  //"Ahmed","Mohammed","Omar","Islam"
          .map(x -> new StringBuilder(x).reverse().toString())  // "demhA" "demmahoM" "ramO" "malsI"
          .forEach(System.out::println);

      //If we didn't write the toString method the stream will return a StreamBuilder not a string and that is also work


    }
}