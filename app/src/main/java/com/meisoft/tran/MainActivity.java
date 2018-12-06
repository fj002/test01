package com.meisoft.tran;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.meisoft.tran.fragment.ContactsFragment;
import com.meisoft.tran.fragment.HomeFragment;
import com.meisoft.tran.fragment.MessageFragment;
import com.meisoft.tran.fragment.MyFragment;
import com.meisoft.tran.fragment_adapter.HomeFragmentAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.mViewPager)
    ViewPager mviewpager;
    @BindView(R.id.tab)
    RadioGroup radioGroup;
    @BindViews({R.id.rb_home, R.id.rb_mess, R.id.rb_contacts, R.id.rb_my})
    List<RadioButton> rbs;
    private List<Fragment> fragmentList = new ArrayList<Fragment>();
    private HomeFragmentAdapter hfa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getData();
        //修改代码,重新获取
        setAdapter();
        setListener();
    }

    private void setListener() {
        mviewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
               // rbs.get(currentPressPosition).setChecked(false);
                switch (position) {
                    //滑动到某个位置某个位置的radioButton为选中状态,其它的为未选中状态
                    case 0:
                        rbs.get(0).setChecked(true);
                        break;
                    case 1:
                        rbs.get(1).setChecked(true);
                        break;
                    case 2:
                        rbs.get(2).setChecked(true);
                        break;
                    case 3:
                        rbs.get(3).setChecked(true);
                        break;

                    default:
                        break;
                }


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {
                    case R.id.rb_home:
                        mviewpager.setCurrentItem(0);
                        break;
                    case R.id.rb_mess:
                        mviewpager.setCurrentItem(1);
                        break;
                    case R.id.rb_contacts:
                        mviewpager.setCurrentItem(2);
                        break;
                    case R.id.rb_my:
                        mviewpager.setCurrentItem(3);
                        break;

                    default:
                        break;
                }
            }
        });
    }

    private void setAdapter() {
        HomeFragmentAdapter hfa = new HomeFragmentAdapter(getSupportFragmentManager(), fragmentList);
        mviewpager.setAdapter(hfa);
        //设置默认展示也为首页fragment
        mviewpager.setCurrentItem(0);
        rbs.get(0).setChecked(true);
    }

    private void getData() {
        HomeFragment hf = new HomeFragment();
        MessageFragment mf = new MessageFragment();
        ContactsFragment cf = new ContactsFragment();
        MyFragment myf = new MyFragment();
        fragmentList.add(hf);
        fragmentList.add(mf);
        fragmentList.add(cf);
        fragmentList.add(myf);
    }


}
