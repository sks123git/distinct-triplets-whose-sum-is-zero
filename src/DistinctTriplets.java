import java.util.Scanner;
//Program to find triplets integers whose sum is 0
public class DistinctTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int same=0;
        int distinct=0;
        System.out.println("Enter size of array"); //Taking array length
        size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the values");         //Input values in array
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++){
            for (int j = i+1; j < size; j++) {
                for (int k = j+1; k < size; k++) {
                    if(array[i]+array[j]+array[k]==0){
                        if(array[i]==array[j] || array[j]==array[k] || array[k]==array[i]){  //if condition false numbers are distinct
                            same++;
                        }else {
                            distinct++;
                            System.out.println(array[i] +" "+ array[j] +" " +array[k]);
                        }
                    }
                }
            }
        }
        System.out.println("Number of distinct triplets are: " + distinct);
    }
}