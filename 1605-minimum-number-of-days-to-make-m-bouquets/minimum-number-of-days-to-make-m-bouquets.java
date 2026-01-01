class Solution {

    public static boolean isBloom(int []Bloomday,int m,int k,int mid ){
        int flower=0;
        int bouquet=0;
        for(int bloom:Bloomday){
          if(bloom<=mid){
            flower++;
            if(flower==k){
                bouquet++;
                flower=0;
            }
          }else{
            flower=0;
          }

        }

        return bouquet>=m;
    }


    public int minDays(int[] bloomDay, int m, int k) {

        if(k*m>bloomDay.length) return -1;
        int first =Integer.MAX_VALUE;
        int last=Integer.MIN_VALUE;
        for(int bloom:bloomDay){
            first=Math.min(first,bloom);
            last=Math.max(last,bloom);
        }
        int ans=-1;
        while(first<=last){
            int mid =first+(last-first)/2;
            if(isBloom(bloomDay,m,k,mid)){
                ans=mid;
                last=mid-1;
            }else{
                first=mid+1;
            }
        }

    return ans;
    }
}