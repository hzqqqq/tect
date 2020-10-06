package 面试题1;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        set();//创建一些动物
        int cs;
        while (true) {
            System.out.println("================================================");
            System.out.println("欢迎来到动物信息系统，请选择你操作动物信息的方式: ");
            System.out.println("1.增加动物信息。");
            System.out.println("2.删除动物信息。");
            System.out.println("3.修改动物信息。");
            System.out.println("4.查询动物信息。");
            System.out.println("5.退出系统。");
            cs = sin.nextInt();
            switch (cs) {
                //1.增加动物信息。
                case 1:
                    Add_animal_im();
                    break;
                //2.删除动物信息。
                case 2:
                    delete_animal_im();
                    break;
                //3.修改动物信息。
                case 3:
                    Update_animal_im();
                    break;
                //4.查询动物信息。
                case 4:
                    Select_animal_im();
                    break;
                //5.退出系统。
                case 5:
                    return;
                default:
                    System.out.println("错误输入");
                    break;
            }
        }
    }

    //创建一些动物
    public static void set() {
        Animal animal = new Animal(Animal.getList().size(), "cat", "male", 3);
        Animal.getList().add(animal);
        Animal animal2 = new Animal(Animal.getList().size(), "dog", "male", 2);
        Animal.getList().add(animal2);
        Animal animal3 = new Animal(Animal.getList().size(), "rabbit", "female", 4);
        Animal.getList().add(animal3);
    }

    //1.增加动物信息。
    public static void Add_animal_im() {
        Scanner sin = new Scanner(System.in);
        while (true) {
            System.out.println("================================================");
            System.out.println("这里是动物信息增加界面，请选择你操作动物信息的方式: ");
            System.out.println("1.增添动物的种类。");
            System.out.println("2.增添动物的性别。");
            System.out.println("3.增添动物的年龄。");
            System.out.println("4.增添一只新的动物。");
            System.out.println("5.返回动物信息系统界面。");
            int cs = sin.nextInt();
            switch (cs) {
                //1.增添动物的种类
                case 1: {
                    add_spe();
                    break;
                }
                //2.增添动物的性别
                case 2: {

                    add_sex();
                    break;
                }
                //3.增添动物的年龄
                case 3: {
                    add_age();
                    break;
                }
                //4，增添一只新的动物
                case 4:
                    add4();
                    break;
                //返回
                case 5:
                    return;
            }
        }
    }

    public static void add4() {
        Scanner sin = new Scanner(System.in);
        System.out.println("请输入动物的信息");
        System.out.println("种类： ");
        String spe = sin.next();
        System.out.println("性别： ");
        String sex = sin.next();
        System.out.println("年龄： ");
        int age = sin.nextInt();

        Animal animal = new Animal(Animal.getList().size(), spe, sex, age);
        Animal.getList().add(animal);
        if (animal != null) System.out.println("增添成功");
    }

    public static void add_spe() {
        Scanner sin = new Scanner(System.in);
        int id;
        System.out.println("请输入该动物的id：");
        try {
            id = sin.nextInt();
        }catch (Exception e) {
            System.out.println("id输入错误，请重新输入。");
            return;
        }
        for (int i = 0; i < Animal.getList().size(); i++) {
            if (id == Animal.getList().get(i).getId()) {
                System.out.println("请输入该动物增添后的种类：");
                String spe = sin.next();
                if (Animal.getList().get(i).getAn_species() == null) {
                    Animal.getList().get(i).setAn_species(spe);
                    System.out.println("增添成功");
                    Animal.getList().add(id, Animal.getList().get(i));
                } else {
                    System.out.println("增添失败，该动物的种类信息已经存在。");
                }
                return;
            }
        }
        System.out.println("增添失败，该id已经存在。");
        return;
    }

    public static void add_sex() {
        Scanner sin = new Scanner(System.in);
        int id;
        System.out.println("请输入该动物的id：");
        try {
            id = sin.nextInt();
        }catch (Exception e) {
            System.out.println("id输入错误，请重新输入。");
            return;
        }
        for (int i = 0; i < Animal.getList().size(); i++) {
            if (id == Animal.getList().get(i).getId()) {
                System.out.println("请输入该动物增添后的性别：");
                String sex = sin.next();
                if (Animal.getList().get(i).getAn_sex() == null) {
                    Animal.getList().get(i).setAn_sex(sex);
                    System.out.println("增添成功");
                    Animal.getList().add(id, Animal.getList().get(i));
                } else {
                    System.out.println("增添失败，该动物的性别信息已经存在。");
                }
                return;
            }
        }
        System.out.println("增添失败，该id已经存在。");
        return;
    }

    public static void add_age() {
        Scanner sin = new Scanner(System.in);
        int id;
        System.out.println("请输入该动物的id：");
        try {
            id = sin.nextInt();
        }catch (Exception e) {
            System.out.println("id输入错误，请重新输入。");
            return;
        }
        for (int i = 0; i < Animal.getList().size(); i++) {
            if (id == Animal.getList().get(i).getId()) {
                System.out.println("请输入该动物增添后的年龄");
                int age = sin.nextInt();
                if (Animal.getList().get(i).getAge() == -1) {
                    Animal.getList().get(i).setAge(age);
                    System.out.println("增添成功");
                } else {
                    System.out.println("增添失败，该动物的种类信息已经存在。");
                }
                return;
            }
        }
        System.out.println("增添失败，该id已经存在。");
        return;
    }


    //2.删除动物信息。
    public static void delete_animal_im() {
        Scanner sin = new Scanner(System.in);
        while (true) {
            System.out.println("================================================");
            System.out.println("这里是删除动物信息界面，请选择你操作动物信息的方式: ");
            System.out.println("请选择你操作动物的方式: ");
            System.out.println("1.删除该动物的种类");
            System.out.println("2.删除该动物的性别");
            System.out.println("3.删除该动物的年龄");
            System.out.println("4.删除该动物全部信息");
            System.out.println("5.返回动物信息系统界面。");
            int cs1 = sin.nextInt();
            int id;
            switch (cs1) {
                case 1: {
                    System.out.println("请输入你要删除的动物的id：");
                    try {
                        id = sin.nextInt();
                    }catch (Exception e) {
                        System.out.println("id输入错误，请重新输入。");
                        return;
                    }
                    delete_spe(id);
                    break;
                }
                case 2: {
                    System.out.println("请输入该动物的id：");
                    try {
                        id = sin.nextInt();
                    }catch (Exception e) {
                        System.out.println("id输入错误，请重新输入。");
                        return;
                    }
                    delete_sex(id);
                    break;
                }
                case 3: {
                    System.out.println("请输入该动物的id：");
                    try {
                        id = sin.nextInt();
                    }catch (Exception e) {
                        System.out.println("id输入错误，请重新输入。");
                        return;
                    }
                    delete_age(id);
                    break;
                }
                case 4: {
                    System.out.println("请输入该动物的id：");
                    try {
                        id = sin.nextInt();
                    }catch (Exception e) {
                        System.out.println("id输入错误，请重新输入。");
                        return;
                    }
                    delete_ai(id);
                    break;
                }
                case 5:
                    return;
            }

        }
    }

    public static void delete_ai(int id) {//删除该动物全部信息

        for (int i = 0; i < Animal.getList().size(); i++) {
            if (id == Animal.getList().get(i).getId()) {
                if (Animal.getList().get(id) != null) {
                    Animal.getList().remove(id);
                    System.out.println("删除成功");
                } else {
                    System.out.println("删除失败");
                }
                return;
            }
        }
        System.out.println("删除失败，该id不存在");
        return;
    }

    public static void delete_age(int id) {
        for (int i = 0; i < Animal.getList().size(); i++) {
            if (id == Animal.getList().get(i).getId()) {
                if (Animal.getList().get(i).getAge() != -1) {
                    Animal.getList().get(i).setAge(-1);
                    System.out.println("删除成功");
                } else {
                    System.out.println("删除失败");
                }
                return;
            }
        }
        System.out.println("删除失败，该id不存在");
        return;
    }

    public static void delete_sex(int id) {
        String sex = null;//初始化为"null"
        for (int i = 0; i < Animal.getList().size(); i++) {
            if (id == Animal.getList().get(i).getId()) {
                if (Animal.getList().get(i).getAn_sex() != null) {
                    Animal.getList().get(i).setAn_sex(sex);
                    System.out.println("删除成功");
                } else {
                    System.out.println("删除失败");
                }
                return;
            }
        }
        System.out.println("删除失败，该id不存在");
        return;
    }

    public static void delete_spe(int id) {
        String spe = null;//初始化为"null"
        for (int i = 0; i < Animal.getList().size(); i++) {
            if (id == Animal.getList().get(i).getId()) {
                if (Animal.getList().get(i).getAn_species() != null) {
                    Animal.getList().get(i).setAn_species(spe);
                    System.out.println("删除成功");
                } else {
                    System.out.println("删除失败");
                }
                return;
            }
        }
        System.out.println("删除失败，该id不存在");
        return;
    }


    //3.修改动物信息。
    public static void Update_animal_im() {
        Scanner sin = new Scanner(System.in);
        while (true) {
            System.out.println("================================================");
            System.out.println("这里是修改动物信息界面，请选择你操作动物信息的方式: ");
            System.out.println("请选择你操作动物信息的方式: ");
            System.out.println("1.修改该动物的种类");
            System.out.println("2.修改该动物的性别");
            System.out.println("3.修改该动物的年龄");
            System.out.println("4.修改动物的全部信息");
            System.out.println("5.返回动物信息系统界面。");
            int cs = sin.nextInt();
            int id;
            switch (cs) {
                //修改动物的种类
                case 1: {
                    System.out.println("请输入该动物的id：");
                    try {
                        id = sin.nextInt();
                    }catch (Exception e) {
                        System.out.println("id输入错误，请重新输入。");
                        return;
                    }
                    update_spe(id);
                    break;
                }
                //2.修改动物的性别
                case 2: {
                    System.out.println("请输入该动物的id：");
                    try {
                        id = sin.nextInt();
                    }catch (Exception e) {
                        System.out.println("id输入错误，请重新输入。");
                        return;
                    }
                    update_sex(id);
                    break;
                }
                //3.修改动物的年龄
                case 3: {
                    System.out.println("请输入该动物的id：");
                    try {
                        id = sin.nextInt();
                    }catch (Exception e) {
                        System.out.println("id输入错误，请重新输入。");
                        return;
                    }
                    update_age(id);
                    break;
                }
                case 4:
                    System.out.println("请输入该动物的id：");
                    try {
                        id = sin.nextInt();
                    }catch (Exception e) {
                        System.out.println("id输入错误，请重新输入。");
                        return;
                    }
                    update_all(id);
                    break;
                case 5:
                    return;
            }

        }
    }

    public static void update_all(int id) {
        Scanner sin = new Scanner(System.in);
        int id1;
        for (int i = 0; i < Animal.getList().size(); i++) {
            if (id == Animal.getList().get(i).getId()) {
                System.out.println("请输入你要修改后动物全部信息：");
                System.out.println("新的id: ");
                id1 = sin.nextInt();
                for (int j = 0; j < Animal.getList().size(); j++) {
                    if (id1 == Animal.getList().get(j).getId()) {
                        System.out.println("修改失败，该id已经存在");
                        return;
                    }
                }
                Animal.getList().get(i).setId(id1);

                System.out.println("种类： ");
                String spe = sin.next();
                Animal.getList().get(i).setAn_species(spe);

                System.out.println("性别: ");
                String sex = sin.next();
                Animal.getList().get(i).setAn_sex(sex);

                System.out.println("年龄: ");
                int age = sin.nextInt();
                Animal.getList().get(i).setAge(age);

                System.out.println("修改成功");
                return;
            }
        }
        System.out.println("修改失败，该id不存在。");
        return;
    }

    public static void update_age(int id) {
        Scanner sin = new Scanner(System.in);
        for (int i = 0; i < Animal.getList().size(); i++) {
            if (id == Animal.getList().get(i).getId()) {
                System.out.println("请输入你要修改后的动物的年龄：");
                int age = sin.nextInt();
                Animal.getList().get(i).setAge(age);
                System.out.println("修改成功");
                return;
            }
        }
        System.out.println("修改失败，该id不存在。");
        return;
    }

    public static void update_sex(int id) {
        Scanner sin = new Scanner(System.in);
        for (int i = 0; i < Animal.getList().size(); i++) {
            if (id == Animal.getList().get(i).getId()) {
                System.out.println("请输入你要修改后的动物的性别：");
                String sex = sin.next();
                Animal.getList().get(i).setAn_sex(sex);
                System.out.println("修改成功");
                return;
            }
        }
        System.out.println("修改失败，该id不存在。");
        return;
    }

    public static void update_spe(int id) {
        Scanner sin = new Scanner(System.in);
        for (int i = 0; i < Animal.getList().size(); i++) {
            if (id == Animal.getList().get(i).getId()) {
                System.out.println("请输入你要修改后的动物的种类：");
                String spe = sin.next();
                Animal.getList().get(i).setAn_species(spe);
                System.out.println("修改成功");
                return;
            }
        }
        System.out.println("修改失败，该id不存在。");
        return;
    }


    //4.查询动物信息。
    public static void Select_animal_im() {
        Scanner sin = new Scanner(System.in);
        while (true) {
            System.out.println("================================================");
            System.out.println("这里是查询动物信息界面，请选择你操作动物信息的方式: ");
            System.out.println("1.查询全部动物的信息。");
            System.out.println("2.查询某一只动物的信息。");
            System.out.println("3.返回动物信息系统界面。");
            int cs = sin.nextInt();
            switch (cs) {
                case 1:
                    select_all();
                    break;
                case 2:
                    select_one();
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void select_one() {
        Scanner sin = new Scanner(System.in);
        int id;
            System.out.println("请输入该动物的id：");
            try {
                 id = sin.nextInt();
            }catch (Exception e) {
                System.out.println("id输入错误，请重新输入。");
                return;
            }
        for (int i = 0; i < Animal.getList().size(); i++) {
                if (id == Animal.getList().get(i).getId()) {
                    System.out.println("查询结果：");
                    System.out.println(Animal.getList().get(i));
                    return;
                }
            }
            System.out.println("查询失败，该id不存在。");
            return;
        }


    public static void select_all() {
        System.out.println("查询结果：");
        for (int i = 0; i < Animal.getList().size(); i++) {
            System.out.println(Animal.getList().get(i));
        }
    }
}

