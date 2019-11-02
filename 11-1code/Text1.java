public class Text1{
	public static void main(String[] args){
	/*int a=9;
    int b=2;	
	double r=sub(a,b);
	System.out.println(r);
	}
	public static double sub(double a,double b){
		return a-b;  */
	
	//System.out.println(num(Integer.parseInt(args[0])));
	//
	//
	/*int i=1;
	int n=5;
	int sum=0;
	for(i=1;i<=n;i++){
		int c=num(i);
		sum+=c;
	}
	System.out.println(sum);
	}                  //少括号提醒的是少“;"
	public static int num(int a){
		int j=1;
		int i=0;
		for(i=1;i<=a;i++){
			j*=i;
		}
		return j; 
	}
		*/
		/*int i=1;
		int n=5;
		int sum=0;
		for(i=1;i<=n;i++){
		int c=num(i);
		sum+=c;
		}
	System.out.println(sum);}
	public static int num(int a){
	if(a==1)
		return 1;
	else{
		return a*num(a-1);
	}*/
	int a=fibonacci(6);
	System.out.println(a);
	}
	public static int fibonacci(int n){
		if(n<=2)
			return 1;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}
}