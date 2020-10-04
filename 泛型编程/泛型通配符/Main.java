package 泛型编程.泛型通配符;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/*
泛型是用在编译时期的技术  提高了编译时期的安全性

泛型是给编译器使用的技术
重要：
 运行时会将 泛型去掉  运行的class 文件中是不带泛型的

泛型通配符 代表任意的数据类型
 使用方法：
  不能创建对象
  只能作为方法的参数使用


    当不知道传入的参数是什么类型的时候 就可以是用通配符 来表示
    类如：
    定义一个方法来实现对任意list 的遍历
    list的类型可以是多样的



泛型使用的限定
 泛型上限： ？ extends E 表示使用的泛型只能是 E的子类或则E本省
 泛型下限： ？ supper E 表示使用的泛型只能是E的父类或则E本身
 */
/*
泛型类型在逻辑上看以看成是多个不同的类型，实际上都是相同的基本类型。
泛型有三种使用方式，分别为：泛型类、泛型接口、泛型方法
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
         ArrayList<String> arrayList1 =new ArrayList<>();
         arrayList1.add("kangkang");
         arrayList1.add("jony");
         arrayList1.add("kaikai");
         dome1(arrayList);
        System.out.println("==========");
         dome1(arrayList1);

         People a=new People("kangkang");
         Me me=new Me("jony",99);
         dome3(a);
         dome3(me);
       List<String> list=new ArrayList<>();
       List<Integer>list1=new ArrayList<>();
        System.out.println(list.getClass()==list1.getClass());
    }

    public  static void dome1 (ArrayList<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
public  static void dome3(People ren){
    System.out.println(ren.toString());
}
}
