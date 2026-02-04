package dMGJavaDeveloper.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumberFilter {


    public List<Integer> solve(List<Integer> numbers) {

        return numbers.stream()
                .filter(n-> n%2 != 0)
                .collect(Collectors.toList());


    }

    public static void main(String[] args) {
        OddNumberFilter fl = new OddNumberFilter();
        Integer [] arr = {1,2,3,4,5,6};
        List<Integer> numbers = Arrays.asList(arr);

        System.out.print(fl.solve(numbers));
    }


}