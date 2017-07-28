package com.blou.mvp_test.model;

/**
 * Created by blou on 7/27/17.
 */

public class Count {

    private int count;

    public Count() { this.count = 0; }

    public void incrementCount() {
        ++count;
    }

    public void decrementCount() { --count; }

    public int getCount() { return count; }

}
