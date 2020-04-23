import java.util.Arrays;


public class InsertionSort {

  public static void main(String[] args) {
    System.out.println("Hello world!\n"); //Just to test

    int[] arr1 = {10,34,2,56,7,67,88,42};
    int[] arr2 = Insert(arr1);
    for(int i:arr2){
      System.out.print(i);
      System.out.print(" ");
        }
  }

  public static int[] Insert(int[] array){
    int value;
    int pos;


    for(int i=1; i < array.length; i++){
      value = array[i];
      pos = i;

      while(pos > 0 && array[pos-1] > value){
        array[pos] = array[pos-1];
        pos = pos -1;
      }

      array[pos] = value;




    }

    return array;
  }
}
