package weeks.week_12;

public class FootballClubTest {
    public static void main(String[] args) {
        Player messi = new Player("Messi", 20_000_000);
        Player ronaldo = new Player("Ronaldo", 4_000_000);
        Player gokhan = new Player("Gokhan Zan", 12_000);
        Player neymar = new Player("Neymar", 8_000_000);
        Player muslera = new Player("Muslera", 15_000_000);
        Player haaland = new Player("Haaland", 18_000_000);
        Player yunus = new Player("Yunus Akgun", 10_000_000);
        Player kerem = new Player("Kerem Akturkoglu", 10_000_000);

        FootballClub zonguldak_coal_sport = new FootballClub("ZonguldakCoalSport",
                40_000_000, 50_000,"Caydamar", 22_700, new Player[5]);
        zonguldak_coal_sport.buyPlayer(messi);
        zonguldak_coal_sport.buyPlayer(muslera);
        zonguldak_coal_sport.buyPlayer(haaland);
        zonguldak_coal_sport.buyPlayer(neymar);
        zonguldak_coal_sport.buyPlayer(ronaldo);

        zonguldak_coal_sport.sellPlayer(messi);

        zonguldak_coal_sport.buyPlayer(kerem);
        zonguldak_coal_sport.buyPlayer(yunus);
        zonguldak_coal_sport.buyPlayer(gokhan);
        zonguldak_coal_sport.buyPlayer(neymar);

        System.out.println(zonguldak_coal_sport.getBalance());
    }
}
