package com.kmitl.meeserclenote.pigpock.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kmitl.meeserclenote.pigpock.R;
import com.kmitl.meeserclenote.pigpock.activity.LandingActivity;
import com.kmitl.meeserclenote.pigpock.manager.Contextor;


/**
 * Created by nuuneoi on 11/16/2014.
 */
public class LoginFragment extends Fragment implements View.OnClickListener {

    private AppCompatButton loginButton;

    public LoginFragment() {
        super();
    }

    public static LoginFragment newInstance() {
        LoginFragment fragment = new LoginFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {
        // Init 'View' instance(s) with rootView.findViewById here

        loginButton = (AppCompatButton) rootView.findViewById(R.id.btn_singIn);
        loginButton.setOnClickListener(this);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    /*
     * Save Instance State Here
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save Instance State here
    }

    /*
     * Restore Instance State Here
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            // Restore Instance State here
        }
    }

    @Override
    public void onClick(View view) {
        if (view == loginButton) {
            getActivity().startActivity(new Intent(getActivity(), LandingActivity.class));
            getActivity().overridePendingTransition(R.anim.from_right,R.anim.to_left);
        }
    }
}
