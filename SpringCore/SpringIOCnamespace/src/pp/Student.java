package pp;

public class Student {

	private String studId;
	private String stuName;

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", stuName=" + stuName + "]";
	}

	public Student() {
		super();
	}

	public Student(String studId, String stuName) {
		super();
		this.studId = studId;
		this.stuName = stuName;
	}

	public String getStudId() {
		return studId;
	}

	public void setStudId(String studId) {
		this.studId = studId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

}
