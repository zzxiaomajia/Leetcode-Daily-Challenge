class Solution {
    public int countSubstrings(String s) {

        // global varible should be avoided
        int count = 0;

        for (int i=0; i<s.length(); i++){

            // odd
            count += palindromeExp (s,i,i);

            // even

            count += palindromeExp (s,i,i+1);
        }
        return count;
    }

    // helper

    private int palindromeExp (String s, int left, int right){

        int count = 0;

        while (left >= 0 && right < s.length()){
            if (s.charAt(left) != s.charAt(right))
                break;
            //expanding
            right++;
            left--;
            count++;
        }

        return count;
        
    }

}