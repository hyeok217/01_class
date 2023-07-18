package class_;

class Person{
	private String name;  //필드 , 초기화(null)
	private int age;// 클래스 밑에 있는 애들; 필드 초기화(0)으로 되어 나옴
	
	public void setName(String n){ //리턴 없으니 void
		name = n;//중간자		
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setData(String n , int a){  //인자.인수가2개
		name = n;
		age = a;
	}
	public void setData() {}                 //인수가 1개 
	
}
// ---------------
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new Person(); 이건 1회용
		Person aa = new Person();   //aa 객체 생성
		//나이는 25, 이름은 홍길동을 주고 싶다면
		//name = "홍길동" 안됨
		aa.setName("홍길동");//setName을 이용한 호출
		//에러 aa.name ="홍길동";
		//에러aa.age = 25;
		aa.setAge(25);
		System.out.println("객체aa = "+ aa);  //객체 주소가 출력됨 class_.Person@6f2b958e
		//System.out.println("aa.name + "+ "\t" + aa.age);
		//System.out.println("aa.getName + "+ "\t" + aa.age);
		System.out.println("aa.getName() + "+ "\t" + aa.getAge());
		System.out.println();
		
		
		Person bb = new Person();  //bb 객체 생성
		System.out.println();
		bb.setName("홍길동");//setName을 이용한 호출
		bb.setAge(30);
		
		System.out.println("객체bb = "+ bb);  //객체 주소가 출력됨 class_.Person@6f2b958e
		System.out.println("bb.getName() + "+ "\t" + bb.getAge());
		System.out.println();
		
		Person cc = new Person();
		cc.setData("코난", 35);
		System.out.println("객체cc = "+ cc);  //객체 주소가 출력됨 class_.Person@6f2b958e
		System.out.println("cc.getName() + "+ "\t" + cc.getAge());
		System.out.println();
		
		Person dd = new Person();
		dd.setData();
		System.out.println("객체dd = "+ dd);  //객체 주소가 출력됨 class_.Person@6f2b958e
		System.out.println("dd.getName() + "+ "\t" + dd.getAge());
		System.out.println();
		
		
		
		
		
	}

} //이 자바파일은 하나지만 클래스 파일은 2개(person, personMain )이 생성된다.
