package com.levibostian.androiddevbuddy.vo;

public class ActionBarIconVo {

    private int mActionBarIconRes;
    private String mActionBarIconName;

    public ActionBarIconVo(int actionBarIconRes, String actionBarIconName) {
        mActionBarIconRes = actionBarIconRes;
        mActionBarIconName = actionBarIconName;
    }

    public int getActionBarIconRes() {
        return mActionBarIconRes;
    }

    public String getActionBarIconName() {
        return mActionBarIconName;
    }
}
