package com.blou.mvp_test;

import android.view.View;

/**
 * Created by blou on 7/28/17.
 */

public interface BasePresenter<T> {
    void setView(T view);
}
