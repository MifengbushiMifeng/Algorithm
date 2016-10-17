package com.test.effectivejava;

import java.util.Arrays;

public class TestOverrideEquHashVal {

    public static void main(String[] args) {

    }

    /**
     * 
     * [1]ʹ��instanceof��������顰ʵ���Ƿ�Ϊ��ȷ�����͡��� [2]�������е�ÿһ�����ؼ��򡱣����ʵ���е����뵱ǰ�����ж�Ӧ����ֵ��
     * [2.1]���ڷ�float��double���͵�ԭ��������ʹ��==�Ƚϣ� [2.2]���ڶ��������򣬵ݹ����equals������
     * [2.3]����float��ʹ��Float.floatToIntBits(afloat)ת��Ϊint����ʹ��==�Ƚϣ�
     * [2.4]����double��ʹ��Double.doubleToLongBits(adouble) ת��Ϊint����ʹ��==�Ƚϣ�
     * [2.5]���������򣬵���Arrays.equals������
     * 
     */

    private short ashort;
    private char achar;
    private byte abyte;
    private boolean abool;
    private long along;
    private float afloat;
    private double adouble;
    private TestOverrideEquHashVal aObject;
    private int[] ints;
    private TestOverrideEquHashVal[] units;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TestOverrideEquHashVal)) {
            return false;
        }

        TestOverrideEquHashVal unit = (TestOverrideEquHashVal) o;

        return this.ashort == unit.ashort && this.achar == unit.achar && this.abyte == unit.abyte
                && this.abool == unit.abool && this.along == unit.along
                && Float.floatToIntBits(this.afloat) == Float.floatToIntBits(unit.afloat)
                && Double.doubleToLongBits(this.adouble) == Double.doubleToLongBits(unit.adouble)
                && this.aObject.equals(unit.aObject) && equalsInts(unit.ints)
                && equalsTestOverrideEquHashVal(unit.units);
    }

    private boolean equalsInts(int[] aints) {
        return Arrays.equals(this.ints, aints);

    }

    private boolean equalsTestOverrideEquHashVal(TestOverrideEquHashVal[] aUnits) {
        return Arrays.equals(this.units, aUnits);
    }

}
