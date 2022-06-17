
public class Test_220617_서장원_문제3 {

	
	public static void main(String[] args) {
	
		MyThread mt=new MyThread();
		Thread t=new Thread(mt);
		t.start();
		
	}
}

class MyThread implements Runnable{

	@Override
	public void run() {
		
		for(int i=0; i<300; i++) {
			System.out.println(i+ " : 작업");
		}
	}
	
}
