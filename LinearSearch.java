// public class LinearSearch {
//       public static int LSearch(int[] Arr,int key){
//             for (int i=0 ;i<Arr.length;i++){
//                   if(key==Arr[i]){
//                         return i;
//                   }
//             }
//             return -1; // Key NOt Found in the array

//       }
//       public static void main(String[] args) {
//             int arr[] ={2,3,4,5,6,7};
//             int key=7; 
//            System.out.println(LSearch(arr, key));  // Return The INdex Number
//       }
// }
public class LinearSearch {
      public static int LSearch(String[] Arr,String key){
            for (int i=0 ;i<Arr.length;i++){
                  if(key==Arr[i]){
                        return i;
                  }
            }
            return -1; // Key NOt Found in the array

      }
      public static void main(String[] args) {
            String arr[] ={"Biriyani ","Butter Chicken","Naan","Paneer"};
            String Choice="Paneer";
           System.out.println(LSearch(arr,Choice));  // Return The INdex Number
      }
}
