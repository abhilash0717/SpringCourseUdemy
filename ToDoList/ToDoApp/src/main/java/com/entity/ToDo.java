package com.entity;

import java.sql.Date;

public class ToDo {
	private String title;
	private String content;
	private Date toDoDate;
	
	public ToDo() {
		
	}
	
	public ToDo(String title, String content, Date date) {
		super();
		this.title = title;
		this.content = content;
		this.toDoDate = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public Date getToDoDate() {
		return toDoDate;
	}

	public void setToDoDate(Date toDoDate) {
		this.toDoDate = toDoDate;
	}

	@Override
	public String toString() {
		return "ToDo [title=" + title + ", content=" + content + ", toDoDate=" + toDoDate + "]";
	}

	
}
