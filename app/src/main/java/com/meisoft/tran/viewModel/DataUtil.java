package com.meisoft.tran.viewModel;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.widget.TextView;

import com.meisoft.tran.R;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

import okhttp3.Call;
import okhttp3.MediaType;

public abstract class DataUtil {

	/**
	 * 发送请求的公用方法 默认不存取缓存
	 *
	 * @param jsonObject
	 *            封装请求参数的对象
	 * @param requestTag
	 *            请求标识
	 * @param methodName
	 *            请求方法名称
	 * @param url
	 *            请求的URL
	 *
	 * */
	protected void requestHttp(final JSONObject jsonObject,  final String requestTag,
			final String methodName, final String url,final String type) throws Exception// throws
															// AppException
	{
		new Thread(new Runnable() {
			@Override
			public void run() {
				HashMap<String, String> headers = new HashMap<String, String>();
				headers.put("Accept","application/json");
				headers.put("Wrapper-Return", "true");




				OkHttpUtils
				.postString()
						.content(jsonObject.toString())
						.mediaType(MediaType.parse("application/json;charset=utf-8"))
				.url(url)
				.tag(requestTag)


						.headers(headers)
				.build()
				.execute(new MyStringCallback(requestTag));

			}
			
		}).start();
	}
	 class MyStringCallback extends StringCallback {
		 String requestTage;

		public MyStringCallback(String requestTag) {
			requestTage=requestTag;
		}

		@Override
		public void onError(final Call paramCall, final Exception paramException,
				final int paramInt) {

					// TODO Auto-generated method stub
					errorCallback(requestTage, paramCall, paramException, paramInt);


		}

		@Override
		public void onResponse(final String paramT, int paramInt) {

					try {
						JSONObject jsonObject=new JSONObject(paramT);
						successCallback(jsonObject, requestTage);
					} catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					

			
			
		}

	}

	/**
	 * 描述：发送HTTP请求后的回调方法
	 *
	 * @param jsonObject
	 *            解密后的数据部分
	 * @param requestTag
	 *            请求标识
	 * **/
	protected abstract void successCallback(JSONObject jsonObject,
			String requestTag);

	/**
	 * 描述：发送HTTP请求后的回调方法
	 *
	 *            框架请求错误对象
	 * @param requestTag
	 *            请求标识
	 * **/
	protected abstract void errorCallback(String requestTag, Call paramCall,
			Exception paramException, int paramInt);

	private Dialog loadDialog;

	protected void showLoading(String msgTip,final String requestTag,Context context) {
		if (loadDialog == null) {
			loadDialog = new Dialog(context, R.style.DialogTheme);
			loadDialog.setContentView(R.layout.dialog_loading_new);
			loadDialog.setOnCancelListener(new OnCancelListener() {
				@Override
				public void onCancel(DialogInterface dialog) {
					 if(requestTag!=null){
						 OkHttpUtils.getInstance().cancelTag(requestTag);
					 }
				}
			});
			loadDialog.setCancelable(true);
			loadDialog.setCanceledOnTouchOutside(false);
		}
		if (msgTip != null) {
			TextView msg = (TextView) loadDialog.getWindow().findViewById(
					R.id.loadMsg);
			msg.setText(msgTip);
		}
		if(loadDialog.isShowing())
			loadDialog.dismiss();
		loadDialog.show();
	}

	protected void hideLoading() {
		try {
			if (loadDialog != null && loadDialog.isShowing()) {
				loadDialog.dismiss();
				loadDialog = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


