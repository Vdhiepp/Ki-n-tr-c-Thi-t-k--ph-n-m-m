package behavioral.observer_pattern.ca6;

public class DashBoard implements PlayerData.PlayerDataListener {
    PlayerData subject;

    public DashBoard(PlayerData subject){
        this.subject = subject;
        subject.addDashBoard(this);
    }

    @Override
    public void update(PlayerData data) {
        System.out.println("\nTime: " + data.time);
        System.out.println("Count down: " + data.countDown);
        System.out.println("Grade: " + data.grade);
    }
}
