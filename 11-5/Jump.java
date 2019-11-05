/*public class Jump{
	public static int num(int n){
		if(n<3){
			return 1;
		}else{
			return num(n-1)+num(n-2);
		}
	}
	public static void main(String[] args){
		int n=5;
		int a=num(n);
		System.out.println(a);
	}
}      //斐波那契数的具体应用，青蛙跳台阶（一次跳两阶，或者一阶，问有多少种跳法）*/

public class Jump{
	public static void hanoi(int n,int from,int to){
		if(n==1){
			System.out.printf("将%d移到%d%n",from,to);
		}else{
			int other=3-from-to;
			hanoi(n-1,from,other);
			System.out.printf("将%d移到%d%n",from,to);
			hanoi(n-1,other,to);
		}
	}
		public static void main(String[] args){
			hanoi(3,0,2);
		}
}       //重写思考一下，分步逆推。
			