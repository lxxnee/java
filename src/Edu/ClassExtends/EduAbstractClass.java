package Edu.ClassExtends;

import java.util.ArrayList;

public class EduAbstractClass {
    public static void main(String[] args) {
        // 다형성
        Mammel whale = new Whale();
        System.out.println(whale.birth());
        whale.test();

//        FlyingSquirrel fs = new FlyingSquirrel();
//        System.out.println(fs.birth());
//        fs.test();

//
//        Mammal[] arr = new Mammal[2];
//        arr[0] = new Whale();
//        arr[1] = new FlyingSquirrel();

        // 업캐스팅
        Mammel mammel;
        Whale whale2 = new Whale();
        mammel = (Mammel)whale;
        System.out.println(mammel.birth());

        Mammel[] arr= new Mammel[2];
        arr[0] = new Whale();
        arr[1] = new Whale();

        Whale whale3 = (Whale)arr[0];
        System.out.println(whale3.swimming());

        // 타입 다형성
        FlyingSquirrel flyingSquirrel = new FlyingSquirrel();
        ArrayList<Mammel> mammels = new ArrayList<>();
//        Mammel.add(Whale);
        mammels.add(flyingSquirrel);

        // 파라미터의 다형성

    }
}

interface Swimm {
    public String swimming();
}

abstract class Mammel {
    protected String name;

    public Mammel(String name) {
        this.name = name;
    }

    final public void instancePrint(Whale whale) {
        System.out.println(whale);

    }

    final public void instancePrint(FlyingSquirrel flyingSquirrel) {
        System.out.println(flyingSquirrel.toString());
    }

    final public String birth() {
        return this.name + " 출산합니다.";
    }

    abstract public String residence();

    public void test() {
        System.out.println("부모테스트");
    }
}

class Whale extends Mammel implements Swimm {
    /**
     * 생성자
     */
    public Whale() {
        super("고래");
    }

    public String residence() {
        return this.name + " 바다에 삽니다.";
    }

    public String swimming() {
        return this.name + " 헤엄칩니다.";
    }

    @Override
    public void test() {
        System.out.println("자식테스트");
    }
}

class FlyingSquirrel extends Mammel {
    public FlyingSquirrel() {
        super("날다람쥐");
    }

    public String residence() {
        return this.name + " 하늘을 납니다.";
    }
}

class FlyingFish extends Mammel implements Swimm {
    public FlyingFish() {
        super("날치");
    }

    public String residence() {
        return this.name + " 물속에 삽니다.";
    }

    public String swimming() {
        return this.name + " 헤엄칩니다.";
    }
}
