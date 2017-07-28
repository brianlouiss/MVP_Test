package com.blou.mvp_test.contracts;

import com.blou.mvp_test.BasePresenter;
import com.blou.mvp_test.BaseView;

/**
 * Created by blou on 7/28/17.
 */

public interface MainActivityContract {

    interface View extends BaseView {
        void showUpdatedCount();
    }

    interface Presenter extends BasePresenter<View> {
        int getCount();
        void incrementCount();
        void decrementCount();
    }

}
