package com.example.tacademy.myandroidstudysmartparcelserviceapplication;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;

/**
 * Created by Tacademy on 2015-10-19.
 */
public class GroupItemView extends FrameLayout {
    public GroupItemView(Context context) {
        super(context);
        init();
    }

    public GroupItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public GroupItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    TextView titleView;

    private void init() {
        inflate(getContext(), R.layout.view_group_item, this);
        titleView = (TextView) findViewById(R.id.group_text_view1);
    }

    public void setGroupItem(GroupItem item) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        titleView.setText(Html.fromHtml(item.groupTitle + "<font color='#86A7BE'><small>" + sdf.format(item.date) + "</small></font>"));
    }

    public void setIsExpand(boolean expand) {
        if (expand) {
//            setBackgroundColor(Color.GREEN);
            ImageView imageView = (ImageView) findViewById(R.id.group_image_view);
            imageView.setRotation(90);
        } else {
//            setBackgroundColor(Color.TRANSPARENT);
            ImageView imageView = (ImageView) findViewById(R.id.group_image_view);
            imageView.setRotation(0);
        }
    }
}
