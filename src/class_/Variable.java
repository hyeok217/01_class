package class_;

public class Variable {
	static int b;   //필드;전역변수: 클래스 전체에서 쓸 수 있음  (밑에 메인에 b가 있는데 변수선언이 되네?)
			 //초기화 되어 초기값0을 가지고 있음
			 //밑에 b는 65를 선언안하고 계산식 진행하면 오류뜨는데 전역변수는 안뜸
	static double c;
	int d;
	
	public static void main(String[] args) {
		short a = 65; /*a라는 방을 만들고 그 방안에 65라는 숫자를 집어넣어라. short=2byte=16bit의 저장공간 잡음
												16비트값:0000 0000 0100 0001 을 잡고 있음   */
				
		//지역변수=>메인꺼 (local variable 메인이라는 함수가 잡고 있는 변수)
		int b =65; // 4byte=32비트값(32개)을 잡고 있음. 0000 0000 0000 0000 0000 0000 0100 0001 값 잡고 있음
		
		System.out.println("지역변수 a= " + a);
		System.out.println("지역변수 b= " + b);
		
//		System.out.println("필드 b= " + ?);    여기에 물음표에 b쓰면 65뜸
//											 클래쓰꺼라는 것을 알려줘야함		
		
		System.out.println("필드 b= " +Variable.b);
		System.out.println("필드 c= " +c);
//		System.out.println("필드 d= " +d); 가까운 클래스 안에서 d를 찾고 에러 뛰움(스태틱도 아니고 자기구역 안에서도 없음)
//		위에 있는 클래스를 만들어서 써줘야함  d
		System.out.println("필드 c= " +new Variable().d);
		
		Variable v = new Variable(); //인스턴스(객체)생성
		/*new 라는 연산자를 사용하여 힙이라는 영역에 Variable 이라는 영역을 잡고 주소를 잡음. 그 v가 그 주소를 가지고
		 스택에 잡음         */
		System.out.println("객체 v = "+ v); //결과값이 v의 주소값이 나옴; 클래스명@주소값
		System.out.println("필드 c = "+ v.d);
			
	}
}
