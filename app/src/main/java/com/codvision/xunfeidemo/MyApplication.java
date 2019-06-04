package com.codvision.xunfeidemo;


import android.app.Application;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        SpeechUtility.createUtility(getApplicationContext(), SpeechConstant.APPID+"=5cc3450e");
        super.onCreate();
    }
}

