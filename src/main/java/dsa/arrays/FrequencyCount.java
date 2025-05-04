package dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i=0;i<n;i++){
            arr[i]  = sc.nextInt();

        }

        FrequencyCount f = new FrequencyCount();
        int[] res = f.solve(arr);
        System.out.println(Arrays.toString(res));


    }

    public  int[] solve(int[] A){
        int n = A.length;
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
            int frequency =0;
            for (int j=0;j<n;j++){
                frequency++;
                if (A[i]==A[j]){
                    frequency++;

                }
            }

            arr[i] = frequency;
        }

        return arr;

    }


}
