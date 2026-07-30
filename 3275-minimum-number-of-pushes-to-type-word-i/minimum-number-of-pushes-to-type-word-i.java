class Solution {
    public int minimumPushes(String word) {
        int i = word.length();
        int j = i/8;
        int l = i-(j*8);
        int ans=0,k;
        if(i>1){
            for(k=1;k<=j;k++){
                ans=ans+(k*8);
            }
        }
        ans=ans+(l*(j+1));
        return ans;
    }
}