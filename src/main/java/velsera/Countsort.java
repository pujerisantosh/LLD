package velsera;

public class Countsort {

    public static int[] solve(int[] a){
        //find the max values

        int max = a[0];
        for (int i=1;i<a.length;i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        //count


        int [] count  = new int [max+1];
        for (int i=0;i<a.length;i++){
            count[a[i]]++;
        }

        int index =0;
        for (int i=0;i<count.length;i++){
            while (count[i]> 0){
                a[index] = i;
                index++;
                count[i]--;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int [] arr = {4,6,1,1,2,3};
        int[] sorted = solve(arr);
        for (int num : sorted){
            System.out.print(num + " ");
        }
    }
}
