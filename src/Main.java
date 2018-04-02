import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList();
        String name, sex, type, attack;
        int PersonNumber = 0;
        boolean boo = true;
        while (boo) {
            System.out.println("功能列表\n==================");
            System.out.println("１.新增角色");
            System.out.println("２.修改角色");
            System.out.println("３.刪除角色");
            System.out.println("４.結束");
            int function = scn.nextInt();
            switch (function) {
                case 1:
                    System.out.println("請輸入姓名：");
                    name = scn.next();
                    System.out.println("請輸入性別：");
                    sex = scn.next();
                    System.out.println("請輸入攻擊力：");
                    attack = scn.next();
                    System.out.println("請輸入屬性：");
                    type = scn.next();
                    persons.add(new Person(name, sex, type, attack));
                    break;
                case 2:
                    System.out.println("請輸入你想要修改的角色");
                    name = scn.next();
                    for (int i = 0; i < persons.size(); i++) {
                        Person person = persons.get(i);
                        if (person.getName().equals(name)) {
                            PersonNumber = i;
                            person.ShowInto();
                            i = persons.size();
                        }
                    }
                    System.out.print("請輸入新的姓名：");
                    name = scn.next();
                    System.out.print("請輸入新的性別：");
                    sex = scn.next();
                    System.out.print("請輸入新的攻擊力");
                    attack = scn.next();
                    System.out.print("請輸入新的屬性");
                    type = scn.next();
                    persons.set(PersonNumber, new Person(name, sex, type, attack));
                    break;
                case 3:
                    System.out.print("請輸入你要刪除的角色名稱：");
                    for (int i = 0; i < persons.size(); i++) {
                        Person person = persons.get(i);
                        name = scn.next();
                        if (person.getName().equals(name)) {
                            PersonNumber = i;
                            person.ShowInto();
                            i = persons.size();
                            break;
                        }
                    }
                    persons.remove(PersonNumber);
                    break;
                case 5:
                    boo=false;
                    break;
            }
        }
    }
}