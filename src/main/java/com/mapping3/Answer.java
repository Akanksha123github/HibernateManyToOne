package com.mapping3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="ans")
public class Answer {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int Ans_id;
	@Column
	private String ans;
	@ManyToOne
	private Question question;

	public int getAns_id() {
		return Ans_id;
	}

	public void setAns_id(int ans_id) {
		Ans_id = ans_id;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer [Ans_id=" + Ans_id + ", ans=" + ans + ", question=" + question + "]";
	}


}
