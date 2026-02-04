package dMGJavaDeveloper.streams;

import java.util.Arrays;
import java.util.List;

public class areAllEven {
    public static boolean solve(List<Integer> numbers){
        return numbers.stream()
                .allMatch(n -> n %2 == 0);

    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> numbers = Arrays.asList(arr);
        System.out.println(solve(numbers));
    }
}
