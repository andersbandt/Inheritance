public class Person {
	private String name;
	private String address;
	private String csz;


	public Person() {   //constructor
		name = "John Doe";
		address = "55 Main Street";
		csz = "Lake Wobegon, MN 75555";
		}

	public Person(String name, String address, String csz) { //secondary constructor
		this.name = name;
		this.address = address;
		this.csz = csz;
	}

	public void setName(String a) { //sets name
     name = a;
	}

	public void setAddress(String a) { //sets address
	address = a;	
	}

	public void setCSZ(String a) { //sets csz
		csz = a;
	}

	public String getName() { //returns name
		return name;
	}

	public String getAddress() { //returns address
		return address;
	}

	public String getCSZ() {     //return csz
		return csz;
	}

	public String toString() {
		System.out.print(name);
		System.out.println(address);
		System.out.println(csz);

		return " ";
	}

	public void overRideThis(String t) {
		System.out.println("This method is in the Person class and was passed the argument "+t);
	}

}
