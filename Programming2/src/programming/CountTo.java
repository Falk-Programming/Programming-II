package programming;

public class CountTo implements Runnable{
	public void run() {
		int i = 1;
		for(i = 1; i <= 20; i++){
			System.out.println(i);
		}
	}

}
