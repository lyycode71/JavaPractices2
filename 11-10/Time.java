public class Time{
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour,int minute,int second){
		if(hour<=0||hour>=24){
			System.out.println("不支持小时");
			return;
		}
		if(minute<=0||minute>=60){
		System.out.println("不支持分钟");
			return;
		}
		if(second<=0||second>=60){
		System.out.println("不支持秒");
			return;
		}
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public String toString(){
		return String.format("%02d-%02d-%02d",hour,minute,second);
	}
	public void add(int seconds){
		if(second<0){
			System.out.println("请使用sub");
		}
		second+=seconds;
		while(second>60){
			minute+=1;
			second-=60;
			if(minute>60){
				hour+=1;
				minute-=60;
				if(hour>24){
					hour-=24;
				}
			}
		}
		
	}
	public void sub(int seconds){
		second-=seconds;
		while(second<0){
			second+=60;
			minute-=1;
			if(minute==0){
				minute+=60;
				hour-=1;
				if(hour==0){
					hour=23;
				}
			}
			
		}
	}
	public static void main(String[] args){
		Time tim=new Time(8,30,30);
		System.out.println(tim);
		tim.add(168);
		System.out.println(tim);
		tim.sub(168);
		System.out.println(tim);
	}
}