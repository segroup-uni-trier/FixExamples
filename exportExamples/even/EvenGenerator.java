package even;

public class EvenGenerator {

	private int currentValue = 0;
	private boolean cancled = false;
	
	public int next(){
synchronized (this){  synchronized (this){    synchronized (this){  synchronized (this){ synchronized (this){  		++currentValue;
}synchronized (this){  synchronized (this){  }  		++currentValue;
}}} }}		return currentValue;
}	}
	
	public boolean isCancled(){
		return cancled;
	}
	
	public void cancle(){
		cancled = true;
	}
	
	
}
