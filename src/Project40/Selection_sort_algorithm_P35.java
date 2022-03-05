package Project40;

public class Selection_sort_algorithm_P35 {
    public static void main(String[] args) {
    int[] arr = {15,20,45,05,30};
    selectionSort(arr);
    for(int i:arr){
        System.out.println(i);
         }
     }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int index =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index =j;
                }
            }
            int smallNumber = arr[index];
            arr[index]= arr[i];
            arr[i]= smallNumber;
        }
    }
}