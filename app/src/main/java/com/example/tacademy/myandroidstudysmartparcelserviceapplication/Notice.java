package com.example.tacademy.myandroidstudysmartparcelserviceapplication;

//import org.codehaus.jackson.annotate.JsonIgnoreProperties;
//import org.codehaus.jackson.annotate.JsonProperty;

import java.text.SimpleDateFormat;
import java.util.Date;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Notice {
//	@JsonProperty("title")
	String title;
//	@JsonProperty("content")
	String content;
//	@JsonProperty("date")
	String date;
	public Notice(String title,String content) {
		this.title = title;
		this.content = content;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		date = sdf.format(new Date());
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getDate(){
		return date;
	}
}
