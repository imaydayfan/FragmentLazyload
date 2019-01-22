package com.example.administrator.fragmentlazyload.Fragment;

import android.util.Log;

public class BFragment extends BaseFragment{

    @Override
    protected void loadData(){
        Log.i("fll","BFragment可见，可以加载数据");
    }

    @Override
    protected  String getFragmentTextviewContent(){
        return "Page_1";
    }
}
