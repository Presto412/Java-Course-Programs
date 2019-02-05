package lab;

import lab.NumberConversion.*;

public class NumberConversionTest {
    public static void main(String[] args) {
        int number = 29;
        Decimal2Binary.dec2bin(number);
        Decimal2Binary.dec2binManual(number);
        Decimal2Hexa.dec2hex(number);
        Decimal2Hexa.dec2hexManual(number);
    }
}
