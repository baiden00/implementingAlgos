import java.util.Arrays;

public class Quicksort{
  public static void main(String[] args) {
    int[] arrayz = {219,929,270,41,636,28,44,728,871,191,314,764,58,858,853,97,212,21,442};
    quicksort(arrayz, 0, arrayz.length-1);
    System.out.println(Arrays.toString(arrayz));

  }

  static int partition(int[] array, int start, int end){
    int pivot = array[start];
    int left = start+1;
    int right = end;

    while(true){
      while(left<=right && array[left]<= pivot){
        left+=1;
      }

      while(left<=right && array[right] >= pivot){
        right-=1;
      }

      if(left<=right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;

      }else{
        break;
      }

    }

    int temp = array[right];
    array[right] = array[start];
    array[start] = temp;

    return right;
  }

  static void quicksort(int[] array, int start, int end){
    if(start >= end){
      return;
    }else{
      int p = partition(array, start, end);
      quicksort(array, start, p-1);
      quicksort(array, p+1, end);

    }
  }
}
