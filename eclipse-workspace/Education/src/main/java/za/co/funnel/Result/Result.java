package za.co.funnel.Result;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Result")
public class Result {

	@Column(name = "personal_number")
	private String examNumber;
	@Id
	@Column(name = "subject_name")
	private String subject;
	@Column(name = "assignment")
	private double assignmentMarks;
	@Column(name = "test")
	private double testMarks;
	@Column(name = "exam")
	private double examinationMarks;
	@Column(name = "average")
	private double averageMarks;

	public Result(String examNumber, String subject, double assignmentMarks, double testMarks, double examinationMarks,
			double averageMarks) {
		super();
		this.examNumber = examNumber;
		this.subject = subject;
		this.assignmentMarks = assignmentMarks;
		this.testMarks = testMarks;
		this.examinationMarks = examinationMarks;
		this.averageMarks = averageMarks;
	}

	public Result() {

	}

	public String getExamNumber() {
		return examNumber;
	}

	public void setExamNumber(String examNumber) {
		this.examNumber = examNumber;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getAssignmentMarks() {
		return assignmentMarks;
	}

	public void setAssignmentMarks(double assignmentMarks) {
		this.assignmentMarks = assignmentMarks;
	}

	public double getTestMarks() {
		return testMarks;
	}

	public void setTestMarks(double testMarks) {
		this.testMarks = testMarks;
	}

	public double getExaminationMarks() {
		return examinationMarks;
	}

	public void setExaminationMarks(double examinationMarks) {
		this.examinationMarks = examinationMarks;
	}

	public double getAverageMarks() {
		return averageMarks;
	}

	public void setAverageMarks(double averageMarks) {
		this.averageMarks = averageMarks;
	}

	@Override
	public String toString() {
		return "Result [examNumber=" + examNumber + ", subject=" + subject + ", assignmentMarks=" + assignmentMarks
				+ ", testMarks=" + testMarks + ", examinationMarks=" + examinationMarks + ", averageMarks="
				+ averageMarks + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(assignmentMarks, averageMarks, examNumber, examinationMarks, subject, testMarks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Result other = (Result) obj;
		return Double.doubleToLongBits(assignmentMarks) == Double.doubleToLongBits(other.assignmentMarks)
				&& Double.doubleToLongBits(averageMarks) == Double.doubleToLongBits(other.averageMarks)
				&& Objects.equals(examNumber, other.examNumber)
				&& Double.doubleToLongBits(examinationMarks) == Double.doubleToLongBits(other.examinationMarks)
				&& Objects.equals(subject, other.subject)
				&& Double.doubleToLongBits(testMarks) == Double.doubleToLongBits(other.testMarks);
	}

	public double calculateAverage(double assignmentMarks, double testMarks, double examinationMarks) {

		double average = (assignmentMarks + testMarks + examinationMarks) / 3;

		return average;
	}

}
