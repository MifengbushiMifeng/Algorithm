package com.test.arraysort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraySortTest {

    public static void main(String[] args) {

        List<UserInfo> userList = new ArrayList<UserInfo>();
        UserInfo userInfo = null;

        userInfo = new UserInfo();
        userInfo.setUserName("ZhouRonghui");
        userInfo.setUnserAddress("Jilin");
        userList.add(userInfo);

        userInfo = new UserInfo();
        userInfo.setUserName("XiaZhao");
        userInfo.setUnserAddress("Liaoning");
        userList.add(userInfo);

        userInfo = new UserInfo();
        userInfo.setUserName("LittleGirl");
        userInfo.setUnserAddress("Hert");
        userList.add(userInfo);

        // String column;
        UserInfoComparetor userComparator = new UserInfoComparetor();
        userComparator.setColumnName("UnserAddress");
        userComparator.setDescFlg(true);
        /*
         * Collections.sort(userList, new Comparator<UserInfo>() {
         * 
         * @Override public int compare(UserInfo u1, UserInfo u2) { // if
         * (column == null) { // // } return 1; }
         * 
         * });
         */
        UserInfo tmpUser = null;
        for (int i = 0; i < userList.size(); i++) {
            tmpUser = userList.get(i);
            System.out.println(tmpUser.getUserName() + " / " + tmpUser.getUnserAddress());
        }

        Collections.sort(userList, userComparator);

        System.out.println("---------Sort the list---------");
        for (int j = 0; j < userList.size(); j++) {
            tmpUser = userList.get(j);
            System.out.println(tmpUser.getUserName() + " / " + tmpUser.getUnserAddress());
        }

        // System.out.println(userList.size());
    }

}
