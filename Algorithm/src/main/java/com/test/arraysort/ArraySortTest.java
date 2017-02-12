package com.test.arraysort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySortTest {

    public static void main(String[] args) {

        List<UserInfo> userList = new ArrayList<UserInfo>();
        UserInfo userInfo = null;

        userInfo = new UserInfo();
        userInfo.setUserName("ZhouRonghui");
        userInfo.setUserAddress("Jilin");
        userList.add(userInfo);

        userInfo = new UserInfo();
        userInfo.setUserName("XiaZhao");
        userInfo.setUserAddress("Liaoning");
        userList.add(userInfo);

        userInfo = new UserInfo();
        userInfo.setUserName("LittleGirl");
        userInfo.setUserAddress("Hert");
        userList.add(userInfo);

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
            System.out.println(tmpUser.getUserName() + " / " + tmpUser.getUserAddress());
        }

        System.out.println("---------Sort the list---------");

        sortList(userList, "UserName", true);

        for (int j = 0; j < userList.size(); j++) {
            tmpUser = userList.get(j);
            System.out.println(tmpUser.getUserName() + " / " + tmpUser.getUserAddress());
        }

        // System.out.println(userList.size());
    }

    @SuppressWarnings("unchecked")
    private static void sortList(List<UserInfo> list, String fieldName, boolean descFlg) {
        UserInfoComparetor userComparator = new UserInfoComparetor();
        userComparator.setColumnName(fieldName);
        userComparator.setDescFlg(descFlg);
        Collections.sort(list, userComparator); // TODO
    }

}
