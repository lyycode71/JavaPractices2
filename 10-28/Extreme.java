public class Extreme{
	public static void main(String[] args){
	int a=10;
    int b=20;
    int c=15;
 int max=a>b?a:b;
	max=max>c?max:c;
 int min=a>b?b:a;
    min=min>c?c:min;
 System.out.println("最大值是:"+max+"最小值是:"+min);
	}
}