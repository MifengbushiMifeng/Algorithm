package com.test.enumTest;

/**
 * Created by Jonathan on 3/16/2017.
 * <p>
 * The Class / Method is used for
 */
public class enumTest {

    public static void main(String[] args) {

        MethodType str = MethodType.valueOf("A");
        System.out.println(str);

        Mobile ret;
        ret = Mobile.valueOf("Samsung");
        System.out.println(ret + "/" + ret.showPrice());
    }

    enum MethodType {

        A, B, C, D;

    }

    enum Mobile {
        Samsung(400), Nokia(250), Motorola(325);

        int price;

        Mobile(int p) {
            price = p;
        }

        int showPrice() {
            return price;
        }
    }

}
