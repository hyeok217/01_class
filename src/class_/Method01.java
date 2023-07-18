package class_;

public class Method01 {
	public static void disp() {
		System.out.println("static method...");//함수를 구현했지만, 메인에서 불러오지 않으면 의미가 없음.메인밖에 모름
	}
	
	public static void output() {
		System.out.println("non-static method...");
	}
	
	
	public static void main(String[] args) {
		
		Method01.disp(); //호출
		output();
		Method01.output();
		
		new Method01().output(); //호출 이거는 1회용
		Method01 m = new Method01(); //호출
		
		m.output();
		
		}
}
