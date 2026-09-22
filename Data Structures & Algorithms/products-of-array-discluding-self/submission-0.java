class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int back[]=new int[nums.length];
        int n=nums.length;
        int front[]=new int[n];
        front[0]=nums[0];
        for(int i=1;i<n;i++){
            front[i]=front[i-1]*nums[i];
        }
        back[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            back[i]=nums[i]*back[i+1];
        }

        int res[]=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                res[i]=back[1];
            }
            else if(i==n-1){
                res[i]=front[n-2];
            }
            else{
                res[i]=front[i-1]*back[i+1];
            }
        }
        return res;
    }
}  
