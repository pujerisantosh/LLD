package dMGJavaDeveloper.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class getDistinctNumbers {

    public static List<Integer> solve(List<Integer> numbers){


        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 2, 3, 4, 3, 5};
        List<Integer> num = Arrays.asList(numbers);
        System.out.println(solve(num));
    }
}
