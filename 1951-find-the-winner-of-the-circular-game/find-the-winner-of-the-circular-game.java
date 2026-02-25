class Solution {

   public int alive(List<Integer>list,int k,int i){
    if(list.size()==1)return list.get(0);

    int kill=(i+k-1)%list.size();
    list.remove(kill);
    return alive(list,k,kill);
   }


    public int findTheWinner(int n, int k) {
        List <Integer> list =new ArrayList<>(n);
        for(int i=1;i<=n;i++) list.add(i);

        return alive(list, k,0);


    }}
