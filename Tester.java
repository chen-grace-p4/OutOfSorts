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
    int[] array3 = {100, 65, 1,2,3,4,5, -300};
    int[] array4 = {6,1,2,3,4,5};
    int[] array5 = {1,2,3,4,5};
    int[] array6 = {10,9,8,7,6,5,4,3,2,1};
    int[] array7 = {2,2,2,5,5,6,1,1,1};
    int[] array8 = {};

    // Sorts.bubbleSort(array2);
    // Sorts.bubbleSort(array);
    // Sorts.bubbleSort(array3);
    // Sorts.bubbleSort(array4);
    // Sorts.bubbleSort(array5);
    // Sorts.bubbleSort(array6);
    // Sorts.bubbleSort(array7);
    // Sorts.bubbleSort(array8);

    // Sorts.selectionSort(array2);
    // Sorts.selectionSort(array);
    // Sorts.selectionSort(array3);
    // Sorts.selectionSort(array4);
    // Sorts.selectionSort(array5);
    // Sorts.selectionSort(array6);
    // Sorts.selectionSort(array7);
    // Sorts.selectionSort(array8);
    //
    Sorts.insertionSort(array2);
    Sorts.insertionSort(array);
    Sorts.insertionSort(array3);
    Sorts.insertionSort(array4);
    Sorts.insertionSort(array5);
    Sorts.insertionSort(array6);
    Sorts.insertionSort(array7);
    Sorts.insertionSort(array8);

    // int[] A = {4,3,2,10,12,1,5,6};
    // int[] B = {4,3,2,10,12,1,5,6};
    // Sorts.insertionSort(A);
    // // Sorts.insertionSort(array);
    // System.out.println(" ");
    // Sorts.selectionSort(B);
    // System.out.println(" ");
    // Sorts.bubbleSort(B);
  }
}
