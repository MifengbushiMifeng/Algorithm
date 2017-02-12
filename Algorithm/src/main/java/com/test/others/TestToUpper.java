package com.test.others;

public class TestToUpper {

    public static void main(String[] args) {

        String str = "i want join sap";
        char[] c = new char[str.length()];
        str.getChars(0, str.length(), c, 0); // TODO what's the func of
                                             // getChars?
        if (c[0] >= 'a' && c[0] <= 'z') {
            c[0] = (char) (c[0] - 32);
        }
        for (int i = 1; i <= c.length - 1; i++) {
            if (c[i] == ' ') {
                c[i + 1] = (char) (c[i + 1] - 32);
            }
        }
        str = new String(c);
        System.out.print(str);
    }

}
