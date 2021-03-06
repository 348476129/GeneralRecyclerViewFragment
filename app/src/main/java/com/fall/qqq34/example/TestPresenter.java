package com.fall.qqq34.example;

import android.os.Handler;
import android.util.Log;

import com.fall.generalrecyclerviewfragment.GeneralPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qqq34 on 2017/2/4.
 */

public class TestPresenter extends GeneralPresenter {


    @Override
    public void refreshData() {
        Log.d("tag","刷新");
        new Handler().postDelayed(new Runnable() {
            public void run() {
                List<String> list = new ArrayList<>();
                for (int i = 0; i < 50; i++) {
                    list.add("ddd" + i);
                }
                  refreshFinish(list);
               //    onRefreshError();
             //   noDataLoad();
            }

        }, 2000);
    }

    @Override
    public void loadNextPageData(final int page) {
        Log.d(TAG, page + " ");
        new Handler().postDelayed(new Runnable() {

            public void run() {
                List<String> list = new ArrayList<>();
                for (int i = 0; i < 50; i++) {
                    list.add("b" + page + "   " + i);
                }
//                if (page==5){
//                    loadLastPageDataFinish(list);
//                }else {
//                    loadNextPageFinish(list);
//                }
loadLastPageDataFinish(list);
             //    onLoadNextError();
            }

        }, 2000);
    }
}
