import java.util.Scanner;

class CopyingArrayElements {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of array: " );
       int size = sc.nextInt();
       int arr1[] = new int[size];
       for(int i=0; i<size; i++){
           System.out.println("Enter element: ");
           arr1[i] = sc.nextInt();
       }
       int arr2[] = new int[size];
       for(int j=0; j<size; j++){
           arr2[j] = arr1[j];
       }
       for(int i=0; i<size; i++){
           System.out.println("Elements in 1st array are: "+ arr1[i]);

       }
        for(int j=0; j<size; j++){
           System.out.println("Elements in 2nd array are: "+ arr2[j]);

       }
       
    }
}