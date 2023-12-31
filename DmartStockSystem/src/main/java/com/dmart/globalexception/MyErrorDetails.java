package com.dmart.globalexception;

import java.time.LocalDateTime;

public class MyErrorDetails {
	   private LocalDateTime timestamp;
	   private String messege;
	   private String decsription;
	   public MyErrorDetails() {
		   
	   }
	public MyErrorDetails(LocalDateTime timestamp, String messege, String decsription) {
		super();
		this.timestamp = timestamp;
		this.messege = messege;
		this.decsription = decsription;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessege() {
		return messege;
	}
	public void setMessege(String messege) {
		this.messege = messege;
	}
	public String getDecsription() {
		return decsription;
	}
	public void setDecsription(String decsription) {
		this.decsription = decsription;
	}
	@Override
	public String toString() {
		return "MyErrorDetails [timestamp=" + timestamp + ", messege=" + messege + ", decsription=" + decsription + "]";
	}
}
