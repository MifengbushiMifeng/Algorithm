package com.test.arraysort;

import java.lang.reflect.Method;
import java.util.Comparator;

public class UserInfoComparetor implements Comparator {

    private String columnName;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    private boolean descFlg;

    public boolean isDescFlg() {
        return descFlg;
    }

    public void setDescFlg(boolean descFlg) {
        this.descFlg = descFlg;
    }

    @SuppressWarnings("unchecked")
    @Override
    public int compare(Object o1, Object o2) {
        if (columnName == null) {
            return 0;
        }
        // Method method = new Method(null, columnName, null, null, null, 0, 0,
        // columnName, null, null, null);
        String columnValue1 = "";
        String columnValue2 = "";
        Class classUser = UserInfo.class;
        try {
            Method method = classUser.getMethod("get" + columnName);
            columnValue1 = (String) method.invoke(o1);
            columnValue2 = (String) method.invoke(o2);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (isDescFlg()) {
            return columnValue1.compareTo(columnValue2);
        } else {
            return columnValue2.compareTo(columnValue1);
        }
        // return 0;
    }

}
