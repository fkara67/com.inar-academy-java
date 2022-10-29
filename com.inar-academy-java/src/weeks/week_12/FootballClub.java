package weeks.week_12;

public class FootballClub {
    private int balance;
    String clubName;
    double ticketFee;
    String stadium;
    int stadiumCapacity;

    public FootballClub() {
        this(0, "", 0, "", 0);
    }
    public FootballClub(int balance, String clubName, double ticketFee, String stadium, int stadiumCapacity) {
        this.balance = balance;
        this.clubName = clubName;
        this.ticketFee = ticketFee;
        this.stadium = stadium;
        this.stadiumCapacity = stadiumCapacity;
    }
    public double getBalance() {
        return balance;
    }
    public double getTicketFee() {
        return ticketFee;
    }
    public String getClubName() {
        return clubName;
    }
    public String getStadium() {
        return stadium;
    }
    public int getStadiumCapacity() {
        return stadiumCapacity;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setTicketFee(double ticketFee) {
        this.ticketFee = ticketFee;
    }
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
    public void setStadium(String stadium) {
        this.stadium = stadium;
    }
    public void setStadiumCapacity(int stadiumCapacity) {
        this.stadiumCapacity = stadiumCapacity;
    }
}
