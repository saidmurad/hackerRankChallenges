package bigNumber.bigDecimal;

import java.math.BigDecimal;
import java.util.*;

class Solution{

    public static void main(String []args){
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []s = new String[n+2];
        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        sc.close();

        // Write your code here
        Arrays.sort(s, 0, n, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // Convert strings to BigDecimal
                BigDecimal bd1 = new BigDecimal(o1);
                BigDecimal bd2 = new BigDecimal(o2);
                // Compare in reverse order for descending sort
                return bd2.compareTo(bd1);
            }
        });

        Arrays.sort(s, 0, n, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // Convert string to BigDecimal
                BigDecimal bd1 = new BigDecimal(o1);
                BigDecimal bd2 = new BigDecimal(o2);
                // Compare in reverse order for descending sort
                return bd2.compareTo(bd1);
            }
        });

        // Output
        for(int i = 0; i < n; i++){
            System.out.println(s[i]);
        }
    }
}
