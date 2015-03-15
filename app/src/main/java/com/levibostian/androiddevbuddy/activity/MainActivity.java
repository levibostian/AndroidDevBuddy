package com.levibostian.androiddevbuddy.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.levibostian.androiddevbuddy.R;
import com.levibostian.androiddevbuddy.fragment.ActionBarIconsFragment;


public class MainActivity extends ActionBarActivity {

    private FrameLayout mFragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        assignViews();
        startFragment();
    }

    private void assignViews() {
        mFragmentContainer = (FrameLayout) findViewById(R.id.fragment_container);
    }

    private void startFragment() {
        getFragmentManager().beginTransaction()
                            .add(R.id.fragment_container, ActionBarIconsFragment.newInstance())
                            .commit();
    }

}
