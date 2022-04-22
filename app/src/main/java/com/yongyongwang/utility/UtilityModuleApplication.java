package com.yongyongwang.utility;

import android.app.Application;

import com.yongyongwang.utility.module.UtilityModuleKit;

/**
 * @author yongyongwang 
 * 
 * @desc:
 * 
 * @// TODO: 2022/4/22
 */
public class UtilityModuleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UtilityModuleKit.init(this);
    }
}
