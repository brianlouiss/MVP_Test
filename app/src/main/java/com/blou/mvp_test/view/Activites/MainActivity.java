package com.blou.mvp_test.view.Activites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.blou.mvp_test.R;
import com.blou.mvp_test.contracts.MainActivityContract;
import com.blou.mvp_test.model.Count;
import com.blou.mvp_test.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    private TextView countTextView;
    private Button leftPressButton;
    private Button rightPressButton;

    private MainActivityContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter( new Count() );

        countTextView = (TextView) findViewById(R.id.countTextView);
        leftPressButton = (Button) findViewById(R.id.leftPressButton);
        rightPressButton = (Button) findViewById(R.id.rightPressButton);

        leftPressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.decrementCount();
            }
        });

        rightPressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.incrementCount();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.setView(this);
    }


    @Override
    public void showUpdatedCount() {
        countTextView.setText(Integer.toString(presenter.getCount()));
    }


}
