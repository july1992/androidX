package com.vily.materialdesigndemo1.transition;

import android.os.Bundle;

import android.view.View;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.TransitionManager;


import com.vily.materialdesigndemo1.R;


/**
 *  * description : 
 *  * Author : Vily
 *  * Date : 2020-03-06
 *  
 **/
public class TransitionAc extends AppCompatActivity {

    private static final int GRID_SPAN_COUNT = 2;

    private FrameLayout listContainer;

    private boolean listTypeGrid = true;
    private boolean listSorted = true;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_transition);

        listContainer =findViewById(R.id.list_container);

        findViewById(R.id.iv_image).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

}
