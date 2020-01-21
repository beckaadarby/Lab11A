public class Example{
  public static void main(String agrs[]){
    int[] nums = new int[100];
    displayArray(nums);

    for(int k=2; k< nums.length; k = 2*k){
      nums[k] = 1;
    }
    displayArray(nums);
  }
    public static void displayArray(int[] arr){
      for(int k=0; k<arr.length; k++){
      System.out.println(k + " " + arr[k]);
    }
  }
}
