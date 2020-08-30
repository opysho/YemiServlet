package za.co.funnel.Subject;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Subject")
public class Subject {

	@Id
	@Column(name = "subject_name")
	private String name;
	@Column(name = "subject_code")
	private int code;

	public Subject(String name, int code) {
		super();
		this.name = name;
		this.code = code;
	}

	public Subject() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + ", code=" + code + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		return code == other.code && Objects.equals(name, other.name);
	}

}
