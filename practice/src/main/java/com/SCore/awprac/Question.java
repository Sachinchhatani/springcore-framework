package com.SCore.awprac;

public class Question {
	private String Que;
	private Answer answer;
	public String getQue() {
		return Que;
	}
	public void setQue(String que) {
		Que = que;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(String que, Answer answer) {
		super();
		Que = que;
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [Que=" + Que + ", answer=" + answer + "]";
	}

}
