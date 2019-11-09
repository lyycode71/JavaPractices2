import java.util.Arrays;
public class Text{
	public static void main(String[] args){
	int[] a={2,9};
	swap(a,0,1);
	System.out.println(Arrays.toString(a));
	}
	public static int[] swap(int[] a,int i,int j){
	int t;
	t=a[i];
	a[i]=a[j];
	a[j]=t;
	return a;
	}		
}