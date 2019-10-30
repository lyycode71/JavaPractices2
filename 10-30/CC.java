import java.util.Scanner;
import java.util.Random;
public class CC{
	public static void main(String[] args){
   /* int year=Integer.parseInt(args[0]);
    if((year%400==0)||((year%4==0)&&(year%100!=0)))
	   System.out.println(year+"是闰年");
	else
	   System.out.println(year+"不是闰年");*/
   /*int today=Integer.parseInt(args[0]);
   switch(today){
	   case 0:
	   System.out.println("星期一");
	   break;
	   case 1:
	   System.out.println("星期二");
	   break;
	   case 2:
	   System.out.println("星期三");
	   break;
	   case 3:
	   System.out.println("星期四");
	   break;
	    case 4:
	   System.out.println("星期五");
	   break;
	    case 5:
	   System.out.println("星期六");
	   break;
	   case 6:
	   System.out.println("星期日");
	   break;
	   default:
	   System.out.println("我不知道你在说什么。");
       break;
      }*/
	  /*int n=Integer.parseInt(args[0]);
	  int i=1;
	  int j=1;
	  int sum=0;
	  for(i=1;i<=n;i++){
		  int c=1;
		  for(j=1;j<=i;j++){
		 c*=j;}
	  sum+=c;}
	  
	  System.out.println(sum);*/
	 /* Scanner scanner=new Scanner(System.in);
	  while(scanner.hasNext()){
		  String s=scanner.nextLine();
	  System.out.println(s);}*/
	 
   /*	 Random random=new Random(20191030);
	  for(int i=0;i<50;i++){
		  int r=Random.nextInt(10);
	  System.out.println(r);} */
	  Random random=new Random();
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("欢饮进入系统");
	  System.out.println("生成随机数:");
	 // switch(
	  int n=random.nextInt(100);
	 	  int times=4;
		  System.out.println("猜数字游戏开始了");
		  System.out.println("您有"+times+"次机会");
	  for(int i=1;i<times;i++){
		  int x=scanner.nextInt();
		  if(x==n){
			  System.out.println("猜成功了，用了"+i+"次机会");
			  return;
		  }else if(x<n){
			  System.out.println("第"+i+"次猜测,您猜的数字小了");
		  }else if(x>n){
			  System.out.println("第"+i+"次猜测，您才的数字大了");
		  }
	  }
	  System.out.println("很遗憾，游戏结束");
	  System.out.println("数字其实是"+n);
			  
	}
}