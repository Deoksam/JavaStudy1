package sec01.exam01.sub;

public class CellPhone {
	//필드
	public String model;
	public String color;
	
	//생성자
	public CellPhone(){
		System.out.println("CellPhone() 호출됨");
	}
	
	//메소드
	public void powerOn() {
		System.out.println("전원을 켭니다.");
		}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
		}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
		}
	
	public void sendVoice(String message) {
		System.out.println("자기:" + message);
		}
	
	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);
		}
	
	public void hangUp() {
		System.out.println("전화를끊습니다.");
		}
}
