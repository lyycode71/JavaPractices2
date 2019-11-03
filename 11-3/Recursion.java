public class Recursion{
	
	/*public static int sum(int n){
		if(n<10){
			return n;
		}else{
			return n%10+sum(n/10);
		}
	}
	public static void main(String[] args){
		int n=9527;
		int b=sum(n);
		System.out.println(b);
	}
}   */
    public static void hanoi(int n,int from,int to){
		if(n==1){
			System.out.printf("从%d移动到%d%n",from,to);
		}else{
			int other=3-from-to;
			hanoi(n-1,from,other);
			System.out.printf("从%d移动到%d%n",from,to);
			hanoi(n-1,other,to);
		}
	}
	public static void main(String[] args){
		hanoi(4,0,2);
	}
	}