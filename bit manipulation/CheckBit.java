//Check if the i-th bit is set or not

public class CheckBit {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        // Your code here
        
        if((n & (1<<k))!=0){
            return true;
        }
        
        return false;
    }
}
