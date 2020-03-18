package com.vily.materialdesigndemo1;

import android.content.Intent;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.PopupMenu;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;
import com.vily.materialdesigndemo1.dialog.UpdateDialog;
import com.vily.materialdesigndemo1.transition.TransitionAc;
import com.vily.materialdesigndemo1.transition.TransitionFadeAc;

import java.util.zip.Inflater;

/**
 *  * description : 
 *  * Author : Vily
 *  * Date : 2020-03-16
 *  
 **/
public class PopuMenuAc extends AppCompatActivity {


    private static final String TAG = "PopuMenuAc";
    private RelativeLayout mRoot;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popu);
        mRoot = findViewById(R.id.root);

    }

    public void open(View view) {

        PopupMenu popup = new PopupMenu(PopuMenuAc.this, view,Gravity.NO_GRAVITY, R.attr.popupMenuStyle,R.style.MaterialDialog);
        // Inflating the Popup using xml file
        popup.getMenuInflater().inflate(R.menu.menu_with_icons, popup.getMenu());

        if (popup.getMenu() instanceof MenuBuilder) {
            MenuBuilder menuBuilder = (MenuBuilder) popup.getMenu();
            //noinspection RestrictedApi
            menuBuilder.setOptionalIconsVisible(true);
            for (MenuItem item : menuBuilder.getVisibleItems()) {
//                final int iconMarginPx =
//                        (int) TypedValue.applyDimension(
//                                        TypedValue.COMPLEX_UNIT_DIP, 8, getResources().getDisplayMetrics());


                final int iconMarginPx = 10;
                if (item.getIcon() != null) {
                    item.setIcon(getResources().getDrawable(R.mipmap.ic_launcher));
//                    if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
//                        item.setIcon(new InsetDrawable(item.getIcon(), iconMarginPx, 0, iconMarginPx, 0));
//                    } else {
//                        item.setIcon(
//                                new InsetDrawable(item.getIcon(), iconMarginPx, 0, iconMarginPx, 0) {
//                                    @Override
//                                    public int getIntrinsicWidth() {
//                                        return getIntrinsicHeight() + iconMarginPx + iconMarginPx;
//                                    }
//                                });
//                    }
                }
            }
        }
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Log.i(TAG, "onMenuItemClick: ---:" + item.getTitle());
                return true;
            }
        });

        popup.show();


    }

    public void dialog(View view) {

//        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(this,R.style.MaterialDialog)
//                .setTitle("sssss")
//                .setPositiveButton("qqqq", null)
//                .setNeutralButton("ffff", null);
//        materialAlertDialogBuilder.show();

//        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this,R.style.MaterialDialog);
//        LayoutInflater layoutInflater=LayoutInflater.from(this);
//        View view1 = layoutInflater.inflate(R.layout.dialog, mRoot, false);
//        builder.setView(R.layout.dialog);
//
//        builder.show();

        UpdateDialog mDialog = new UpdateDialog(this,R.style.MaterialDialog);
        mDialog.show();
    }


}
