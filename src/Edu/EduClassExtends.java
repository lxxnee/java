package Edu;

public class EduClassExtends {
    public static void main(String[] args) {
        Whale whale = new Whale();
        whale.printInfo();
    }
}

class Mammal {
    String Kinds;
    protected String name;
//    final protected String name = "테스트"; // 상수

    public Mammal() {
        this.Kinds = "포유류";
        // this.name = "ss"; // 상수이므로 에러

    }

    // final method : 자식 클래스에서 오버라이딩 불가능
   public void printInfo() {
        System.out.println("Kinds: " + this.Kinds);
    }
}

class Whale extends Mammal {
    public Whale() {
        super();
        this.name = "고래";
//        System.out.println("Whale");
        System.out.println(this.Kinds.concat(this.name));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Name: " + this.name);
    }
}