package com.neo.entity;

public class SeleCourse {

	private int sno;
	private String bno;
	private Double score;
	
	public SeleCourse() {
		super();
	}
	public SeleCourse(int sno, String bno, Double score) {
		super();
		this.sno = sno;
		this.bno = bno;
		this.score = score;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getBno() {
		return bno;
	}
	public void setBno(String bno) {
		this.bno = bno;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "SeleCourse [sno=" + sno + ", bno=" + bno + ", score=" + score
				+ "]";
	}
}
