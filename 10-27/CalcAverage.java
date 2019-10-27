public class CalcAverage{
	public static void main(String[] args){
		/*double b=0;
		double c=0;
		for(int i=0;i<args.length;i++){
			b=b+Double.parseDouble(args[i]);
			}
			c=b/args.length;
		System.out.println(c);*/
		if(args.length==0){
			System.out.println("至少输入一个数");
			return;
		}
		int sum=0;
		for(int i=0;i<args.length;i++){
			sum+=Double.parseDouble(args[i]);
			}
			double average=1.0*sum/args.length;
			System.out.println("平均指是："+average);
	}
}