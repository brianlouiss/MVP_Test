package com.blou.mvp_test.presenter;

import com.blou.mvp_test.contracts.MainActivityContract;
import com.blou.mvp_test.model.Count;

/**
 * Created by blou on 7/28/17.
 */

public class MainPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View view;
    private Count count;

    public MainPresenter(Count count) {
        this.count = count;
    }

    @Override
    public void setView(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public int getCount() {
        return count.getCount();
    }

    @Override
    public void incrementCount() {
        count.incrementCount();
        view.showUpdatedCount();
    }

    @Override
    public void decrementCount() {
        count.decrementCount();
        view.showUpdatedCount();
    }


}
