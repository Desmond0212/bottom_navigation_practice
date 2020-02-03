package com.example.softspacedesmond.bottomnav_java;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mfragmentlist = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        return mfragmentlist.get(position);
    }

    @Override
    public int getCount()
    {
        return mfragmentlist.size();
    }

    public void addFrag(Fragment fragment)
    {
        mfragmentlist.add(fragment);
    }

}
