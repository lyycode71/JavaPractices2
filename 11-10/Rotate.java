import java.util.Arrays;
public class Rotate{
	public static int[] rotateArray(int[] a,int n){
	int k=a.length;
	int[] b=new int[k];
	
	for(int i=0;i<k;i++){
		for(int j=0;j<n;j++){
		
		b[j]=a[j+k-n];
		b[j+k-n]=a[j];
		
		}
		for(int t=n;t<k-n;t++){
		b[t]=a[t];
		}
	}
	return b;
	}
	public static void main(String[] args){
	int[] a={1,2,3,4,5,6,7};	
	System.out.println(Arrays.toString(rotateArray(a,7)));
	}
}