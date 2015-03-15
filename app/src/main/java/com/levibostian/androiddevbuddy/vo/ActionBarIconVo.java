package com.levibostian.androiddevbuddy.vo;

public class ActionBarIconVo {

    private int mActionBarIconRes;
    private int mActionBarIconName;

    public ActionBarIconVo(int actionBarIconRes, int actionBarIconName) {
        mActionBarIconRes = actionBarIconRes;
        mActionBarIconName = actionBarIconName;
    }

    public int getActionBarIconRes() {
        return mActionBarIconRes;
    }

    public int getActionBarIconName() {
        return mActionBarIconName;
    }
}
