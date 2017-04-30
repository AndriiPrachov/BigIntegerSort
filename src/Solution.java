import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String[] unsorted = new String[n];
        for (int unsorted_i = 0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }

        BigInteger[] arrayInt = new BigInteger[unsorted.length];
        for (int i = 0; i < unsorted.length; i++) {
            arrayInt[i] = new BigInteger(unsorted[i].trim());
        }

        Arrays.sort(arrayInt);

        for (BigInteger bigInt : arrayInt) {
            System.out.println(bigInt);
        }
    }
}
