import java.util.Scanner;
public class Text{
	public static void main(String[] args){
	/*int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);
    int m=a<=b?a:b;	
	int i=0;
	for(i=m;i>0;i--){
		if(a%i==0&&b%i==0){
			System.out.println("最大公约数是"+i);
		    break;
		}
	}  */
	
	/*int i=1;
	double sum=0.0;
	for(i=1;i<101;i++){
		if(i%2==1){
		sum+=1.0/i;
		}
	    else if(i%2==0){
			sum-=1.0/i;
		}
	}
	System.out.println(sum);  */
	
	/*int i=1;
	int sum=0;
	for(i=1;i<101;i++){
		if(i%10==9){
			sum++;
		}
		else if(i/10==9){
			sum++;
		}
	}
	System.out.println(sum);   */
	
	/*int i=0;
	for(i=100;i<1000;i++){
		int a=i/100;
		int b=i/10-10*a;
		int c=i%10;
		if(i==a*a*a+b*b*b+c*c*c)
			System.out.println(i);   
	} */
	
	
	/*int k=1234;
	int i=0;
	while(i<3){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入密码:");
		int a=sc.nextInt();
		if(a==k){
			System.out.println("登陆成功");
			break;
		}
		else{
			System.out.printf("密码错误");
		}
		i++;
	}   */
	
	/*int num=15;
	int sum=0;
	for(int i=num;i>0;i=i/2){
		if(i%2==1){
			sum++;
		}
	}
	System.out.println(sum);  */
	
	int num=1375;
	print(num);
	}
	public static void print(int num){
		if(num>9){
			print(num/10);
		}
		int a=num%10;
		System.out.println(a);    
		
	}
}