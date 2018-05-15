package com.chrisz;

public class Main {

    public static void main(String[] args) {
        // INTEGER DATA TYPE
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2147483647;
	    // maximum positive and negative values stored in integer variable
        // can use underscore _ to use as comma
        // int has a width of 32, -2^31 to (2^31)-1
        int myTotal = (myMinValue/2);

        // BYTE DATA TYPE
        byte myByteValue = 127;
        // data type of type byte, smaller amount of space allocated, -128 to 127
        // int has a width of 8
      //  byte myNewByteValue = (myByteValue/2);
        // above line won't work because (myByteValue/2) is evaluated to an integer and won't fit into a byte data type
        // solution is casting -> (byte) (myByteValue/2)

        // SHORT DATA TYPE
        short myShortValue = -32768;
        // -32768 to 32767
        // int has a width of 16
        short myNewShortValue = (short) (myShortValue/2);

        // LONG DATA TYPE
        long myLongValue = 100L;
        // long has a width of 64, -2^63 to (2^63)-1

        // Challenge -
        byte myByte = 55;
        short myShort = 1800;
        int myInt = 2_000_000;
        long myLong = 50000L + 10L *(myByte + myShort + myInt);
        System.out.println("long Total = " + myLong);
        // don't need to cast anything since all data types fit into a long data type
    }
}
