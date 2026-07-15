package OOPs;
//Super() - super called statements
public class Person  {
	String name;
	public Person(String name) {
		this.name=name;
	}
	
}
//Class-Loading  using Super () called statements
class Student extends Person{
	int sid;
	public Student(int sid,String name) {
		super(name);
		this.sid=sid;
	}
}
