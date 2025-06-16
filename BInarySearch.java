public class BInarySearch {

      public static int Bsearch(int[] Arr, int Key) {
            int st=0;
            int end=Arr.length-1;

            while(st<=end){
                  int mid = st+end / 2;
                  if (Arr[mid] == Key) {
                        return mid;
                  }
                  else if(Arr[mid]<Key){
                        st=mid+1;
                  }
                  else{
                        end=mid-1;
                  }
            }
            return -1;
      }
      public static void main(String[] args) {
            int[] arr = { 1,2,3,4,5,6,7,8,9 };
            int key = 2;
            System.out.println(Bsearch(arr, key));

      }
}
