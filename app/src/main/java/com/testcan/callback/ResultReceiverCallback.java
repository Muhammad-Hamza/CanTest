package com.testcan.callback;

public interface ResultReceiverCallback<T>{
    void onSuccess(T data);
    void onError(Exception exception);
}
