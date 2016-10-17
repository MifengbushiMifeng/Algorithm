package com.test.effectivejava;

import java.util.Arrays;

public class TestOverrideEquHashVal {

    public static void main(String[] args) {

    }

    /**
     * 
     * [1]使用instanceof操作符检查“实参是否为正确的类型”。 [2]对于类中的每一个“关键域”，检查实参中的域与当前对象中对应的域值。
     * [2.1]对于非float和double类型的原语类型域，使用==比较； [2.2]对于对象引用域，递归调用equals方法；
     * [2.3]对于float域，使用Float.floatToIntBits(afloat)转换为int，再使用==比较；
     * [2.4]对于double域，使用Double.doubleToLongBits(adouble) 转换为int，再使用==比较；
     * [2.5]对于数组域，调用Arrays.equals方法。
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
