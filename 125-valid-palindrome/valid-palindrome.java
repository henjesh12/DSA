class Solution {
    public boolean isPalindrome(String s) {
        int low =0;
        int right = s.length()-1;

        while(low<right){

            while(low<right && !Character.isLetterOrDigit(s.charAt(low))){
                low++;
            }

            while(low<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(low))!= Character.toLowerCase(s.charAt(right))){
                return false;
            }
            low++;
            right--;
        }
        return true;
    }
}