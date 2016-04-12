public class Calc {
	private int sum;
	public Calc(){
		this.sum = 0;
	}
	public Calc(int n){
		this.sum = n;
	}
	public int getSum(){
		return sum;
	}
	public int sum(){
		for(int i = sum ; i < 100 ; i++){
			sum += i;
		}
		return sum;
	}
	public static void main(String[] argv){
		Calc c = new Calc();
		System.out.println("summing among 0 ~ 100? "+c.sum());
		c = new Calc(45);
		System.out.println("summing among 45 ~ 100? "+c.sum());
	}
}
