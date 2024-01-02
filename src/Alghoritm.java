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

  // Best time - O(n * log n) Bad time - O(n2)
  public static int[] quickSort(int[] nums) {
    if (nums.length < 2) {
      return nums;
    }

    quickSorting(nums, 0, nums.length - 1);
    return nums;
  }

  private static void quickSorting(int[] nums, int low, int high) {
    if (low < high) {
      int pivotIndex = partition(nums,low,high);
      quickSorting(nums, low, pivotIndex - 1);
      quickSorting(nums,pivotIndex + 1, high);
    }
  }

  private static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
      if(arr[j] <= pivot) {
        i++;
        swap(arr,i,j);
      }
    }

    swap(arr,i + 1, high);
    return i + 1;
  }
  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
