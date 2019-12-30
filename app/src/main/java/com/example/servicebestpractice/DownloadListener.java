package com.example.servicebestpractice;

/**
 * 用于对于下载过程中各种状态进行监听和回调
 * Created by salmonzhang on 2019/12/27.
 */

public interface DownloadListener {
    // 用于通知当前下载的进度
    void onProgress(int progress);
    // 用于通知下载成功事件
    void onSuccess();
    // 用于通知下载失败事件
    void onFailed();
    // 用于通知下载暂停事件
    void onPaused();
    // 用于通知下载取消事件
    void onCanceled();
}
