class OddThread extends Thread{
	public void run(){
		for(int i=1;i<=20;i++){
			if(i%2!=0)
				System.out.println("odd  = "+i);
			try{
				sleep(500);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

class EvenThread extends Thread{
	public void run(){
		for(int i=1;i<=20;i++){
			if(i%2==0)
				System.out.println("even = "+i);
			try{
				sleep(500);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}


class OddEven{
	public static void main(String[] args){
		
		OddThread odd=new OddThread();
		EvenThread even=new EvenThread();

		odd.start();
		even.start();

	}
}