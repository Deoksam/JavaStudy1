package sec04.exam06;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		double result1 = cal.areaRectangle(5);
		System.out.println("정사각형의 넓이 : " + result1);
		
		double result2 = cal.areaRectangle(2, 3);
		System.out.println("직사각형의 넓이 : " + result2);
		
	}
 
}
