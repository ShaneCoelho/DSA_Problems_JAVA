// User function Template for Java//User function Template for Java
class SumSubset {
    ArrayList<Integer> allsum=new ArrayList<>();
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        
        sumHelper(0,0,arr,n);
        Collections.sort(allsum);
        return allsum;
    }
    
    void sumHelper(int sum, int index, ArrayList<Integer> arr, int n){
        if(index==n){
            allsum.add(sum);
            return ;
        }
        sumHelper(sum+arr.get(index),index+1,arr,n);
        sumHelper(sum,index+1,arr,n);
    }
}