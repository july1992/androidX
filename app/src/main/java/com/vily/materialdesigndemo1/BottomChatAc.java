package com.vily.materialdesigndemo1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

import java.util.ArrayList;
import java.util.List;

/**
 *  * description : 
 *  * Author : Vily
 *  * Date : 2020-03-10
 *  
 **/
public class BottomChatAc extends AppCompatActivity {
    private static final String TAG = "BottomChatAc";
    private RecyclerView mRv_list;
    private ChatAdapter mChatAdapter;
    private EditText mEt_input;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bottomchat);

        mRv_list = findViewById(R.id.rv_list);

        final BottomSheetBehavior bottomSheetBehavior=BottomSheetBehavior.from(findViewById(R.id.design_bottom_sheet));
        //设置默认先隐藏
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
        bottomSheetBehavior.setPeekHeight(200);
//
//        bottomSheetBehavior.setHalfExpandedRatio(0.5f);
//
//
        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                Log.i(TAG, "onStateChanged: ------:"+newState);
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

                Log.i(TAG, "onSlide: ------:"+slideOffset);
            }
        });

        initRecycle();


        final ImageView iv_emoji = findViewById(R.id.iv_emoji);
        iv_emoji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iv_emoji.setSelected(!iv_emoji.isSelected());
                if(iv_emoji.isSelected()){
                    hideSoft();
                    bottomSheetBehavior.setPeekHeight(1200,true);

                }else{
                    bottomSheetBehavior.setPeekHeight(900,true);
                    showSoft();
                }

            }
        });

        ImageView iv_add = findViewById(R.id.iv_add);
        mEt_input = findViewById(R.id.et_input);
        iv_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetBehavior.setPeekHeight(600,true);
            }
        });




    }

    public void hideSoft(){
        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(mEt_input.getWindowToken(), 0);
    }
    public void showSoft(){
        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        mEt_input.requestFocus();
        imm.showSoftInput(mEt_input, 0);
    }


    private int mPosition=0;
    private void initRecycle() {

        mRv_list.setLayoutManager(new LinearLayoutManager(this));

        List<String> data=new ArrayList<>();
        for(int i=0;i<10;i++){
            data.add("xxxxxxx:"+i);

        }
        mPosition=9;

        mChatAdapter = new ChatAdapter(data);
        mRv_list.setAdapter(mChatAdapter);

    }

    public void add(View view) {
        mPosition++;
        mChatAdapter.addData("xxxxxxx:"+mPosition);
    }
}
