import java.util.Arrays;
public class myArrayList{
	private int[] array;
	private int size;
	myArrayList(){
		array=new int[10];
		 size=0;
	}
	//尾插尾删 复杂度O(1)
	public void pushBack(int element){
		array[size++]=element;
	}
	public void popBack(){
		if(size<=0){
			System.out.println("已经空了");
			return;
		}else{
		array[--size]=0;
		}
	}
	public void pushFront(int element){
	for(int i=size;i>0;i--){
		array[i]=array[i-1];//空心=实心
	}
		array[0]=element;
		size++;
	}
	void popFront(){
		if(size==0){
			System.out.println("空了");
			return;
		}
		for(int i=1;i<=size-1;i++){
			array[i-1]=array[i];
			array[size--]=0;
		}
	}
	public void insert(int element,int index){
		size+=1;
		for(int i=size-1;i>=index;i--){
			array[i+1]=array[i];
		}
		array[index]=element;
	}
	@Override
	public String toString(){
	return Arrays.toString(Arrays.copyOf(array,size));	
	}
	public static void main(String[] args){
		myArrayList list=new myArrayList();
		list.pushBack(1);
		list.pushBack(2);
		list.insert(10,1);
		/*list.pushFront(10);
		System.out.println(list);
		list.popBack();
		System.out.println(list);
		list.popBack();*/
		System.out.println(list);
	}
}