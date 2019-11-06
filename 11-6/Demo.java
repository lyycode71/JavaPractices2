import java.util.Arrays;
public class Demo{
	/*public static void bubbleSort(int[] a){
	     for(int i=0;i<a.length;i++){
			 for(int j=1;j<a.length-i;j++){
				 int t;
				 if(a[j-1]>a[j]){
					swap(a,j-1,j);
				 }
			 }
		 } 
	}*/
	/*public static int binarySearch(int[]a,int v){
	int left=0;int right=a.length;
	int mid=0;
	while(left<right){
		mid=(left+right)/2;
	if(v==mid){
		return mid;
	}else if(v<a[mid]){
		right=mid;
	}else {
		left=mid+1;
	}
	}return -1;
	}*/
	public static int[] copyOf(int[] a,int newLength){
		int b[]=new int[newLength];
		int i=0;
		if(a.length>=newLength){
			for(i=0;i<newLength;i++){
				b[i]=a[i];
			}
		}
		else{
			for(i=0;i<a.length;i++){
				b[i]=a[i];
			}//后续本来为0		
	}return b;
	}
	/*int b[]=new int[newLength];
	int length=min(newLength,a.length);
	for(i=0;i<length;i++){
				b[i]=a[i];
			}return b;  */
	/*public static void swap(int[] a,int i,int j){
	int t=a[i];
	a[i]=a[j];
	a[j]=t;
	}*/
	
	public static void main(String[] args){
		int[] a={4,5,7,2,3};
		//int b=binarySearch(a,2);
		
		System.out.println(Arrays.toString(copyOf(a,7)));
	//System.out.println(b);
	
	}
}
	