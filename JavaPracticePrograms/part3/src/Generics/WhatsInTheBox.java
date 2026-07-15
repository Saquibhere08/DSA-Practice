package Generics;
class WhatsInTheBox{
	public static void main(String[] args) {
		Box<String> box=new Box<>();
		box.setItem("Banana");
		box.setItem("Apple");
		
		System.out.println(box.getItem());
	}
}
