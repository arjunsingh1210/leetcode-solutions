class Solution {
    public int smallestNumber(int n, int t) {
        for(int num =n; ; num++){
            int product = 1;

            for(char c : String.valueOf(num).toCharArray()){
                product *= (c-'0');
            }
            if(product %t == 0) return num;
        }
    }
}