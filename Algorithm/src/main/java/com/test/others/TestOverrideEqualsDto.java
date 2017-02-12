package com.test.others;

public class TestOverrideEqualsDto {

    private String userName;

    private String userID;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return getClass().getName() + userID + "/" + userID;

    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TestOverrideEqualsDto)) {
            return false;
        } else {
            TestOverrideEqualsDto tmpDto = (TestOverrideEqualsDto) obj;
            return this.userName.equals(tmpDto.getUserName()) && this.userID.equals(tmpDto.getUserID());
        }
    }

    @Override
    public int hashCode() {
        return userName.hashCode() + userID.hashCode();
    }

}
