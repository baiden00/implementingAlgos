import java.util.Arrays;

//Binary Search iterative and recursive implementations

public class linearAndBinarySearch{
  public static void main(String[] args) {
    int[] array1 = {3,5,34,22,65,74,232,657,343};
    int[] array2 = {4,15,23,37,41,52,55,77,101,231,543};
    linear_search(array1, 22);
    linear_search(array1, 100);
    binary_search_recursive(array2, 101);
    binary_search_iterative(array2, 101);
  }

  static int linear_search(int[] array, int target){
    for(int i = 0; i < array.length; i++)
    {
      if(array[i]==target){
        System.out.println("Target found at index "+ i + " in " + Arrays.toString(array));
        return i;
      }
    }
    System.out.println("Target not found in " + Arrays.toString(array));
    return -1;
  }

  static int binary_search_recursive(int[] array, int target){
    if(array == null){
      System.out.println("Target not found in array " + Arrays.toString(array));
      return -1;
    }
    int left = 0;
    int right = array.length-1;

    int mid = left + (right - left)/2;

    if(array[mid] == target)
    {
    System.out.println("Target found in array");
    return mid;
  }else if(array[mid] < target){
    int[] new_array = Arrays.copyOfRange(array, mid+1, array.length);
    return binary_search_recursive(new_array, target);
  }else if(array[mid] > target){
    int[] new_array = Arrays.copyOfRange(array, 0, mid-1);
    return binary_search_recursive(new_array, target);
  }
  return -1;


  }

  static int binary_search_iterative(int[] array, int target){
    if(array.length <= 0){
      System.out.println("Target not found in array");
      return -1;
    }
    int l = 0;
    int r = array.length;

    while(l<=r)
    {
      int mid = l + (r-l)/2;
      if(array[mid] == target){
        System.out.println("Element found at index " + mid);
        return mid;
      }else if(array[mid] > target){
        r = mid-1;
      }else{
        l = mid+1;
      }

    }

    System.out.println("Element not found in the array");
    return -1;


  }

}
