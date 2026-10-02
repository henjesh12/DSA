class Solution {
    public String reverseWords(String s) {
         String str[] = s.trim().split("\\s+");
         String str2[] = new String[str.length];

         int idx=0;
         for(int i=str.length-1;i>=0;i--){
            str2[idx++]=str[i];
         }
         return String.join(" ",str2);
    }
}