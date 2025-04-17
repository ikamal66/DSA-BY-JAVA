package _017_Basic_Sorting_;

public class _02_Bubble_Sort_anotherMethod {
    public static void main(String[] args) {
        int arr[] = {6,3,7,8,1};
        int swap = 0;

        System.out.println("Before Sorting");
        for(int elements: arr){
            System.out.print(elements+"|");
        }

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                swap++;
                }
            }
                System.out.println();
                for(int elements: arr){
                    System.out.print(elements+"|");
            }
        }
            System.out.println("\nTotal swap = "+swap);

        System.out.println("\nAfter Sorting");
        for(int elements: arr){
            System.out.print(elements+"|");
        }
    }
}
