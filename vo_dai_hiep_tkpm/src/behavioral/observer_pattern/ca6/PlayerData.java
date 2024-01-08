package behavioral.observer_pattern.ca6;

public class PlayerData {
    int time, countDown, grade;

    public PlayerData(int time, int countDown, int grade) {
        this.time = time;
        this.countDown = countDown;
        this.grade = grade;
    }

    PlayerDataListener dashBoard;

    public void addDashBoard(PlayerDataListener p){
        dashBoard = p;
        p.update(this);
    }

    public void setTime(int time) {
        this.time = time;
        dashBoard.update(this);
    }

    public void setCountDown(int countDown) {
        this.countDown = countDown;
        dashBoard.update(this);
    }

    public void setGrade(int grade) {
        this.grade = grade;
        dashBoard.update(this);
    }

    public static interface PlayerDataListener{
        void update(PlayerData data);
        //hoac dung
        //void update(int time, int countDown, int grade);
    }
}
