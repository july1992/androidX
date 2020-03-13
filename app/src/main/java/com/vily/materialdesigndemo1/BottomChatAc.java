package com.vily.materialdesigndemo1;

import android.os.Bundle;
import android.view.View;

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

    private RecyclerView mRv_list;
    private ChatAdapter mChatAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bottomchat);

        mRv_list = findViewById(R.id.rv_list);

        final BottomSheetBehavior bottomSheetBehavior=BottomSheetBehavior.from(findViewById(R.id.design_bottom_sheet));
        //设置默认先隐藏
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
        bottomSheetBehavior.setPeekHeight(200);

        bottomSheetBehavior.setHalfExpandedRatio(0.5f);



        initRecycle();
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
