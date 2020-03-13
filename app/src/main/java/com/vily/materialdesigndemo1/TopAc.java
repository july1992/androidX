package com.vily.materialdesigndemo1;

import android.graphics.Point;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;

/**
 *  * description : 
 *  * Author : Vily
 *  * Date : 2020-03-05
 *  
 **/
public class TopAc  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_top);

        Toolbar toolbar = findViewById(R.id.AppBar);
        int collapsingToolbarImageIndex = 6;
        int collapsingImageToolbarSize = 1200;
        ImageView collapsingToolbarImage = findViewById(R.id.CollapsingToolbarImage);

        setSupportActionBar(toolbar);
        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.CollapsingToolbarLayout);
        collapsingToolbarLayout.setTitle(toolbar.getTitle());
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.TextAppearance_Shrine_Logo);
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.TextAppearance_Shrine_Logo);

        Point windowSize = new Point();
        getWindowManager().getDefaultDisplay().getSize(windowSize);
        int windowWidth = windowSize.x;
        collapsingToolbarImage.setX(collapsingToolbarImage.getX() - windowWidth / 4);
        collapsingToolbarLayout.setScrimVisibleHeightTrigger(500);
    }
}
