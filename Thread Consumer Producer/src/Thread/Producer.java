package Thread;

public class Producer extends Thread {
	int j = 100;
	Factory f;
	Producer(Factory f){
		
		this.f = f;
	}
	
	
	int i = 1;
	public void run() {
	
		while(j>=0) {
			
			try {
				this.f.produce(i);
				i++;
				j--;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
