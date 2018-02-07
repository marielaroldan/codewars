package noboringzeros;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoBoring {

    public static int noBoringZeros(int n) {
        while(n%10==0){
            n = n/10;
        }
        return n;
    }
}

