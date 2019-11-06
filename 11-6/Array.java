import java.util.Arrays;
public class Array{
	public static int[] copyOfRange(int[] a,int from,int to){
		int[] b=new int[to-from];
		for(int i=from;i<to;i++){
			b[j-from]=a[i];
		
	}return b;
	}
	public static void fill(int[] a,int val){
		for(int i=0;i<a.length;i++){
			a[i]=val;
		}
	}
	public static void equals(int[]a,int[] b){
		if(a.length!=b.length){
		return false;
		}
		for(int i=0;i<a.length;i++){
			if(a[i]!=b[i]){
				return false;
			}
	}return ture;
	}
	public static void arrayCo(int[] a,int from,int to,int val){
	for(int i=from;i<to;i++){
		a[i]=val;
	}
	}
	public static void arraycopy(int[] src,int srcpos,int[] dest,int destpos,int length){
		if(src ==dest){
			int[] tmp=Arrays.copyOf(src,srcpos,srcpos+length);
				for(int i=0;i<length;i++){
					dest[destpos+i]=tmp[i];
				}
		}else{
			for(int i=0;i<length;i++){
				dest[destpos+i]=src[srcpos+i];
			}
		}
	}
	public static void main(String[] args){
		int a[]={1,2,5,4,3};
		
		System.out.println(Arrays.toString(copyOfRange(a,2,3)));
	}
}