package sec05.exam05;

public class Person {
	
	//한번 값을주면 바뀌지않게하려면?
	final String nation = "Korean"; //국적
	final String ssn; //주민번호
	//값을 언제든지 바꿀수있음
	String name;
	
	
	Person(String ssn, String name){
		this.ssn = ssn;
		this.name = name;
	}
	
}
