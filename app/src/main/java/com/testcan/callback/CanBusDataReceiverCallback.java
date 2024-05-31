package com.testcan.callback;

import com.testcan.MainActivity;
import com.testcan.canbus.response.CanBusResponse;

import java.lang.ref.WeakReference;


public class CanBusDataReceiverCallback implements ResultReceiverCallback<CanBusResponse> {

    private WeakReference<MainActivity> activity;

    public CanBusDataReceiverCallback(MainActivity activity) {
        this.activity = new WeakReference<>(activity);
    }

    @Override
    public void onSuccess(CanBusResponse data) {
        if (activity != null && activity.get() != null) {
            activity.get().updateView(data);
        }
    }

    @Override
    public void onError(Exception e) {
        if (activity != null && activity.get() != null) {
            activity.get().showMessage(e.getMessage());
        }
    }
}
