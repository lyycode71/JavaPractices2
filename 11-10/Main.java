class Person{
	//属性
	String name;
	String sex;
	int age;
	//方法
	public void say(String target){
		System.out.println(
		 name+"say hello to"+target);
	}
}
public class Main{
	public static void main(String[] args){
		Person p=new Person();
		p.name="小明";
		p.age=19;
		p.sex="男";
		p.say("小花");
	}
}