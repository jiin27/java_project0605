/*우리가 작성한 Mario.java 를 컴파일하면 기계어로 구성된 Mario.class 파일이 생성된다.
따라서 Mario 객체의 인스턴스를 생성하기 위해서는 Mario.class 를 사용하는 실행부가 있는 자바 소스를 작성해야 한다.

js는 웹브라우저만 있으면 언어를 실행할 수 있는, 즉 독립적이니 실행이 불가능하는 브라우저에 의존하는 언어이지만,
java는 그 어떤 프로그램에도 의존하지 않는 독립 프로그램이다. 
따라서 실행하기 위해서는 현재 java 소스 내에 실행을 위한 main 함수만 정의하면 된다.
*/

class UseMario{
	//java 나 c#, c 등의 언어는 실행을 위한 메인 함수를 지원하는데
	//java에서도 main을 지원하며, main 메서드라 불린다.
	public static void main(String[] args){
		System.out.println("Park Ji In");
	}
}