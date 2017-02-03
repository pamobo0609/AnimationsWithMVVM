package com.pamobo0609.demo.viewpager.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * @author Accenture - <a href="mailto:jose.p.monge.bonilla@accenture.com">Jose Pablo Monge Bonilla</a>
 * @since 102/02/17
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<String> mTabTitles;

    private ArrayList<Fragment> mTabs;

    /**
     * <h1>ViewPagerAdapter</h1>
     * <p>Constructor for this adapter</p>
     *
     * @param fm         the {@link FragmentManager} of the class
     */
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        this.mTabTitles = new ArrayList<>();
        this.mTabs = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int position) {
        return mTabs.get(position);
    }

    @Override
    public int getCount() {
        return mTabs.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitles.get(position);
    }

    /**
     * <h1>AddTitledFragment</h1>
     * <p>Adds a {@link Fragment} inside a {@link android.support.v4.view.ViewPager}, with a title.</p>
     *
     * @param pTitle    the tab title
     * @param pFragment the fragment to show in the title
     */
    public void addTitledFragment(String pTitle, Fragment pFragment) {
        mTabs.add(pFragment);
        mTabTitles.add(pTitle);
    }
}
