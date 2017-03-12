package com.test.interfacetest;

import com.test.interfacetest.implement.A1Implement;
import com.test.interfacetest.implement.A2Implement;
import org.junit.Test;

/**
 * Created by Jonathan on 2017/3/12.
 * This class / file is used for...
 */
public class TestForInter {


    @Test
    public void test() {

        A1Implement a1 = new A1Implement();
        A2Implement a2 = new A2Implement();
        fly(a1);
        fly(a2);

    }

    private void fly(AInterface ainterface) {
        ainterface.fly();
    }


}
