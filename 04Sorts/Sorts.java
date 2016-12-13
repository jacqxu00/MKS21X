public class Sorts{

  public static String name(){
    return "10.Xu.Jackie"; 
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data the elements to be sorted.
  */
  public static void selectionSort(int[] data){
      for (int i = 0; i < data.length - 1; i++) {
	  int smallest = data[i];
	  int j = i;
	  while (j < data.length - 1) {
	      if (data[j] < smallest) {
		  smallest = data[j];
	      }
	      j++;
	  }
	  if (smallest != data[i]) {
	      data[j] = data[i];
	      data[i] = smallest;
	  }
      }
  }

}
