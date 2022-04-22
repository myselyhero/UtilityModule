package com.yongyongwang.utility.module;

import android.content.Context;

/**
 * @author yongyongwang 
 * 
 * @desc:
 * 
 * @// TODO: 2022/4/22
 */
public class UtilityModuleKit {

    private static Context appContext;

    /**
     *
     * @param context
     */
    public static void init(Context context){
        appContext = context;
    }

    /**
     *
     * @return
     */
    public static Context getAppContext() {
        return appContext;
    }
}
