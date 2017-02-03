package com.pamobo0609.demo.view.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pamobo0609.demo.R;
import com.pamobo0609.demo.databinding.ActivityCollapsingTabsBinding;
import com.pamobo0609.demo.view.fragment.TabFragment;
import com.pamobo0609.demo.viewpager.adapter.ViewPagerAdapter;

public class CollapsingTabsActivity extends AppCompatActivity {

    /**
     * The data binding object for the class
     */
    ActivityCollapsingTabsBinding mBinding;

    /**
     * View holder for this activity
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_collapsing_tabs);
        // Initialize the tabs
        setUpTabs();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void setUpTabs() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addTitledFragment("First fragment", TabFragment.newInstance());
        adapter.addTitledFragment("Second fragment", TabFragment.newInstance());

        mBinding.vpTabs.setAdapter(adapter);
        mBinding.tlTabs.setupWithViewPager(mBinding.vpTabs);
    }
}
