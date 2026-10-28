import java.util.Arrays;

public class Exp03_sortingof1DArray {
    public static void main(String[] args) {
        int arr[]={12,3,7,1,78,2,56};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] >= arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        System.out.println("Sorted arr is:"+Arrays.toString(arr));
    }
}
