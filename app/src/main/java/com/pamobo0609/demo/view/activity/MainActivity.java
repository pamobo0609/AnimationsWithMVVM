package com.pamobo0609.demo.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.pamobo0609.demo.R;
import com.pamobo0609.demo.databinding.ActivityMainBinding;
import com.pamobo0609.demo.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    /**
     * The data binding object
     */
    ActivityMainBinding mBinding;

    /**
     * The view model for this activity.
     */
    private MainActivityViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Initialization of the binding object
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mViewModel = new MainActivityViewModel(this, mBinding);
        mBinding.setMViewModel(mViewModel);
        // Showing the infinite SnackBar
        showSnackBar();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (null != mViewModel) {
            mViewModel.onDestroy();
        }
    }

    /**
     * <h1>ShowSnackBar</h1>
     * <p>Shows the infinite SnackBar with the instructions.</p>
     */
    private void showSnackBar() {
        mViewModel.showSnackBar();
    }
}
