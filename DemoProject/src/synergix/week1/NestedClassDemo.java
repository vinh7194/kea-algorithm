package synergix.week1;

public class NestedClassDemo {
	private int att;
	public int att1;

	protected static class StaticNestedClass {
		public void handle() {
			// not allow access to field outer class
		}
	}

	protected class InnerClass {
		// not allow static field
		public void handle() {
			att = 10;// access to field outer class
		}
	}
	
	public static void main(String[] args) {
		NestedClassDemo.StaticNestedClass nestedObject = new StaticNestedClass();
		
		NestedClassDemo.InnerClass innerObject = new NestedClassDemo().new InnerClass();
		
	}
}
