
package com.bootcamp;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
            String aaron = "Aaron";
            String carl = "Carl";
            String ted = "Ted";
            String ooo = "ooo";

            // translating text String to 7 bit ASCII encoding
            byte[] bytArr = aaron.getBytes("US-ASCII");
            byte[] bytArr1 = carl.getBytes("US-ASCII");
            byte[] bytArr2 = ted.getBytes("US-ASCII");
            byte[] bytArr3 = ooo.getBytes("US-ASCII");



            System.out.println(Arrays.toString(bytArr)); //returns [65, 97, 114, 111, 110]
            System.out.println(Arrays.toString(bytArr1)); //returns [67, 97, 114, 108]
            System.out.println(Arrays.toString(bytArr2)); //returns [84, 101, 100]
            System.out.println(Arrays.toString(bytArr3)); //returns [111, 111, 111]

        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
