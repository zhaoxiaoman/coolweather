package com.coolweather.app.util;

/**
 * Created by Administrator on 2018/2/9.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
