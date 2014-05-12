package com.rmj.Sunshine.manager;

/**
 * Created by G11 on 2014/5/12.
 */
public class HandlerManager {
    private static HandlerManager mInstance = new HandlerManager();

    public static HandlerManager getInstance() {
        return mInstance;
    }

    private HandlerManager() {
    }

}
