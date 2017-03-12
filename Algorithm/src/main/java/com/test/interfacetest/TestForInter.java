package com.test.interfacetest;

import com.test.interfacetest.implement.A1implement;
import com.test.interfacetest.implement.A2implement;
import org.junit.Test;

/**
 * Created by Jonathan on 2017/3/12.
 * This class / file is used for...
 */
public class TestForInter {


    @Test
    public void test() {

        A1implement a1 = new A1implement();
        A2implement a2 = new A2implement();
        fly(a1);
        fly(a2);

    }

    private void fly(Ainterface ainterface) {
        ainterface.fly();
    }


}
