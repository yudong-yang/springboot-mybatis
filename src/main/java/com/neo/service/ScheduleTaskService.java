package com.neo.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleTaskService {

	private static final SimpleDateFormat dateformat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate=5000)
	public void reportFormatCurrentTime(){
		System.out.println("每隔5秒执行一次===="+dateformat.format(new Date()));
	}
}
