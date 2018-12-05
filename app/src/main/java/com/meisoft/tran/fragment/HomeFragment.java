package com.meisoft.tran.fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lidroid.xutils.BitmapUtils;
import com.meisoft.tran.R;
import com.meisoft.tran.main.SecondActivity;
import com.meisoft.tran.utils.Constants;
import com.meisoft.tran.widget.ImageCycleView;
import com.meisoft.tran.widget.MyMarqueeTextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018-01-11.
 */

public class HomeFragment extends Fragment {
    @BindView(R.id.icv_topView)
    ImageCycleView mImageCycleView;
    @BindView(R.id.tv_contents)
    MyMarqueeTextView tv;
    @BindView(R.id.tv_ben)
    TextView tvBen;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
       View rootView=inflater.inflate(R.layout.homefragment,container,false);
        ButterKnife.bind(this,rootView);
        initView();
        getPhotos();
       return rootView;
    }

    private void getPhotos() {
        List<ImageCycleView.ImageInfo> list=new ArrayList<ImageCycleView.ImageInfo>();
        //使用网络加载图片
        list.add(new ImageCycleView.ImageInfo(Constants.SERVER_URL+"/"+Constants.IMAGE_1,"",""));
        list.add(new ImageCycleView.ImageInfo(Constants.SERVER_URL+"/"+Constants.IMAGE_2,"",""));
        list.add(new ImageCycleView.ImageInfo(Constants.SERVER_URL+"/"+Constants.IMAGE_3, "", ""));
//		mImageCycleView.setOnPageClickListener(new ImageCycleView.OnPageClickListener() {
//			@Override
//			public void onClick(View imageView, ImageCycleView.ImageInfo imageInfo) {
//				Toast.makeText(MainActivity.this, "你点击了" + imageInfo.value.toString(), Toast.LENGTH_SHORT).show();
//			}
//		});

        mImageCycleView.loadData(list, new ImageCycleView.LoadImageCallBack() {
            @Override
            public ImageView loadAndDisplay(ImageCycleView.ImageInfo imageInfo) {

                BitmapUtils bitmapUtils = new BitmapUtils(getActivity());
                ImageView imageView = new ImageView(getActivity());
                bitmapUtils.display(imageView, imageInfo.image.toString());
                return imageView;
            }
        });
    }

    private void initView() {
        //循环播放字体,获取焦点
        tv.isFocused();
        tv.requestFocus();
        // 				mImageCycleView.setAutoCycle(false); //关闭自动播放
// 				mImageCycleView.setCycleDelayed(2000);//设置自动轮播循环时间

        mImageCycleView.setIndicationStyle(ImageCycleView.IndicationStyle.COLOR,
                Color.WHITE, Color.RED, 1f);

// 				mImageCycleView.setIndicationStyle(ImageCycleView.IndicationStyle.IMAGE,
// 						R.drawable.dian_unfocus, R.drawable.dian_focus, 1f);
    }
    @OnClick({R.id.tv_ben})
    public void onClick(View v){
        switch (v.getId()) {
        		case R.id.tv_ben:
        			startActivity(new Intent(getActivity(), SecondActivity.class));
        			break;

        		default:
        			break;
        		}
    }

}
