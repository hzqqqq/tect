package 泛型编程;

public class Main1 {
    public static void main(String[] args) {
        dome();
        dome1(10);
        dome1("kangkang");
        dome2();
    }
    /*
    泛型的使用
    1，自定义泛型的方法
    2，当不确定使用什么类型的时候可以使用泛型

     */
    public static void dome(){
        //由于定义的是泛型 所以可传入任意 想要传入的类型
        Person person=new Person("kangkang");
        System.out.println(person.getName());
        Person person1=new Person(1111);
        System.out.println(person1.getName());
    }

    //可以传递任意类型 但是传递之后就确定了该类型 以后不能随意转换
    //静态方法不建议通过类名是用
    //一般建议直接创建方法使用
    public  static <E> void dome1(E m){
        System.out.println(m);
    }


    //含有泛型的接口 接口实现需要的类型可以是多变的
    //需要什么类型 就定义什么类型的实现类
    public  static void dome2(){
        Jk2 jk2=new Jk2Impl();
        jk2.say("这是字符串");
        Jk2 jk21=new Jk2Impl1();
        jk21.say(1);

        }
    }


