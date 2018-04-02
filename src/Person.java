public class Person {
    private String Name, Sex, Type;
    private String Attack;
    public Person(String name1, String sex1, String type1, String attack1){
        Name=name1;
        Sex=sex1;
        Type=type1;
        Attack=attack1;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name1){
        Name=name1;
    }
    public String getSex() {
        return Sex;
    }
    public void setSex(String sex1){
        Sex=sex1;
    }
    public String getType() {
        return Type;
    }
    public void setType(String type1){
        Type=type1;
    }

    public String getAttack() {
        return Attack;
    }
    public void setAttack(String attack1){
        Attack=attack1;
    }
    public void ShowInto(){
        System.out.println("姓名："+ Name);
        System.out.println("性別："+ Sex);
        System.out.println("攻擊力："+ Attack);
        System.out.println("屬性："+ Type);
    }
}