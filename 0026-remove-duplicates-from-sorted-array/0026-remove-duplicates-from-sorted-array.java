
class Solution {
     public static int removeDuplicates(int[] arr) {

        int off=0;
         int res=1;
        int cm =1;
        int n = arr.length;
    
    while(cm<n){
        if(arr[cm] == arr[cm-1])
        {
            cm++;

            continue;
        }
       arr[off+1] = arr[cm];
       off++;
       cm++;
       res++;
    }
    return res; 
     }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(removeDuplicates(arr));
    }
}

// // -------------------Method 2--------------------------------------------------------

// class Solution {
//     public int removeDuplicates(int[] arr) {
//         int i=0;
//         for(int j=1;j<arr.length;j++){
//             if(arr[i]!=arr[j]){
//                 i++;
//                 arr[i]=arr[j];
//             }
//         }
//         return i+1;
//     }

    
// }