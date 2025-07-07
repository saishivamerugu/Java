package HasARelationShip;

public class College {

	private String collegeName;
	private int totalDepartments;
	private Department department;
	
	public College() {
	}
	
	public College(String collegeName, int totalDepartments,Department department) {
		this.collegeName = collegeName;
		this.totalDepartments = totalDepartments;
		this.setDepartment(department);
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public int getTotalDepartments() {
		return totalDepartments;
	}
	
	public void setTotalDepartments(int totalDepartments) {
		this.totalDepartments = totalDepartments;
	}

	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", totalDepartments=" + totalDepartments + "Department : "+department+"]";
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
