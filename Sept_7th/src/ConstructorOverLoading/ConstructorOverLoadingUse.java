package ConstructorOverLoading;

public class ConstructorOverLoadingUse {

	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee("Ketan", 11);
		Employee e2 = new Employee("Tejas", 10, "Mecbh");
		
		e.display();
		e1.display();
		e2.display();
		
		

	}

}
