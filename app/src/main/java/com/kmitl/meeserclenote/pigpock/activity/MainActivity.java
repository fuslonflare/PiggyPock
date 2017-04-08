package com.kmitl.meeserclenote.pigpock.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kmitl.meeserclenote.pigpock.R;
import com.kmitl.meeserclenote.pigpock.fragment.LoginFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstance();
    }

    private void initInstance() {

         getSupportFragmentManager().beginTransaction()
                 .add(R.id.contentContainer,LoginFragment.newInstance())
                 .commit();
    }
}
