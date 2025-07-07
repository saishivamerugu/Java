package HasARelationShip;

public class Department {

	Professor professor;
	String deptName;
	int countOfStudents;
	
	public Department() {
		
	}
	
	public Department(Professor professor, String deptName, int countOfStudents) {
		this.professor = professor;
		this.deptName = deptName;
		this.countOfStudents = countOfStudents;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getCountOfStudents() {
		return countOfStudents;
	}
	public void setCountOfStudents(int countOfStudents) {
		this.countOfStudents = countOfStudents;
	}

	@Override
	public String toString() {
		return "Department [professor=" + professor + ", deptName=" + deptName + ", countOfStudents=" + countOfStudents
				+ "]";
	}

	
	
	
	
}
