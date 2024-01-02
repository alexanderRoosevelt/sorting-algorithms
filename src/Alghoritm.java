public class Alghoritm {

  // Best Time - O(n) Bad time - O(n2)
  public static void bubbleSort(int[] nums) {
    int size = nums.length;

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
    }
  }

  // Best Time - O(n) Bad time - O(n2)
  public static void insertionSort(int[] nums) {
      int size = nums.length;

      for (int i = 1; i < size; i++) {
        int key = nums[i];
        int j = i - 1;

        while (j >= 0 && nums[j] > key) {
          nums[j + 1] = nums[j];
          j = j -1;
        }
        nums[j + 1] = key;
      }
  }
}
