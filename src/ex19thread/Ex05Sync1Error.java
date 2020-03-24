package ex19thread;
class SumMulti{
	int num;
	public SumMulti() {
		num=0;
	}
	public void addNum(int n) {
		num+= n;
	}
	public int  getNum() {
		return num;
	}
}
class MultiAderThread extends Thread{
	SumMulti sumMulti;
	int start, end;
	public MultiAderThread(SumMulti sum, int s, int e) {
		super();
		this.sumMulti = sum;
		this.start = s;
		this.end = e;
	}
	public void run() {
		for(int i=start; i<=end ; i++) {
			sumMulti.addNum(i);
		}
	}
	
}
public class Ex05Sync1Error {

	public static void main(String[] args) {
		SumMulti s=new SumMulti();
		
		MultiAderThread mat1=new MultiAderThread(s, 1, 5000);
		MultiAderThread mat2=new MultiAderThread(s, 5001, 10000);
		mat1.start();
		mat2.start();
		
		try {
			mat1.join();
			mat2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~10000까지의  합: "+s.getNum());
	}

}
