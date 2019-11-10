public class CycleDemo{
	public static void main(String[] args){
		Cycle cycle=new Cycle();
		System.out.println(cycle.getColor());
		System.out.println(cycle.getSpeed());
		
		cycle.setColor("粉色");
		System.out.println("变色后");
		System.out.println(cycle.getColor());
		
		System.out.println("上坡");
		
		cycle.speedUp();
		System.out.println(cycle.getSpeed());
		
	}
}
		
		