package com.example.android.mytour;

/**
 */


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    //Number of tabs
    static final int NUM_ITEMS = 4;

    /**
     * Context of the app
     */
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NelloreFragment();
            case 1:
                return new WarangalFragment();
            case 2:
                return new BangaloreFragment();
            case 3:
                return new KadapaFragment();

            default:
                return new NelloreFragment();
        }
    }

    // number of tabs in the view
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_Nellore);
            case 1:
                return mContext.getString(R.string.cateogory_warangal);
            case 2:
                return mContext.getString(R.string.category_bangalore);
            case 3:
                return mContext.getString(R.string.category_kadapa);
            default:
                return mContext.getString(R.string.category_Nellore);
        }
    }
}