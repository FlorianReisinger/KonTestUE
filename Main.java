package at.fhj.iit;

public class Main {
	
	
	public static void sayHello(Gretter g){
		System.out.printf("Awesome Method!");



	}


	public static void main(String[] args) {
		
		Greeter g = new GreeterImpl("Florian & Thomas");

		sayHello();
		sayGoodBye();

	}

}
