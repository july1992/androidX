package com.vily.materialdesigndemo1.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import com.vily.materialdesigndemo1.R;

/**
 *  * description : 设备更新对话框
 *  
 **/
public class UpdateDialog extends Dialog   {

    private static final String TAG = "UpdateDialog";



    private Context context;


    public UpdateDialog(Context context, int themeResId) {
        super(context, themeResId);
        this.context = context;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog);
        initView();
    }

    private void initView() {
//        setCanceledOnTouchOutside(false);


    }



}
