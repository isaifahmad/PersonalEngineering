
class ChildThread extends Thread {
	
	ChildThread() {
		super("ChildThread extending Thread\n");
		System.out.println("ChildThread created\t" + this.getPriority() + "\t" + this);
		start();
	}
	
	public void run() {
		System.out.println("Staring to run ChildThread");
		
		for(int i = 1; i <17; i++) {
			System.out.println("run: Iterating No:" + i);
			try {
				Thread.sleep(700);
			}
			catch(InterruptedException e) {
				System.out.println("Child Thread interrupted!");
				
			}
		}
		
		System.out.println("ChildThread run is over");
	}
}


public class LearnThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LearnThread : Main thread initiated.");
		ChildThread threadObj = new ChildThread();
		
		while(threadObj.isAlive()) {
			System.out.println("Main thread in continuiation....");
			try {
				Thread.sleep(3500);
			}
			catch(InterruptedException e) {
				System.out.println("Main Thread interrupted!");
			}
			
		}
		
		System.out.println("Main Thread run is over");
		
		

	}

}