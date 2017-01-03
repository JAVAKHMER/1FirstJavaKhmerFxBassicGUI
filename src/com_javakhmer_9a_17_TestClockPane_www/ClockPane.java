package com_javakhmer_9a_17_TestClockPane_www;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class ClockPane extends Pane{
	private int hour;
	private int minute;
	private int second;
	private int h = 250 ;
	private int w = 250 ;
	public ClockPane() {
		// TODO Auto-generated constructor stub
		setCurrentTime();
	}
	public ClockPane(int hour , int minute , int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public int getSecond(){
		return second;
	}
	public int getW(){
		return w;
	}
	public int getH(){
		return h;
	}
	public void setHour(int h)
	{
		hour =h;
		paintClock();
	}
	public void setMinute(int m){
		minute = m ;
		paintClock();
	}
	public void setSecond(int s){
		second = s;
		paintClock();
	}
	public void setW(int w1){
		w = w1;
		paintClock();
	}
	public void setH(int h1){
		h = h1 ;
		paintClock();
	}
	public void setCurrentTime(){
		// Construct a calendar for the current date and time
		Calendar calendar = new GregorianCalendar();
		
		// Set current hour, minute and second
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);
		
		paintClock(); // Repaint the clock
		
	}
	protected void paintClock(){
		double clockRadius = Math.min(w	, h ) * 0.8 * 0.5;
		double centerX = w/2;
		double centerY = h/2;
		Circle circle = new Circle(centerX, centerY, clockRadius);
		 circle.setFill(Color.WHITE);
		 circle.setStroke(Color.BLACK);
		 Text t1 = new Text(centerX - 5, centerY - clockRadius + 12,"12");
		 Text t2 = new Text(centerX - clockRadius + 3, centerY + 5,"9");
		  Text t3 = new Text(centerX + clockRadius - 10, centerY + 3,"3");
		 Text t4 = new Text(centerX - 3, centerY + clockRadius - 3,"6");
		
		 // Draw second hand
		 double sLength = clockRadius * 0.8;
		 double secondX = centerX + sLength * 
		 Math.sin(second * (2* Math.PI / 60));
		 double secondY = centerY - sLength * 
		 Math.cos(second * (2* Math.PI / 60));
		 Line sLine = new Line(centerX, centerY, secondX, secondY); 
		 sLine.setStroke(Color.RED);
		
		 // Draw minute hand
		 double mLength = clockRadius * 0.65;
		 double xMinute = centerX + mLength * 
		 Math.sin(minute * (2* Math.PI / 60));
		 double minuteY = centerY - mLength * 
		 Math.cos(minute * (2* Math.PI / 60));
		 Line mLine = new Line(centerX, centerY, xMinute, minuteY); 
		 mLine.setStroke(Color.BLUE);
		
		 // Draw hour hand
		 double hLength = clockRadius * 0.5;
		 double hourX = centerX + hLength * 
		 Math.sin((hour % 12+ minute / 60.0) * (2* Math.PI / 12));
		 double hourY = centerY - hLength *
		 Math.cos((hour % 12+ minute / 60.0) * (2* Math.PI / 12));
		 Line hLine = new Line(centerX, centerY, hourX, hourY); 
		 hLine.setStroke(Color.GREEN);
		
		 getChildren().clear();
		  getChildren().addAll(circle, t1, t2, t3, t4, sLine, mLine, hLine);
	}
}
