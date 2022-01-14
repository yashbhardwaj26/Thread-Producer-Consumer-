package Thread;

public class Consumer extends Thread {
	Factory f;
	int j =100;
	Consumer(Factory f){
		this.f = f;
	}
	
	public void run() {
		
		while(j>=0) {
			try {
				this.f.consume();
				j--;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
}
