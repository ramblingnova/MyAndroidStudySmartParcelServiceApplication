package com.example.tacademy.myandroidstudysmartparcelserviceapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    ExpandableListView listView;
    MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ExpandableListView) findViewById(R.id.expandable_list_view);
        mAdapter = new MyAdapter();
        listView.setAdapter(mAdapter);

        initData();

        setTitle("공지사항");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.color.actionBarColor));
    }

    private void initData() {
        mAdapter.add("한진택배와 함께하는 택배예약 OPEN 이벤트 당첨자 발표 ", new Date(), "안녕하세요. 스마트택배 개발팀입니다.");
        mAdapter.add("[안드로이드] 알뜰폰을 루팅 기기로 인식하여 쇼핑몰에서 불러오기가 안되는 경우 ", new Date(), "알뜰폰을 사용하는 고객님 중에서");
        mAdapter.add("[쇼핑다이어리] 필독!! 네이버페이 로그인이 안되는 경우 대응 안내 ", new Date(), "내용");
        mAdapter.add("[안드로이드] 과거버전 지원 중단 안내 ", new Date(), "내용");
        mAdapter.add("[안드로이드] 3.0.3 업데이트 안내 ", new Date(), "내용");
        mAdapter.add("[안드로이드] 3.0 업데이트 안내 ", new Date(), "내용");
        mAdapter.add("[중요] 스마트택배 사칭앱 주의 안내 ", new Date(), "내용");
        mAdapter.add("동부택배와 엘로우캡 합병 후 KG로지스 명칭 혼용 안내 ", new Date(), "내용");
        mAdapter.add("로젠택배 1:1 실시간 상담 서비스 오픈! ", new Date(), "내용");
        mAdapter.add("비비에송 스미싱 문자 경고 관련 사과문 ", new Date(), "내용");
        mAdapter.add("그룹11", new Date(), "내용");
        mAdapter.add("그룹12", new Date(), "내용");
        mAdapter.add("그룹13", new Date(), "내용");
        mAdapter.add("그룹14", new Date(), "내용");
        mAdapter.add("그룹15", new Date(), "내용");
        mAdapter.add("그룹16", new Date(), "내용");
        mAdapter.add("그룹17", new Date(), "내용");
        mAdapter.add("그룹18", new Date(), "내용");
        mAdapter.add("그룹19", new Date(), "내용");
        mAdapter.add("그룹20", new Date(), "내용");
        mAdapter.add("그룹21", new Date(), "내용");
        mAdapter.add("그룹22", new Date(), "내용");
        mAdapter.add("그룹23", new Date(), "내용");
        mAdapter.add("그룹24", new Date(), "내용");
        mAdapter.add("그룹25", new Date(), "내용");
        mAdapter.add("그룹26", new Date(), "내용");
        mAdapter.add("그룹27", new Date(), "내용");
        mAdapter.add("그룹28", new Date(), "내용");
        mAdapter.add("그룹29", new Date(), "내용");
        mAdapter.add("그룹30", new Date(), "내용");
    }
}
