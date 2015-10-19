package com.example.tacademy.myandroidstudysmartparcelserviceapplication;

import android.content.Context;
import android.text.Html;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Tacademy on 2015-10-19.
 */
public class ChildItemView extends FrameLayout {
    public ChildItemView(Context context) {
        super(context);
        init();
    }

    TextView contentView;

    private void init() {
        inflate(getContext(), R.layout.view_child_item, this);
        contentView = (TextView) findViewById(R.id.text_content);
    }

    public void setChildItem(ChildItem item) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        contentView.setText(Html.fromHtml(item.child + "<font color='#86A7BE'><small>" + sdf.format(item.date) + "</small></font>"));
    }
}
