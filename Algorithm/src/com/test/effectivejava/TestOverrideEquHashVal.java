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
     * [1]把某个非零常数值，例如17，保存在int变量result中； [2]对于对象中每一个关键域f（指equals方法中考虑的每一个域）：
     * [2.1]boolean型，计算(f ? 0 : 1); [2.2]byte,char,short型，计算(int);
     * [2.3]long型，计算(int) (f ^ (f>>>32));
     * [2.4]float型，计算Float.floatToIntBits(afloat);
     * [2.5]double型，计算Double.doubleToLongBits(adouble)得到一个long，再执行[2.3];
     * [2.6]对象引用，递归调用它的hashCode方法; [2.7]数组域，对其中每个元素调用它的hashCode方法。
     * [3]将上面计算得到的散列码保存到int变量c，然后执行 result=37*result+c; [4]返回result。;
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
