public class Student extends Person {
	private String school;
	private String grade;


	public Student() {
		super();
		school = "Frisco High";
		grade = "Freshman";
	}

	public Student(String name, String address, String csz, String school, String name) {}
	super(name, address, csz);
	this.school = school;
	this.name = name;
}

    public void setSchool(String a) { //sets school
    	school = a;
	}

	public String getSchool() { //returns school
		return school;
	}

	public void setGrade(String a) { //sets grade
		grade = a;
	}

	public String getGrade() { //returns grade
		return grade;
	}

	public String toString() {
		super.toString();
		System.out.println("School: " + school + " Grade: "+ grade);

		return " ";
	}

	public void overRideThis(String t) {
		System.out.println("This method is in the Student class and was passed the argument "+t);
	}


}
