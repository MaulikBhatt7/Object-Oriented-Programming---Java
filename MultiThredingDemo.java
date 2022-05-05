class MyThread1 extends Thread{
	public void run(){
		while(true){
			System.out.println("Good Morning");
			try{
				sleep(1000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}	
	}	
}
class MyThread2  extends Thread{
	public void run(){

		while(true){
			System.out.println("Good Afternoon");
			try{
				sleep(3000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
public class MultiThredingDemo{
	public static void main(String[] args) {
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();

		th1.start();
		th2.start();
	}
}