package kr.ac.hansung.model;

public class RegistedCourse {
	private String course_id;
	private int year;
	private int term;
	private String division;
	private String coursename;
	private int credit;
	private int sum;
	
	public RegistedCourse(String course_id, int year, 
			int term, String division, String coursename, int credit) {
		this.course_id = course_id;
		this.year = year;
		this.term = term;
		this.division = division;
		this.coursename = coursename;
		this.credit = credit;
	}
	
	

	public RegistedCourse() {
		// TODO Auto-generated constructor stub
	}
	
	public void setSum(int sum){
		this.sum = sum;
	}
	
	public int getSum(){
		return sum;
	}

	public String getCourse_id() {
		return course_id;
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	@Override
	public String toString() {
		return "RegistedCourse [course_id=" + course_id + ", year=" + year + ","
				+ " term=" + term + ", division=" + division
				+ ", coursename=" + coursename + ", credit=" + credit + "]";
	}
	
	
	
}
