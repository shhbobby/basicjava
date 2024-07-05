package bits;

public class StartPoint {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            int number = i;
            int modifiedFirstBit = number | 2;
            int modifiedsecondeBit = number | 1;
            int clearedfirstBit = number & (~2);
            int clearedSecondBit = number & (~1);


            System.out.println("Original number (binary): " + Integer.toBinaryString(number));
            System.out.println("second on?:"+((number & 1) == 1));
            System.out.println("first on?:"+((number & 2) == 2));
            System.out.println("Modified modifiedFirstBit bit (binary): " + Integer.toBinaryString(modifiedFirstBit) +" "+modifiedFirstBit);
            System.out.println("Modified modifiedsecondeBit bit (binary): " + Integer.toBinaryString(modifiedsecondeBit)+" "+modifiedsecondeBit);
            System.out.println("Modified clearedfirstBit bit (binary): " + Integer.toBinaryString(clearedfirstBit)+" "+clearedfirstBit);
            System.out.println("Modified clearedSecondBit bit (binary): " + Integer.toBinaryString(clearedSecondBit)+" "+clearedSecondBit);
        }
    }
}
