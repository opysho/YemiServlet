package za.co.fnb.People;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Information")
public class Person {

	@Column(name = "surname")
	private String surname;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "id_number")
	private Long identityNumber;
	@Column(name = "date_of_birth")
	private String dateOfBirth;
	@Column(name = "age")
	private int age;
	@Column(name = "sex")
	private String sex;
	@Column(name = "address")
	private String address;
	@Column(name = "email")
	private String email;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "school_attended")
	private String previousSchool;
	@Column(name = "grade_completed")
	private String gradeCompleted;
	@Column(name = "grade_apply")
	private String grade;
	@Column(name = "subject1")
	private String subject1;
	@Column(name = "subject2")
	private String subject2;
	@Column(name = "subject3")
	private String subject3;
	@Column(name = "subject4")
	private String subject4;
	@Column(name = "subject5")
	private String subject5;
	@Column(name = "guardian_fullnames")
	private String guardianFullnames;
	@Column(name = "guardian_address")
	private String guardianAddress;
	@Column(name = "guardian_phonenumber")
	private String guardianPhoneNumber;
	@Column(name = "position")
	private String post;
	@Id
	@Column(name = "personal_number")
	private String accessNumber;
	@Column(name = "password")
	private String password;

	public Person(String surname, String firstName, Long identityNumber, String dateOfBirth, int age, String sex,
			String address, String email, String phoneNumber, String previousSchool, String gradeCompleted,
			String grade, String subject1, String subject2, String subject3, String subject4, String subject5,
			String guardianFullnames, String guardianAddress, String guardianPhoneNumber, String post,
			String accessNumber, String password) {
		super();
		this.surname = surname;
		this.firstName = firstName;
		this.identityNumber = identityNumber;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.sex = sex;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.previousSchool = previousSchool;
		this.gradeCompleted = gradeCompleted;
		this.grade = grade;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
		this.subject5 = subject5;
		this.guardianFullnames = guardianFullnames;
		this.guardianAddress = guardianAddress;
		this.guardianPhoneNumber = guardianPhoneNumber;
		this.post = post;
		this.accessNumber = accessNumber;
		this.password = password;
	}

	public Person() {

	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Long getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(Long identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPreviousSchool() {
		return previousSchool;
	}

	public void setPreviousSchool(String previousSchool) {
		this.previousSchool = previousSchool;
	}

	public String getGradeCompleted() {
		return gradeCompleted;
	}

	public void setGradeCompleted(String gradeCompleted) {
		this.gradeCompleted = gradeCompleted;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSubject1() {
		return subject1;
	}

	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}

	public String getSubject2() {
		return subject2;
	}

	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}

	public String getSubject3() {
		return subject3;
	}

	public void setSubject3(String subject3) {
		this.subject3 = subject3;
	}

	public String getSubject4() {
		return subject4;
	}

	public void setSubject4(String subject4) {
		this.subject4 = subject4;
	}

	public String getSubject5() {
		return subject5;
	}

	public void setSubject5(String subject5) {
		this.subject5 = subject5;
	}

	public String getGuardianFullnames() {
		return guardianFullnames;
	}

	public void setGuardianFullnames(String guardianFullnames) {
		this.guardianFullnames = guardianFullnames;
	}

	public String getGuardianAddress() {
		return guardianAddress;
	}

	public void setGuardianAddress(String guardianAddress) {
		this.guardianAddress = guardianAddress;
	}

	public String getGuardianPhoneNumber() {
		return guardianPhoneNumber;
	}

	public void setGuardianPhoneNumber(String guardianPhoneNumber) {
		this.guardianPhoneNumber = guardianPhoneNumber;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getAccessNumber() {
		return accessNumber;
	}

	public void setAccessNumber(String accessNumber) {
		this.accessNumber = accessNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Surname = " + surname + ", \nFirst Name = " + firstName + ", \nIdentity Number = " + identityNumber
				+ ", Date Of Birth = " + dateOfBirth + ", Age = " + age + ", Sex = " + sex + ", Address = " + address
				+ ", Email = " + email + ", Phone Number = " + phoneNumber + ", Previous School Attended= "
				+ previousSchool + ", Grade Completed = " + gradeCompleted + ", Present Grade = " + grade
				+ ", Subject = " + subject1 + ", Subject = " + subject2 + ", Subject = " + subject3 + ", Subject = "
				+ subject4 + ", Subject = " + subject5 + ", Guardian Full names = " + guardianFullnames
				+ ", Guardian Address = " + guardianAddress + ", Guardian PhoneNumber = " + guardianPhoneNumber
				+ ", Post = " + post + ", Access Number = " + accessNumber + ", Password = " + password ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accessNumber, address, age, dateOfBirth, email, firstName, grade, gradeCompleted,
				guardianAddress, guardianFullnames, guardianPhoneNumber, identityNumber, password, phoneNumber, post,
				previousSchool, sex, subject1, subject2, subject3, subject4, subject5, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return accessNumber == other.accessNumber && Objects.equals(address, other.address) && age == other.age
				&& Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(grade, other.grade)
				&& Objects.equals(gradeCompleted, other.gradeCompleted)
				&& Objects.equals(guardianAddress, other.guardianAddress)
				&& Objects.equals(guardianFullnames, other.guardianFullnames)
				&& Objects.equals(guardianPhoneNumber, other.guardianPhoneNumber)
				&& Objects.equals(identityNumber, other.identityNumber) && Objects.equals(password, other.password)
				&& Objects.equals(phoneNumber, other.phoneNumber) && Objects.equals(post, other.post)
				&& Objects.equals(previousSchool, other.previousSchool) && Objects.equals(sex, other.sex)
				&& Objects.equals(subject1, other.subject1) && Objects.equals(subject2, other.subject2)
				&& Objects.equals(subject3, other.subject3) && Objects.equals(subject4, other.subject4)
				&& Objects.equals(subject5, other.subject5) && Objects.equals(surname, other.surname);
	}

	public boolean logIn(String accessNumber, String password, Person person) {
		if (accessNumber.trim().equals(person.accessNumber) && password.trim().equals(person.getPassword())) {
			return true;
		} else {
			return false;
		}
	}
}
