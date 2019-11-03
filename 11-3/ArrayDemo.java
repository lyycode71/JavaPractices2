//import java.util.Scanner;
public class ArrayDemo{
	public static int max(int[] a){
		int max=0;
		for(int i=0;i<(a.length-1);i++){
			 max=a[i];
			max=max>a[i+1]?max:a[i+1];
		}
			/*int max=Integer.MIN-VALUE;
			for(int v:a){
				if(v>max){
					max=v;
				}
			}*/
		return max;
	}
	public static double average(int[] a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		return 1.0*sum/a.length;
	}
	public static int indexOf(int[] a,int n){
		for(int i=0;i<a.length;i++){
			if(n==a[i]){
				return i;
				
			}
			
		}return -1;
	}
	public static int lastIndexOf(int[] a,int n){
		for(int i=(a.length-1);i>=0;i--){
			if(n==a[i]){
				return i;
				//break;
			}
			
		}return -1;
		
	}
    public static void main(String[] args){
	int a[]={1,2,3,4,7,8,7};
	int n=7;
	int b=max(a);
	System.out.println(b);
	double c=average(a);
	System.out.println(c);
	int d=indexOf(a,n);
	System.out.println(d);
	int e=lastIndexOf(a,n);
	System.out.println(e);
	
	
    }
}
		
	