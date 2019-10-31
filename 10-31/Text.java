public class Text{
	public static void main(String[] args){
		
		
	/*int age=Integer.parseInt(args[0]);
    if(age<=0)
        System.out.println("输入错误，请重新输入");	
    else if(age>0&&age<18)
        System.out.println("少年");
    else if(age>=18&&age<29)
        System.out.println("青年");	
    else if(age>=29&&age<56)
        System.out.println("中年");
    else if(age>=56)
        System.out.println("老年");		*/
	
	
	/*int num=Integer.parseInt(args[0]);
	int i=0;	int k=1;
	for(i=2;i*i<=num;i++){
		if(num%i==0)
			k=0;
		}
		if(k==1)
			System.out.println(""+num+"是素数");
		else if(k==0) 
			System.out.println(""+num+"不是素数");*/
		
	/*int i=0;
	for(i=1;i<=100;i++){
		int j=0;	int k=1;
	    for(j=2;j*j<=i;j++){
		    if(i%j==0)
			    k=0;
		    }
		if(k==1)
			System.out.println(i);
	}*/
		
	/*int i=0;
	for(i=1000;i<=2000;i++){
		if((i%400==0)||(i%4==0&&i%100!=0))
			System.out.println(i);
	}*/
	
	int i=1;
	int j=1;
	for(i=1;i<10;i++){
		for(j=1;j<i;j++){
			System.out.println(""+i+"x"+j+"="+i*j+"\t");
		}
		System.out.println("\n");
	}
	}
}