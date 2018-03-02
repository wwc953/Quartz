package com.wwc.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyJob {
	
	public void run() {
		System.out.println("开始执行：" + 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}
}
