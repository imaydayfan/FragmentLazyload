package com.example.administrator.fragmentlazyload.Fragment;

import android.util.Log;

public class AFragment extends BaseFragment{

    @Override
    protected void loadData(){
        Log.i("fll","AFragment可见，可以加载数据");
    }

    @Override
    protected String getFragmentTextviewContent(){
        return "Page_0";
    }
}
