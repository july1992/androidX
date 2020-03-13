package com.vily.materialdesigndemo1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 *  * description : 
 *  * Author : Vily
 *  * Date : 2020-03-13
 *  
 **/
public class ChatAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public ChatAdapter(@Nullable List<String> data) {
        super(R.layout.adapt_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

        TextView tv_item = helper.getView(R.id.tv_item);

        tv_item.setText(item);
    }
}
