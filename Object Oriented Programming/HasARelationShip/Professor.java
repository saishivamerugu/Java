package HasARelationShip;

public class Professor {

	String name;
	String subject;
	int experience;
	
	public Professor(String name, String subject, int experience) {
		this.name = name;
		this.subject = subject;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getExperiecnce() {
		return experience;
	}

	public void setExperiecnce(int experiecnce) {
		this.experience = experiecnce;
	}

	@Override
	public String toString() {
		return "Professor [name=" + name + ", subject=" + subject + ", experiecnce=" + experience + "]";
	}
	
	
	
}
