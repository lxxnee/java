package Edu.InnerClass;

public class InnerClass {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Mammal.Whale whlae = mammal.new Whale();
        whlae.info();

        // 위에세줄을 한줄로 축약
        Mammal.Whale whale2 = new Mammal().new Whale();
        whale2.info();
    }
}

class Mammal {
    String birth = "출산";

    class Whale {
        String name = "고래";
        String color = "회색";

        // 자바 언어 사양상 컴파일 에러 발생
        // 주의 : 컴파일러에 따라 특정 설정하에 동작 할수도 있으나, static 사용하지않기
        static int age = 18;

        public void info() {
            System.out.println(birth);
            System.out.println(color);
            System.out.println(name);
        }
    }
}
