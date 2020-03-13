package com.vily.materialdesigndemo1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 *  * description : 
 *  * Author : Vily
 *  * Date : 2020-03-10
 *  
 **/
public class ContainerViewGroup extends ViewGroup {
    public ContainerViewGroup(Context context) {
        super(context);
    }

    public ContainerViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ContainerViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }
}
