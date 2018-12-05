package com.meisoft.tran.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.meisoft.tran.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2018-02-28.
 */

public class SAdapter extends RecyclerView.Adapter<SAdapter.ViewHolder> {
    private List<String> list;
    private Context context;

    public SAdapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public SAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolder holder = null;
            LayoutInflater inflater=LayoutInflater.from(context);
           View view=inflater.inflate(R.layout.list_la,null);
           holder=new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv.setText(list.get(position));

    }


    @Override
    public int getItemCount() {
        return list==null?0:list.size();
    }

    //    @Override
//    public int getCount() {
//        return list==null?0:list.size();
//    }
//
//    @Override
//    public Object getItem(int i) {
//        return list.get(i);
//    }
//
//    @Override
//    public long getItemId(int i) {
//        return i;
//    }
//
//    @Override
//    public View getView(int i, View view, ViewGroup viewGroup) {
//        ViewHolder holder = null;
//        if (view==null){
//            LayoutInflater inflater=LayoutInflater.from(context);
//            view=inflater.inflate(R.layout.list_la,null);
//            holder=new ViewHolder(view);
//            view.setTag(holder);
//        }else{
//            holder=(ViewHolder) view.getTag();
//        }
//        //向模板中添加数据
//        holder.tv.setText(list.get(i));
//        return view;
//    }
    static class ViewHolder extends RecyclerView.ViewHolder  {
        @BindView(R.id.tv)
         TextView tv;


        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
