package com.meisoft.tran.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;

public class MyMarqueeTextView  extends AppCompatTextView {
	  public MyMarqueeTextView(Context context) {  
	        super(context);  
	        createView();  
	    }  
	  
	    public MyMarqueeTextView(Context context, AttributeSet attrs) {  
	        super(context, attrs);  
	        createView();  
	    }  
	  
	    public MyMarqueeTextView(Context context, AttributeSet attrs, int defStyle) {  
	        super(context, attrs, defStyle);  
	        createView();  
	    }  
	  
	    private void createView() {  
	        setEllipsize(TruncateAt.MARQUEE);  
	        setMarqueeRepeatLimit(-1);  
	        setFocusableInTouchMode(true);  
	    }

	    @Override
	    protected void onFocusChanged(boolean focused, int direction,
	            Rect previouslyFocusedRect) {
	        if (focused) {
	            super.onFocusChanged(focused, direction, previouslyFocusedRect);
	        }
	    }

	    @Override
	    public void onWindowFocusChanged(boolean focused) {
	        if (focused) {
	            super.onWindowFocusChanged(focused);
	        }
	    }

	    @Override
	    public boolean isFocused() {
	        return true;
	    }
}
