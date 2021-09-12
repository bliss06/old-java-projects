import java.lang.reflect.Array;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");
        short a = 32700;// max for short is 32767
        byte b = 20;
        int c = 59000;
        long l = 192000;
        float f = 580000.9f;
        double d = 580000.963;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        // Integer literals
        System.out.println("\nInteger Literals\n");
        int i = 0b10011010101;// Integer represented in Binary system - leading 0b
        System.out.println(i);
        i = 010011010101;// Integer represented in Octal system -- leading 0
        System.out.println(i);
        i = 0xABCDEF;// Integer represented in Hexadecimal system --leading 0x (zero and 'x')
        System.out.println(i);

        System.out.println(1234L);// Integer literals are int unless followed by L, then they are treated as Long

        int RICHARD_NIXONS_SSN = 567_68_051;
        int for_no_reason = 1___2___3; //from java 7 onwards
        int JAVA_ID = 0xCAFE_BABE;
        long grandTotal = 40_123_456_789L;
        System.out.println(RICHARD_NIXONS_SSN);

        System.out.println('\u0065');

        int [] primes = {2,3,5,7,11};
        System.out.println(primes.length);
        String [] names = {"Deepak","Abha"};
        System.out.println(Array.getLength(primes));
        System.out.println(Array.getLength(names));

        for(int n: primes)
        System.out.println(n);

        Changer test = new Changer();
        test.getClones();
        test = new Changer();
        test.getClones();
        String myValue = "I am before change";
        String[] values = {myValue};
        System.out.println(values[0]);
        test.changeMe(values[0]);
        System.out.println("I have called change");
        
        System.out.println(values[0]);

    }
}