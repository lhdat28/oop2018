package week2.task3;

public class Task3 {


//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class theDog {
    // Đối tượng chó
    private String name;
    private int age;
    private String sex;
    public String getName(){return name;}    
    public void setName(String name){this.name=name;}
    public int getAge(){return age;}    
    public void setAge(int age){this.age=age;}
    public String getSex(){return sex;}     
    public void setSex(String sex){this.sex=sex;}
    public void food(String nameFood){
        if (nameFood=="fish") {System.out.println("  thích cá :)))");}
        else  {System.out.println("csis này không ăn được (-_-) ");}
    }
    public void gau(){
        // TODO: Tiếng chó sủa
        System.out.print("Gâu Gâu");
    }
    public void sleep(){
        //TODO: con chó ngủ
        System.out.println("zzz...zzzz.zzz");
    }
}
class theMonkey{
    // con khỉ
    private String name;
    private int age;
    private String sex;
    public String getName(){return name;}    
    public void setName(String name){this.name=name;}
    public int getAge(){return age;}    
    public void setName(int age){this.age=age;}
    public String getSex(){return sex;}     
    public void setSex(String sex){this.sex=sex;}
    public void an(){
        System.out.print("Dang an");
    }
    public void ngu(){System.out.print("Dang ngu");}
    public void choi(){System.out.print("Dang choi");}
    public void food(String nameFood){
        if(nameFood=="banana"){ System.out.println("I like banana");}
        else {System.out.println(" :(((( ");}
    }
}
class the cat{
    private String name;
    private int age;
    private String sex;
    public String getName(){return name;}     
    public void setName(String name){this.name=name;}
    public int getAge(){return age;}     
    public void setName(int age){this.age=age;}
    public String getSex(){return sex;}     
    public void setSex(String sex){this.sex=sex;}
    public void ngu(){System.out.print("ZzZ.ZzZ.ZzZ");}
    public void an(){System.out.print("Dang an");}
}
}
