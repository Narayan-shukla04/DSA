class Solution {
    public int trap(int[] height) {
        int n=height.length;
        
        int leftMost=height[0];
        int rightMost=height[n-1];
        
        int left[]=new int[n];
        int right[]=new int[n];

        left[0] =leftMost;
        right[n-1]=rightMost;
        int ans =0;
        for(int i=1;i<n;i++){
            leftMost=Math.max(leftMost,height[i]);
            left[i]=leftMost;

        }
        for(int i=n-2;i>=0;i--){
            rightMost=Math.max(rightMost,height[i]);
            right[i]=rightMost;
        }

        for(int i=0;i<n;i++){

            ans +=Math.min(right[i],left[i])-height[i];
        }
    return ans;

    }
}