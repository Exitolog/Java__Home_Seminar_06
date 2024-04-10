
public class Main {
    public static void main(String[] args) {
        PhoneB t1 = new PhoneB();
        t1.add("Вася",123456);
        t1.add("Петя",12356);
        t1.add("Гриша",123477);
        t1.add("Семен",123564);
        t1.add("Вася",1234);
        t1.add("Вася",8516);
        t1.add("Гриша",232313);
        t1.add("Гриша",232313);
        System.out.println(t1.sorted());
    }
}