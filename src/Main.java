public class Main {
    public static void main(String[] args) {

        MagicBox<Integer> intBox = new MagicBox<>(5);
        intBox.add(111);
        intBox.add(222);
        intBox.add(333);
        intBox.add(444);
        intBox.add(555);
        intBox.add(666); // коробка не добавила лишнее число;
        System.out.println(intBox.pick());


        MagicBox<String> stringBox = new MagicBox<>(5);
        stringBox.add("Кролик");
        stringBox.add("Помада");
        stringBox.add("Пистолет");
        stringBox.add("Карты");
        stringBox.add("Очки");
        stringBox.add("Нож"); // коробка не добавила лишней объект;
        System.out.println(stringBox.pick());
    }
}