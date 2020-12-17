import java.util.Arrays;
public class Tester {
  public static boolean DEBUG = true;
  // TURN OFF BEFORE SUBMITTING

  public static void dprint(int[] array){
    if(DEBUG){
      System.out.println(Arrays.toString(array));
    }
  }

  public static void main(String[]args){
    int[] array = {100, 2, 5, 10};
    int[] array2 = {5,2,-12,5,16};
    int[] array3 = {1,2,3,4,5};
    Sorts.bubbleSort(array2);
    Sorts.bubbleSort(array);
    Sorts.bubbleSort(array3);
  }
}
