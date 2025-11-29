package accessSpecifire;

public class demo2 {
	
	
    public void publicMethod() {
        System.out.println("Public Method - anywhere");
    }

    private void privateMethod() {
        System.out.println("Private Method - same class only");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method - package + subclass");
    }

    void defaultMethod() {
        System.out.println("Default Method - same package only");
    }


	public static void main(String[] args) {
		demo2 d2 = new demo2();
		d2.privateMethod();
		d2.protectedMethod();
		d2.publicMethod();
		d2.defaultMethod();
		
		
		

	}

}
