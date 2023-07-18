package class_;

public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method02 m = new Method02();
		
		int s1 = m.sum(25,36); //호출
		System.out.println("합="+ s1);
		
		int s2 = m.sub(25,36);
		System.out.println("차="+ s2);
		
		int s3 = m.mul(25,36);
		System.out.println("곱="+ s3);
		
		Double s4 = m.div(25,36);
		//System.out.println("몫="+ s4);
		System.out.println("몫= " + String.format("%5.3f", s4));	//0.694
	//	System.out.println("몫= " + String.format("%0.3f", s4));	//0.694	
	//	System.out.println("몫= " + String.format("%.3f", s4));	//0.694	
		
	}
	

	public int sum(int x, int y){ //구현
		return x+y;      //return 값을 반환해
//		return x+y, x-y, x*y, x/y;      //return 되는 값은 1개뿐이다.
	}	
		
	public int sub(int x,int y) {
		return x-y;
		
		
	}
	public int mul(int x,int y) {
		return x*y;
		
	}
	
	public Double div(int x, int y) {
	return (double)x/y;   //자동 형변환
	
	}
}