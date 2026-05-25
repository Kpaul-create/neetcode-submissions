class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];    
        for(int i=0;i<n;i++){
            int prod=1;
            for(int j=0;j<n;j++){
                if(j==i)
                    continue;
                else
                    prod*=nums[j];
            }
            arr[i]=prod;
        }        
        return arr;
    }
}  
