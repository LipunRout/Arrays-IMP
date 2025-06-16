public class LargestNumber {

      public static int Large(int[] Arr) {
            int lg=Integer.MIN_VALUE;// -infinity
            for(int i=0;i<Arr.length;i++){
                  if(lg<Arr[i]){
                        lg=Arr[i];
                  }
            }
           return lg; 
      }
      public static int Small(int[] Arr) {
            int sm=Integer.MAX_VALUE;// +infinity
            for(int i=0;i<Arr.length;i++){
                  if(sm>Arr[i]){
                        sm=Arr[i];
                  }
            }
           return sm; 
      }
      public static void main(String[] args) {
            int[] arr={2,3,4,5,6,22};
            System.out.println("The LArgest NUmber IS : " + Large(arr));     
            System.out.println("The LArgest NUmber IS : " + Large(arr));
      }
}
