 import java.util.*;
    public class HelloWorld{

	public static void main(String[] args) {
	
		ArrayList <App> listOfCountries = new ArrayList();
	   new App().print();
	   List<String> list = new ArrayList<>();
	   list.add("hello");
	   String s = list.get(0);
	   new App().printVal();
	   // this mean that we extends for class App
	 
	   new MyInterface() {

		@Override
		public void printVal() {
			System.out.println("Advanced Concept For Interface");
			
		}
		   
	   }.printVal();
	  
	   First first = new First();
	   first.anotherRun();
		}
	}

