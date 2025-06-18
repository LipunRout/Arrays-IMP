public class ReverseArray {
  public static void reverse(int[] arr) {
    int st = 0;
    int end = arr.length - 1;
    while (st < end) {
      int temp = arr[st];
      arr[st] = arr[end];
      arr[end] = temp;
      st++;
      end--;
    }
  }
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4 };
    reverse(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
