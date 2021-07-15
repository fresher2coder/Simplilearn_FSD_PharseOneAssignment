package assignments;


public class InnerClass {

	public static void main(String[] args) {
		Outer obj = new Outer();
		//Member Inner Class
		Outer.Inner objIn = obj.new Inner();
		
		objIn.message();
		
		//Anonymous class
		Messageable mess = new Messageable() {
			public void message() {
				System.out.println("Anonymous Class");
			}			
		};
		
		mess.message();
		
		//Static Inner Class
		OuterStatic.InnerStatic objSi = new OuterStatic.InnerStatic();
		
		objSi.message();
		
		TestNestedInterface name = new TestNestedInterface();
		name.message();

	}

}

class Outer{
	//Member Inner class
	class Inner{
		void message() {
			System.out.println("Member Inner Class");
			//Local Inner Class
			class text{
				void message() {
					System.out.println("Local Inner Class");
				}
			}
			text obj = new text();
			obj.message();
		}
	}
}

interface Messageable{
	void message();
}

class OuterStatic{
	static class InnerStatic{
		void message() {
			System.out.println("Static Inner Class");
		}
	}
}

interface Display{
	interface Show{
		void message();
	}
}

class TestNestedInterface implements Display.Show{
	public void message() {
		System.out.println("Nested Interface");
	}
}
