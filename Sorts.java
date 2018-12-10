import java.util.*;

public class Sorts{

  public static void selectionSort(int [] ary) {
    for (int i = 0; i < ary.length - 1; i ++) {
      int min = ary[i];
      int index = i;
      for (int j = i; j < ary.length; j ++) { //keeps repeating until find min of all numbers
        if (ary[j] < min) {
          min = ary[j]; //sets min if it is less
          index = j; // set index equal to the index of the smallest integer
        }
      }
      ary[index] = ary[i]; //set element at the index of the min to the element of the index you are replacing
      ary[i] = min; //set element to the minimum of the ary to the right of the specfied index
      //System.out.println(printArray(ary));
    }
  }

  public static String printArray(int[] ary) {
    String output = "[";
    for(int i=0; i<ary.length-1; i++) {
      output += ary[i] + ", ";
    }
    return output += ary[ary.length-1] + "]";
  }

  public static void bubbleSort(int[] data) {
    for (int i = 0; i < data.length; i ++) {
      for (int j = 0; j < data.length - i - 1; j ++) {
        if (data[j] > data[j + 1] ) {
          int old = data[j];
          data [j] = data [j + 1];
          data[j + 1] = old;
        }
        //System.out.println(printArray(ary));
      }
    }
  }

  public static void insertionSort(int[] data) {
    for (int i = 1; i < data.length; i ++) {
      int old = data[i];
      for (int j = i - 1; j >= 0; j --) {
        if (old <= data[j]) {
          data[j + 1] = data[j];
          if (j == 0) {
            data[j] = old;
          }
        }
        if (old > data[j]) {
          data[j + 1] = old;
          j = -1;
        }
      }
      //System.out.println(printArray(data));
    }
  }

  public static void main(String[] args) {
    /*if (args.length == 1) {
      int[] ary = new int[Integer.parseInt(args[0])];
      Random randgen = new Random();
      for (int i = 0; i < ary.length; i ++) {
        ary[i] = randgen.nextInt();
      }
      selectionSort(ary);
    }
    if (args.length == 1) {
      int[] ary = new int[Integer.parseInt(args[0])];
      Random randgen = new Random();
      for (int i = 0; i < ary.length; i ++) {
        ary[i] = randgen.nextInt();
      }
      bubbleSort(ary);
    }*/
    String sorted = "";
    int[] test_a = {4, 3, 2, 10, 12, 1, 5, 6};
    System.out.println(printArray(test_a));
    insertionSort(test_a);
    sorted = printArray(test_a);
    System.out.println(sorted);
  }

}
