package AnonymousClass;

public class Emp {
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee() {	//Anonymous class
			void getHike() {
				System.out.println("Hike of 70%");
			}
		};
		Employee e3=new Employee();
		
		e1.getHike();
		e2.getHike();
		e3.getHike();
	}
}
