package programming;

public class CountFrom implements Runnable{

	@Override
	public void run() {
		int i = 20;
		for(i = 20; i >= 0; i--){
			System.out.println(i);
		}
	
	}
}
