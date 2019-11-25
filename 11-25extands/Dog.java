public class Dog extends Animal {
    String host;
    Dog(String host){
        super(1,3);
        this.host=host;
        numberOfLegs=4;
    }
    @Override
    public void scream(){
        System.out.println("汪汪");
    }
    public static void main(String[] args){
        Dog p1=new Dog("小明");
        System.out.println(p1.numberOfLegs);
        System.out.println(p1.host);
        p1.scream();
        System.out.println(p1.numberOfLegs);
    }
}
