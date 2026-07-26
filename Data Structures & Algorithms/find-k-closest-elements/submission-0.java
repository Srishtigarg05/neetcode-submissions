class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<k;i++){
            list.add(arr[i]);
        }
        int a=0;
        int b=k;
        while(b<n){
            if(Math.abs(arr[a]-x)>Math.abs(arr[b]-x)){
                list.add(arr[b]);
                list.remove(0);
                a++;
            }
            b++;
        }
        return list;
    }
}