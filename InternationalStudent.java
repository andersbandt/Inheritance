public class InternationalStudent extends Student {
	private String country;

	public InternationalStudent() {
		super();
		country = "USA";
	}

	public InternationalStudent(String name, String address, String csz, String school, String grade, String country) {
		super(name, address, csz, school, grade);
		this.country = country;
	}

	public void setCountry(String a) { //sets country
		country = a;
	}

	public String getCountry() { //returns country
		return country;
	}

	public String toString() {
		super.toString();
		System.out.println(country);
		return " ";
	}

	public void overRideThis(String t) {
		System.out.println("This method is in the InternationalStudent class and was passed the argument "+t);
	}
}