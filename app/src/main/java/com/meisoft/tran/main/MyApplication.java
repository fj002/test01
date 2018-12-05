package com.meisoft.tran.main;

import android.app.Application;

import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.cookie.CookieJarImpl;
import com.zhy.http.okhttp.cookie.store.PersistentCookieStore;
import com.zhy.http.okhttp.https.HttpsUtils;
import com.zhy.http.okhttp.log.LoggerInterceptor;

import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import okhttp3.OkHttpClient;


/**
 * Created by Administrator on 2018-01-12.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CookieJarImpl cookieJar1 = new CookieJarImpl(new PersistentCookieStore(getApplicationContext()));
        HttpsUtils.SSLParams sslParams = HttpsUtils.getSslSocketFactory(null, null, null);

//        CookieJarImpl cookieJar1 = new CookieJarImpl(new MemoryCookieStore());
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10000L, TimeUnit.MILLISECONDS)
                .readTimeout(10000L, TimeUnit.MILLISECONDS)
                .writeTimeout(10000L, TimeUnit.MILLISECONDS)
                .addInterceptor(new LoggerInterceptor("TAG"))
                .cookieJar(cookieJar1)
                .hostnameVerifier(new HostnameVerifier()
                {
                    @Override
                    public boolean verify(String hostname, SSLSession session)
                    {
                        return true;
                    }
                })
                .sslSocketFactory(sslParams.sSLSocketFactory, sslParams.trustManager)
                .build();
        OkHttpUtils.initClient(okHttpClient);

    }
}
