package 泛型编程;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*

泛型就是能够广泛应用
但泛型还有一种较为准确的说法就是为了 “参数化类型”，或者说可以将类型当作参数传递给一个类或者是方法

1，当我么你不知需要的类型是什么就可以用泛型
2，泛型也可以是一个数据类型来接受变量

泛型还可以同时接受多个类型
public class MultiType <E,T>{
   E value1;
   T value2;

   public E getValue1(){
       return value1;
   }

   public T getValue2(){
       return value2;
 */
public class Main {
    public static void main(String[] args) {
       // dome1();
        demo2();
        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("aaa");
        arrayList1.add("bbb");
        arrayList1.add("ccc");
        ArrayList<Integer> arrayList2=new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);

    }
    //泛型参数可以变化的例子
    public  static<T> void dome2(T...x){
        for (T t: x) {
            System.out.println(t);
        }
    }
    /*创建集合不使用的泛型
    集合不使用泛型会默认为object类型
    好处：
    集合不使用泛型就object类型 可一储存任意类型的数据
    弊端：
    不安全 会引发异常
     */

    /*
    使用泛型的好处：
    1，避免类型转换出现异常的麻烦
    2，把运行期间的错误提升带了编译阶段
    意思是在编译的时候如果类型转换时 类型不匹配就会出现报错的情况
    弊端：
    泛型时什么类型就只能存储什么类型的数据
     */
    /*不使用泛型*/
    public static  void dome1(){
//不使用泛型
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add("aaa");
        Iterator iterator= list.iterator();
        while(iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
            String s = (String)next;//这里向下转型的时候 出现异常
                                    //不能将1转化为String类型
            System.out.println(s.length());
        }
    }
    /*使用泛型*/
    public static  void demo2(){
        ArrayList<Integer>integers=new ArrayList<>();//泛型为Integer
        integers.add(5);
        integers.add(4);
        integers.add(3);
        integers.add(2);
        Iterator x =integers.iterator();
        while(x.hasNext()){
            Object next = x.next();
            System.out.println(next);
        }
    }
    //泛型限定
    public  static void demo3(Collection<? extends Object> collection){
       Iterator<?> iterator= collection.iterator();
       while(iterator.hasNext()){
           Object next = iterator.next();
           System.out.println(next);

       }
    }
}
