package Thread;

public class Factory {
	
	
	int n ;
	boolean flag = false;
	
	 public synchronized void produce(int n) throws InterruptedException {
		 
		 if(flag) {
			 wait();
		 }
		
		this.n = n;
		System.out.println("Item Produced" + n);
		Thread.sleep(1000);
		flag = true;
		notify();
	}
	
	
	public synchronized int consume() throws InterruptedException {
		
		 if(!flag) {
			 wait();
		 }
		System.out.println("Item Consumed" + n);
		Thread.sleep(2000);
		flag = false;
		notify();
		return n;
		
	}

}
