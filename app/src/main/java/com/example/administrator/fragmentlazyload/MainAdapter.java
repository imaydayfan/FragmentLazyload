package com.example.administrator.fragmentlazyload;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class MainAdapter extends FragmentPagerAdapter {

    List<Fragment> fragmentList;
    List<String> titleList;

    public MainAdapter(FragmentManager fm,List<Fragment> fragmentList,List<String> titleList){
        super(fm);
        this.fragmentList = fragmentList;
        this.titleList = titleList;
    }

    @Override
    public int getCount(){
        return fragmentList != null ? fragmentList.size() : 0;
    }

    @Override
    public Fragment getItem(int position){
        return fragmentList.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position){
        return titleList.get(position);
    }
}
