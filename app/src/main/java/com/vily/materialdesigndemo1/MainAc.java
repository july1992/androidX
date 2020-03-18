package com.vily.materialdesigndemo1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.vily.materialdesigndemo1.transition.TransitionAc;
import com.vily.materialdesigndemo1.transition.TransitionFadeAc;

/**
 *  * description : 
 *  * Author : Vily
 *  * Date : 2020-03-16
 *  
 **/
public class MainAc extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_bottom_chat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainAc.this,BottomChatAc.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_bottom_sheet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainAc.this,BottomSheetAc.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_scroll).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainAc.this,TextInputLayoutAc.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_transition).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainAc.this, TransitionAc.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_transition_fade).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainAc.this, TransitionFadeAc.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_popu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainAc.this, PopuMenuAc.class);
                startActivity(intent);
            }
        });

    }
}
