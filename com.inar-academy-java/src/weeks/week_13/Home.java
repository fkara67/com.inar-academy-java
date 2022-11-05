package weeks.week_13;

public class Home {
    private double area;
    private int numberOfBath;
    private int numberOfRooms;
    private boolean hasGarage;
    private double price;
    private double monthlyRentPay;

    private int constructionYear;

    public Home() {
        area = 50;
        numberOfBath = 1;
        hasGarage = false;
        price = 0;
        constructionYear = 0;
        numberOfRooms = 1;
        monthlyRentPay = 0;

    }
    public Home(int constructionYear, int numberOfRooms, double monthlyRentMoney) {
        this();
        this.constructionYear = constructionYear;
        this.numberOfRooms = numberOfRooms;
        this.monthlyRentPay = monthlyRentMoney;
    }
    public void print() {
        System.out.println("-----------HOME DETAILS----------------");
        System.out.printf("Area: %.2f\nNumber Of Bath: %d\nNumber Of Rooms: %d\nHas Garage?: %s\nPrice: %.2f\n" +
                        "Monthly Rent Money: %.2f\nConstruction Year: %d\n",
                area, numberOfBath, numberOfRooms, hasGarage, price, monthlyRentPay, constructionYear);
        System.out.println("-----------------------------");
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public int getNumberOfBath() {
        return numberOfBath;
    }

    public void setNumberOfBath(int numberOfBath) {
        this.numberOfBath = numberOfBath;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMonthlyRentPay() {
        return monthlyRentPay;
    }

    public void setMonthlyRentPay(double monthlyRentPay) {
        this.monthlyRentPay = monthlyRentPay;
    }
}
