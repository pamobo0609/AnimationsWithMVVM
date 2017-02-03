package com.pamobo0609.demo.view.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pamobo0609.demo.R;
import com.pamobo0609.demo.databinding.ActivityCollapsingToolbarBinding;
import com.pamobo0609.demo.viewmodel.CollapsingToolbarViewModel;

public class CollapsingToolbarActivity extends AppCompatActivity {

    /**
     * Binding object for this activity.
     */
    ActivityCollapsingToolbarBinding mBinding;

    /**
     * The view model of this activity.
     */
    private CollapsingToolbarViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_collapsing_toolbar);
        // The toolbar for this activity
        mBinding.collapsingToolbar.setTitle(R.string.app_name);
        // The view model for this activity
        mViewModel = new CollapsingToolbarViewModel(this, mBinding);
        mBinding.setMViewModel(mViewModel);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (null != mViewModel) {
            mViewModel.onDestroy();
        }
    }
}
