public class Runner {
	public static void main(String[] args) {
     Person iSt = new InternationalStudent("Jacques Francios", "23 Rue de Madeline", "Marseille, FR", "Lycee Seconde", "Ecole Polytechnic", "FR");
System.out.println(iSt);
iSt.overRideThis("French Student");

// Step 10
	Person p = new Student();
	if (p instanceof Student) {
		Student s = (Student)p;
		System.out.println("Succesfully casted the class");
	}






	}




	public static void showInheritance(Person c) {
	Class class1 = c.getClass();
 
	while(class1.getSuperclass() != null)
	{
	String child = class1.getName();
	String parent = class1.getSuperclass().getName();
 
	System.out.println("\t"+child+" class is a child class of "+ parent);

	class1 = class1.getSuperclass();
	}

	System.out.println("\n");
 
}


}