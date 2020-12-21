public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    for (int j = data.length-1; j > 0; j--) {
      int count = 0;
      for (int i = 0; i < j; i++) {
        if (data[i] > data[i+1]) {
          int temp = data[i];
          data[i] = data[i+1];
          data[i+1] = temp;
          count++;
        }
      }
      if (count == 0) {
        j = 0; //stops it if no passes since count is 0
      }
      // Tester.dprint(data); //USED FOR TESTING
    }
  }

  /**selection sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data - the elements to be sorted.
  */
   public static void selectionSort(int[] data){
     for (int j = 0; j < data.length; j++) {
       int min = data[j];
       for (int i = j; i < data.length; i++) {
         if (data[i] < min) {
           min = data[i];
           data[i] = data[j];
           data[j] = min;
         }
       }
       // Tester.dprint(data); //TURN OFF USED FOR TESTING ONLY
     }
   }

   /**insertion sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data - the elements to be sorted.
  */
   public static void insertionSort(int[] data){
     for (int j = 1; j < data.length; j++) {
       int current = data[j];
       for (int i = j-1; i >= 0; i--) {
         while (data[i] > current) {
           data[i+1] = data[i];
           data[i] = current;
         }
       }
       // Tester.dprint(data);
     }
   }

}
