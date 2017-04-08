package com.kmitl.meeserclenote.pigpock.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kmitl.meeserclenote.pigpock.R;
import com.kmitl.meeserclenote.pigpock.fragment.MainFragment;


public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, MainFragment.newInstance())
                    .commit();
        }
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.from_left,R.anim.to_right);
    }
}
