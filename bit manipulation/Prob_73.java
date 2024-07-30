//Swap two numbers without using a temporary variable.

class Prob_37{
    static List<Integer> get(int a,int b)
    {
        // code here
        
        ArrayList<Integer> swap=new ArrayList<>();
        
        a=a^b;
        b=a^b;
        a=a^b;
        
        swap.add(a);
        swap.add(b);
        
        return swap;
    }
}