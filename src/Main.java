import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    int [] nums = new int[] {10,2,5,4,8,12,6,7,3};

    // 1) Bubble Sort
    // Alghoritm.bubbleSort(nums);
    // 2) Insert Sort
    // Alghoritm.insertionSort(nums);
    int[] arr = Alghoritm.quickSort(nums);
    System.out.println(Arrays.toString(arr)); //[2, 3, 4, 5, 6, 7, 8, 10, 12]


  }
}