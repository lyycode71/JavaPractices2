public class Binary{
	public static void main(String[] args){
		int num=15;
		String result="";
		int sum;
		for(int i=num;i>=1;i=i/2){
			if(i%2==0){
			sum=0;}
			else{
			sum=1;}
			result=sum+result;
		}
		System.out.println(result);
	}
}