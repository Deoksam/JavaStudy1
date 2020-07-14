package sec04.exam03;

public class Car {
	//필드
	int gas;
	
	//생성자
	Car(){}
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다." + gas);
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("부릉부릉 잔량:" + gas);
				gas -=1;
			} else {
				System.out.println("연료가 없습니다. 잔량:" + gas);
				return;
			}
		}
	}
}
