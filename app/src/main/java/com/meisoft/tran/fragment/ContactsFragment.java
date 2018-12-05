package com.meisoft.tran.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.meisoft.tran.R;

/**
 * Created by Administrator on 2018-01-12.
 */

public class ContactsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.contacts_fragment,container,false);
        return rootView;
    }
}
