package BitManipulation;

public class IthBitOperations {

    public static void getIthBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            System.out.println("ith Bit is: 0");
        } else {
            System.out.println("ith Bit is: 1");
        }
    }

    public static int setIthBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearLastIbits(int n, int i) {
        int bitMask = (-1 << i);
        return n & bitMask;
    }

    public static int clearBitsInRange(int n, int i, int j) {
        int a = (-1 << j + 1);
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static void isPowerOfTwo(int n) {
        if ((n & (n - 1)) == 0) {
            System.out.println(n + " is a multiple of 2");
        } else {
            System.out.println(n + " is not a multiple of 2");
        }
    }

    public static int countOnes(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
                n = n >> 1;
            } else {
                n = n >> 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // isPowerOfTwo(128);
        System.out.println(countOnes(15));
    }
}
