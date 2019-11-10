public class Cycle{
	private String color;
	private int speed;
	private int maxSpeed;
	Cycle(){
		color="白色";
		speed=0;
		maxSpeed=200;
	}
	Cycle(String color){
		color=color;
		speed=0;
		maxSpeed=200;
	}
	void setColor(String color){
		this.color=color;
	}
	void speedUp(){
		speed+=10;
		if(speed>maxSpeed){
			speed=maxSpeed;
		}
	}
	void speedDown(){
		speed-=10;
		if(speed<0){
			speed=0;
		}
	}
	String getColor(){
		return color;
	}
	int getSpeed(){
		return speed;
	}
}





	/*	public cycle(String color,int speed,int maxSpeed){
		this.color=color;
		this.speed=speed;
		this.maxSpeed=maxSpeed;
	}
	public void draw(String color){
		System.out.println("想要的颜色：");
		
		
	}
	public String printColor(String color){
		return this.color;
	}
	public int speed(int speed,int maxSpeed){
		return this.speed;
	}
}
 class Cycle{
	public static void main(String[] args){
	Scanner color=new Scanner;
	
	}
}  */
	