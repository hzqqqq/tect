package 泛型编程;

import com.oracle.tools.packager.Log;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<String>();
        List<Integer> integerArrayList = new ArrayList<Integer>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        System.out.println(classIntegerArrayList);
        System.out.println(classStringArrayList);

        if (classStringArrayList.equals(classIntegerArrayList))
        {
            System.out.println("泛型测试"+ "类型相同");
        }
    }
}
