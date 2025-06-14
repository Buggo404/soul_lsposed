package com.xuexiang.xhttp2.subsciber.impl;

/* loaded from: classes.dex */
public interface IProgressLoader {
    void dismissLoading();

    boolean isLoading();

    void setCancelable(boolean r1);

    void setOnProgressCancelListener(com.xuexiang.xhttp2.subsciber.impl.OnProgressCancelListener r1);

    void showLoading();

    void updateMessage(java.lang.String r1);
}
