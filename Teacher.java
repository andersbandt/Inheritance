public class Teacher extends Person {
	private String subject;

	public Teacher() {
		super();
		subject = "Computer Science";
	}

	public Teacher(String name, String address,String csz, String subject) {
		super(name, address, csz);
		this.subject = subject;
	}

	public void setSubject(String a) { //sets subject
		subject = a;
	}

	public String getSubject() { //returns subject
		return subject;
	}

	public String toString() {
		super.toString();
		System.out.println(subject);

		return " ";
	}

	public void overRideThis(String t) {
		System.out.println("This method is in the Teacher class and was passed the argument "+t);
	}

}