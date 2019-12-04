import java.util.*;

public class TextList {
    public static void main(String[] args) {
        List<String> course = new ArrayList<String>();
        course.add("java");
        course.add("java se");
        course.add("java web");
        System.out.println(course);
        System.out.println(course.get(1));
        System.out.println(course);
        course.set(1,"C语言");
        System.out.println(course);
        List<String> subCourse=course.subList(0,2);
        System.out.println(subCourse);
        List<String> course2=new ArrayList<String>(course);
        System.out.println(course2);
        ArrayList<String> course3=(ArrayList<String>)course2;
        System.out.println(course3);

    }
}
