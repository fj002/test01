package com.meisoft.tran.main;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ajguan.library.EasyRefreshLayout;
import com.meisoft.tran.R;
import com.meisoft.tran.adapter.SAdapter;
import com.meisoft.tran.bean.PlatOrderDto;
import com.meisoft.tran.viewModel.IDao;
import com.meisoft.tran.viewModel.Impl.Dao;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by Administrator on 2018-01-17.
 */

public class SecondActivity extends Activity implements Dao{

    private String url="http://58.249.0.205:8099/author/api/login";
    private String methodName="/client/app/plan/list";
    @BindView(R.id.easylayout)
    EasyRefreshLayout easyRefreshLayout;
    @BindView(R.id.recyclerview)
    RecyclerView recyclerView;
    private  int currentIndex;
    private SAdapter sa;
    private LinearLayoutManager layoutManager;
    private IDao dao;
    List<String> list=new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        ButterKnife.bind(this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        dao=new IDao(this,this);
        dao.getLists("planOrderList", methodName, url, "param");
    }
    @Override
    public void setList(final List<PlatOrderDto> lists) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (lists!=null&&lists.size()>0) {
                    for (int i = 0; i < lists.size(); i++) {
                        list.add(lists.get(i).getAddress());
                    }
                    ;
                    if (list != null && list.size() > 0) {
                        sa = new SAdapter(list, SecondActivity.this);
                        recyclerView.setAdapter(sa);
                    }
                }
            }
        });
    }
}
