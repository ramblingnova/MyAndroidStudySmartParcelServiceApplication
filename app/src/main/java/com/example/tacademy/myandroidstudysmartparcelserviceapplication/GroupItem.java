package com.example.tacademy.myandroidstudysmartparcelserviceapplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Tacademy on 2015-10-19.
 */
public class GroupItem {
    String groupTitle;
    Date date;
    List<ChildItem> children = new ArrayList<ChildItem>();
}
