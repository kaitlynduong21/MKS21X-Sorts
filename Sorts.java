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
      System.out.println(printArray(ary));
    }
  }

  public static String printArray(int[] ary) {
    String output = "[";
    for(int i=0; i<ary.length-1; i++) {
      output += ary[i] + ", ";
    }
    return output += ary[ary.length-1] + "]";
}

public static void bubbleSort(int[] ary) {
  for (int i = 0; i < ary.length; i ++) {
    for (int j = 0; j < ary.length - i - 1; j ++) {
    if (ary[j] > ary[j + 1] ) {
      int old = ary[j];
      ary [j] = ary [j + 1];
      ary[j + 1] = old;
    }
    //System.out.println(printArray(ary));
    }
  }
}

public static void main(String[] args) {
  /*int[] ary = new int[Integer.parseInt(args[0])];
  for (int i = 0; i < ary.length; i ++) {
    ary[i] = randgen
  }*/
  String sorted = "";
  int[] test_a = {5, 1, 8, 4, 9, 6, 7, 2, 3};
  System.out.println(printArray(test_a));
  bubbleSort(test_a);
  sorted = printArray(test_a);
  System.out.println(sorted);
}


/*public static void main(String[] args) {

    // Google random int generator

    String sorted = "";
    int[] test_a = {5, 1, 8, 4, 9, 6, 7, 2, 3};
    System.out.println(printArray(test_a));
    selectionSort(test_a);
    sorted = printArray(test_a);
    System.out.println(sorted);

    int[] test_b = {5, 1, 12, -5, 16, 2, 12, 14};
    System.out.println(printArray(test_b));
    selectionSort(test_b);
    sorted = printArray(test_b);
    System.out.println(sorted);

    // 8 nums, [0:10]
    int[] test_a = { 3, 4, 7, 1, 6, 2, 8, 6 };
    System.out.println(printArray(test_a));               // [3, 4, 7, 1, 6, 2, 8, 6]




    sorted = printArray(test_a);
    System.out.println(sorted);               // [1, 2, 3, 4, 6, 6, 7, 8]

    if(sorted.equals("[1, 2, 3, 4, 6, 6, 7, 8]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    // 12 nums, [0:20]
    int[] test_b = { 17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17 };
    System.out.println(printArray(test_b));   // [17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17]

    selectionSort(test_b);

    sorted = printArray(test_b);
    System.out.println(sorted);               // [1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]

    if(sorted.equals("[1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    // 20 nums, [0:100]
    int[] test_c = { 14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52 };
    System.out.println(printArray(test_c));   // [14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52]

    selectionSort(test_c);

    sorted = printArray(test_c);
    System.out.println(sorted);               // [1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]

    if(sorted.equals("[1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }*/
  }
