package 面试题1;

import java.util.ArrayList;

public class Animal {
    private int    id;        //动物的id
    private String an_species;//动物的种类
    private String an_sex;    //动物的性别
    private int    age;       //动物的年龄
    private static ArrayList<Animal> list = new ArrayList<Animal>();
    public Animal() {
    }

    public Animal(int id, String an_species, String an_sex, int age) {
        this.id = id;
        this.an_species = an_species;
        this.an_sex = an_sex;
        this.age = age;
    }

    public static ArrayList<Animal> getList() {
        return list;
    }

    public static void setList(ArrayList<Animal> list) {
        Animal.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAn_species() {
        return an_species;
    }

    public void setAn_species(String an_species) {
        this.an_species = an_species;
    }

    public String getAn_sex() {
        return an_sex;
    }

    public void setAn_sex(String an_sex) {
        this.an_sex = an_sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", an_species='" + an_species + '\'' +
                ", an_sex='" + an_sex + '\'' +
                ", age=" + age +
                '}';
    }
}
