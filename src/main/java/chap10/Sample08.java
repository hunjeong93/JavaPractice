package chap10;

class Computer<T extends ComputerPart> {
	private T component;
	
	public void toInfo() {
		System.out.println(component.getClass().getName());
	}
	public Computer() {}
	
	public Computer(T component) {
		this.component = component;
	}
	
	public void setComponet(T component) {
		this.component = component;
	}
}

class ComputerPart{}

class Graphics extends ComputerPart {}

class Memory extends ComputerPart {}

class Monitor {}

public class Sample08{
	public static void main(String[] args) {
		Computer<ComputerPart> vga = new Computer<ComputerPart>();
		vga.setComponet(new Graphics());
		//ComputerPart를 상속받지 않는 객체는 제한됨
		//vga.setComponent(new Monitor());
		vga.toInfo();
		
		//생성자를 통한 객체 생성
		Computer<ComputerPart> mem = new Computer<>(new Memory());
		//ComputerPart를 상속받는 객체로 제한됨
		//Computer<ComputerPart> mem = new Computer<>(new Monitor());
		mem.toInfo();
	}
}
