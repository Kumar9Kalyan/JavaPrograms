//Program for counting frequency of each element in an //array
import java.util.Scanner;

class FrequencyOfElements {
    public static void main(String[] args) {
       System.out.println("Enter size of array: ");
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int arr1[] = new int[size];
       System.out.println("Enter elements: ");
       for(int i=0; i<size; i++){
           arr1[i] = sc.nextInt();
       }
       
      int fr[] = new int[size];
      int visited = -1;
     
      for(int i=0; i<size; i++){
          int count=1;
     
      for(int j=i+1; j<size; j++){
           
          if(arr1[i] == arr1[j]){
              count++;
              fr[j] = visited;
          }
         
      }
       if(fr[i] != visited){
              fr[i] = count;
          }
      }
      System.out.println("----------------");
      for(int i=0; i<size; i++)
      {
          if(fr[i] != visited){
          System.out.printf("Fequency of %d: %d",arr1[i],fr[i]);
          System.out.println();
      }
       
    }
    }
}