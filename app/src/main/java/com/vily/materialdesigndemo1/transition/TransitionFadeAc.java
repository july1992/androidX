package com.vily.materialdesigndemo1.transition;

import android.content.Context;
import android.os.Bundle;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;

import com.vily.materialdesigndemo1.R;

/**
 *  * description : 
 *  * Author : Vily
 *  * Date : 2020-03-13
 *  
 **/
public class TransitionFadeAc extends AppCompatActivity {

    private ImageView mIv_img;
    private RelativeLayout mLly;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_transition_fade);

        mIv_img = findViewById(R.id.iv_img);
        mLly = findViewById(R.id.lly);
    }

    public void add(View view) {
        toggleFabVisibilityWithTransition();
    }

    private void toggleFabVisibilityWithTransition() {
        Context context=getBaseContext();


        boolean entering = mIv_img.getVisibility() == View.GONE;
        MaterialFade materialFade = MaterialFade.create(context, entering);
        TransitionManager.beginDelayedTransition(mLly, materialFade);

        mIv_img.setVisibility(entering ? View.VISIBLE : View.GONE);
    }
}
