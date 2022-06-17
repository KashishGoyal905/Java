public class general {
    public static void main(String[] args) {
        String str = "aabbb";
        int arr[] = new int[256];
        for(int i=0;i<str.length();i++){
            int ascii = (int)str.charAt(i);
            arr[ascii]++;
        }
         int max = 0;
         int finalindex = -1;
         for(int i=0;i<256;i++){
             if(arr[i]>max){
                 max = arr[i];
                 finalindex = i;
                 
             }
         }
         System.out.println(finalindex);
         char ans = (char)finalindex;
         System.out.println(ans);
    }
}
