package com.neo.entity;

/**
 * 成绩表
 * @author Administrator
 *
 */
public class SeleCourse {

	private int sno;//学号
	private String bno;//课程号
	private Double score;//成绩
	
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
