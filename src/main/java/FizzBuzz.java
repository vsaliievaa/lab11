import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static void fizzBuzzIt(int number) {
        List<Integer> array = IntStream.range(1, number).boxed().collect(Collectors.toList());

        System.out.println("FizzBuzz problem solution for number = " + number + ": ");

        array.forEach(x -> {
            if (x % 15 == 0) {
                System.out.print("fizzbuzz ");
            }
            else if (x % 5 == 0) {
                System.out.print("buzz ");
            }
            else if (x % 3 == 0) {
                System.out.print("fizz ");
            }
            else {
                System.out.print(x + " ");
            }
        });
    }
}
