package weeks.week_13;

public class TestHome {
    public static void main(String[] args) {
        Home home1 = new Home();
        Home home2 = new Home(2010, 3 , 4000);

        home1.setMonthlyRentPay(1000);
        home1.setNumberOfRooms(2);
        home1.setPrice(50000);
        home2.setPrice(250000);
        home2.setHasGarage(true);
        home1.setConstructionYear(2000);

        home1.print();
        home2.print();

    }
}
