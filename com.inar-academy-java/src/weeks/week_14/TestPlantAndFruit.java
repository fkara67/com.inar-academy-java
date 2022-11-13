package weeks.week_14;

public class TestPlantAndFruit {
    public static void main(String[] args) {
        Plants plant = new Plants();
        System.out.println(plant);
        System.out.println("-----------");
        Plants fruit = new Fruit();
        System.out.println(fruit);

        System.out.println("-----------------");

        Fruit apple = new Fruit();
        apple.setName("Apple");
        System.out.println(apple);
    }
}
