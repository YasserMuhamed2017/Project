
public class First {

	public void printValue(MyInterface in) {
		if(in instanceof App) {
		App app = (App)in;
		app.print();
	}	
	}
	public void anotherRun() {
		new Program() {
			public void printFirst() {
				System.out.println("Welcome to First");
			}
		}.print();
		
	}
	
}