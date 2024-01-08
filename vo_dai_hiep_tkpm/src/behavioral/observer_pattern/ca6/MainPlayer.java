package behavioral.observer_pattern.ca6;

public class MainPlayer {
    public static void main(String[] args) {
        PlayerData playerData = new PlayerData(10,10, 10);
        DashBoard board = new DashBoard(playerData);

        playerData.setGrade(12);
        playerData.setTime(15);
        playerData.setCountDown(5);
    }
}
