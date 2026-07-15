package Object;
//Buleprint for Driver 1 - Driver 2
//equal(Obkjecct o)
public class Pen implements Cloneable { //Cloneable - means the objects of this class is allowed to be cloned
	String brand;
	int price;
	public Pen(String brand, int i) {
		this.brand = brand;
		this.price = i;
	}
	/*
	 * We can't compare two non-primitive data with equality operator(==) and equal(object o), they both
	 compare the ref. of two objects and they don't compare the state of two objects
	 
	 *In order to acheive comparison between the state of the 2 objects we need to override 
	 equal(object o) of respective bulePrint.
*/
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Pen p=(Pen) obj;
		return this.brand.equals(p.brand) && this.price==price;
	}
	//After overriding - Driver class is used to execute
	
	//clone()
	@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
	
	
	
	
}
