package com.vily.materialdesigndemo1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;

/**
 *  * description : 
 *  * Author : Vily
 *  * Date : 2020-03-06
 *  
 **/
public class BottomSheetAc extends AppCompatActivity {

    private static final String TAG = "BottomSheetAc";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bottomsheet);


//        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getApplicationContext());
//        bottomSheetDialog.setContentView(R.layout.cat_bottomsheet_content);
//        bottomSheetDialog.setDismissWithAnimation(true);

        final BottomSheetBehavior bottomSheetBehavior=BottomSheetBehavior.from(findViewById(R.id.design_bottom_sheet));
        //设置默认先隐藏
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
        bottomSheetBehavior.setPeekHeight(200);

        bottomSheetBehavior.setHalfExpandedRatio(0.5f);

        findViewById(R.id.btn_open_bottomsheet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bottomSheetBehavior.getState() == BottomSheetBehavior.STATE_EXPANDED) {
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                } else if (bottomSheetBehavior.getState() == BottomSheetBehavior.STATE_COLLAPSED) {
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                }

            }
        });

        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                Log.i(TAG, "onStateChanged: -----:"+newState);
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

                Log.i(TAG, "onSlide: ----:"+slideOffset);
            }
        });
    }
}
