package bitset;
import java.util.BitSet;
public class BitSet1 {
    public static void main(String args[]){
        BitSet bitS1 = new BitSet(16);
        BitSet bitS2 = new BitSet(16);
        for (int i=0; i<16; i++){
            if((i%2)==0) bitS1.set(i);
            if ((i%5)==0) bitS2.set(i);
        }
        System.out.println("bitS1");
        System.out.println(bitS1);
        System.out.println("\n bitS2");
        System.out.println(bitS2);
        bitS2.and(bitS1);
        System.out.println("\n bitS1 and BitS2 : ");
        System.out.println(bitS2);
        bitS2.or(bitS1);
        System.out.println("\n BitS2 OR BIts2 : " );
        System.out.println(bitS2);

        bitS2.xor(bitS1);
        System.out.println("\n bits2 XOR bitS1");
        System.out.println(bitS2);
    }
}
