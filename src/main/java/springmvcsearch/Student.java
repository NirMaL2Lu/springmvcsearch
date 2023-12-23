package springmvcsearch;

import java.util.Date;
import java.util.List;

public class Student {

	private String name;
	private Long id;
	private Date date;
	private List<String> Courses;
	private String gender;
	private String StudentType;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<String> getCourses() {
		return Courses;
	}
	public void setCourses(List<String> courses) {
		Courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStudentType() {
		return StudentType;
	}
	public void setStudentType(String studentType) {
		StudentType = studentType;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", date=" + date + ", Courses=" + Courses + ", gender=" + gender
				+ ", StudentType=" + StudentType + ", address=" + address + "]";
	}
	
	
	
	
}
