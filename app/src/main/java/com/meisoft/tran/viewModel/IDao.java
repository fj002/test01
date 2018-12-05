package com.meisoft.tran.viewModel;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.meisoft.tran.bean.PlatOrderDto;
import com.meisoft.tran.utils.GsonUtils;
import com.meisoft.tran.viewModel.Impl.Dao;
import com.solidfire.gson.Gson;

import org.json.JSONObject;

import java.util.List;

import okhttp3.Call;

/**
 * Created by Administrator on 2018-03-14.
 */

public class IDao extends DataUtil{
    private Dao dao;
    private Context context;
    private List<PlatOrderDto> list;

    public IDao(Context context,Dao dao) {
        this.context = context;
        this.dao=dao;
    }



    private void getData(String requestTag, String methodName, String url, String type) {
        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject.put("loginName", "admin");
            jsonObject.put("loginPassword", "123456abc");



            showLoading("正在加载……", requestTag,context);
            requestHttp(jsonObject,requestTag , methodName, url, type);

        } catch (Exception e) {

            Toast.makeText(context, e.getMessage()+"请重新启动", Toast.LENGTH_SHORT).show();
        }
    }


    public void getLists(String requestTag, String methodName, String url, String type) {
        getData(requestTag,methodName,url,type);
    }




    @Override
    protected void successCallback(JSONObject jsonObject, String requestTag) {
        hideLoading();
        if ("planOrderList".equals(requestTag)) {
            Log.e("回来的值",jsonObject.toString());
            //dao.setList();
        }


    }

    @Override
    protected void errorCallback(String requestTag, Call paramCall, Exception paramException, int paramInt) {

    }



}
