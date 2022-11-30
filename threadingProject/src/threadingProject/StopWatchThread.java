package threadingProject;

public class StopWatchThread implements Runnable{
	
	private Thread thread;
	private String threadName;
	public StopWatchThread(String threadName) {
		this.threadName = threadName;
		System.out.println("Being Created :" + threadName);
	}
	@Override
	public void run() {
		System.out.println("Running :"+threadName);
		
		
			try {
				for(int i=1; i<=10;i++) {
					System.out.println(threadName + " : "+i);
					Thread.sleep(1000);
					}
			} catch (InterruptedException e) {
				System.out.println("Stoped : " +threadName);
			}
			System.out.println("Thread Finished : " +threadName);
		}
		public void start() {
			System.out.println("Thread Creating");
			if(thread==null) {
				thread = new Thread(this,threadName);
				thread.start();
			}
		
	}

}
