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
                && Double.doubleToLongBits(this.adouble) == Double.doubleToLongBits(unit.adouble) // TODO
                && this.aObject.equals(unit.aObject) && equalsInts(unit.ints)
                && equalsTestOverrideEquHashVal(unit.units);
    }

    private boolean equalsInts(int[] aints) {
        return Arrays.equals(this.ints, aints);

    }

    private boolean equalsTestOverrideEquHashVal(TestOverrideEquHashVal[] aUnits) {
        return Arrays.equals(this.units, aUnits);
    }

    /**
     * 
     * [1]��ĳ�����㳣��ֵ������17��������int����result�У� [2]���ڶ�����ÿһ���ؼ���f��ָequals�����п��ǵ�ÿһ���򣩣�
     * [2.1]boolean�ͣ�����(f ? 0 : 1); [2.2]byte,char,short�ͣ�����(int);
     * [2.3]long�ͣ�����(int) (f ^ (f>>>32));
     * [2.4]float�ͣ�����Float.floatToIntBits(afloat);
     * [2.5]double�ͣ�����Double.doubleToLongBits(adouble)�õ�һ��long����ִ��[2.3];
     * [2.6]�������ã��ݹ��������hashCode����; [2.7]�����򣬶�����ÿ��Ԫ�ص�������hashCode������
     * [3]���������õ���ɢ���뱣�浽int����c��Ȼ��ִ�� result=37*result+c; [4]����result��;
     * 
     */
    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 37 * hashCode + (int) this.ashort;
        hashCode = 37 * hashCode + (int) this.achar;
        hashCode = 37 * hashCode + (int) this.abyte;
        // hashCode = 37 * hashCode + (abool ? 0 : 1);
        hashCode = 37 * hashCode + (abool ? 0 : 1);
        hashCode = 37 * hashCode + (int) (this.along ^ (this.along >>> 32)); // TODO
        hashCode = 37 * hashCode + Float.floatToIntBits(this.afloat);
        long toLong = Double.doubleToLongBits(this.adouble);
        hashCode = 37 * hashCode + (int) (toLong ^ (toLong >>> 32));
        hashCode = 37 * hashCode + this.aObject.hashCode();
        hashCode = 37 * hashCode + intsHashCode(this.ints);
        hashCode = 37 * hashCode + unitsHashCode(this.units);
        return hashCode;
    }

    private int intsHashCode(int[] ints) {
        int result = 17;
        for (int i = 0; i < ints.length; i++) {
            result = 37 * result + ints[i];
        }
        return result;
    }

    private int unitsHashCode(TestOverrideEquHashVal[] units) {
        int result = 17;
        for (int i = 0; i < units.length; i++)
            result = 37 * result + units[i].hashCode();

        return 17;
    }
}
