public class Sorts{

  public static int findSmall(int[] ary, int start) {
    int x = 0;
    for (int i = start; i < ary.length - 1; i ++) { //keeps repeating until find min of all numbers
      x = Math.min(ary[i], ary[i + 1]); //find min between two numbers
    }
    return x;
  }

  public static void selectionsort(int [] ary) {
    for (int i = 0; i < ary.length; i ++) {  //does it until you finish the going through the array
      ary[i] = findSmall(ary, i); //set i element equal to the smallest
    }
  }

/*choose the smallest put it into ary[0]
choose the next smallest put it into ary[1]  (you can ignore the slots before the current position)
choose the next smallest put it into ary[2]  (you can ignore the slots before the current position)*/
}
