import java.util.Arrays;

class subArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 4, 9, 0, 11};
        int sum = 9;
        subArray(arr,sum);
    }
public static void subArray(int[] arr, int sum){
    for(int i =0;i<arr.length;i++){
        int temp = 0;
        for(int j =i;j<arr.length;j++){
            temp = temp + arr[j];
             if (temp > sum) {
                    break; 
                }
            if(temp == sum){
                System.out.println("The index for the sum 9 is " +i+","+j);
            }
        }
    }
}
}
