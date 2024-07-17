// N-base notation is a system for writing numbers that uses only n different symbols, This symbols are the first n symbols from the given notation 
// list(Including the symbol for o) Decimal to n base notation are (0:0, 1:1, 2:2, 3:3, 4:4, 5:5, 6:6, 7:7, 8:8, 9:9, 10:A,11:B and so on upto 35:Z)

// Implement the following function

// Char* DectoNBase(int n, int num):

// The function accept positive integer n and num Implement the function to calculate the n-base equivalent of num and return the same as a string

import java.util.*;

class Aug_2022_8 {
    public static String dectoNBase(int n, int num) {
        String res = "";
        int quotient = num / n;
        ArrayList<Integer> rem = new ArrayList<Integer>();
        rem.add(num % n);
        while (quotient != 0) {
            rem.add(quotient % n);
            quotient = quotient / n;
        }
        for (int i = 0; i < rem.size(); i++) {
            if (rem.get(i) > 9) {
                res = (char) (rem.get(i) - 9 + 64) + res;
            } else
                res = rem.get(i) + res;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        System.out.println(dectoNBase(n, num));
    }
}