package com.yomanship.harrshit.handson;

/**
 * Created by harrshit on 27/05/17.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new OnlineFragment();
        }  else {
            return new OfflineFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}

