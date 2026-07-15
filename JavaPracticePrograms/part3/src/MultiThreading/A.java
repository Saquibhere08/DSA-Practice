package MultiThreading;

 class A implements Runnable{
	public void show() {
		int i=1;
		while(i<100) {
		System.out.println("hi");
		i++;
	}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
