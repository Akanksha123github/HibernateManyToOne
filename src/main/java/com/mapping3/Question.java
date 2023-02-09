package com.mapping3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "que")
public class Question {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int que_id;
	@Column
	private String question;
	
	
	public int getQue_id() {
		return que_id;
	}
	public void setQue_id(int que_id) {
		this.que_id = que_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Question [que_id=" + que_id + ", question=" + question + "]";
	}
	
	
}
