package Singleton.A4;

import java.util.ArrayList;
import java.util.List;

public class Election {
    public static Election instance;
    int trump = 0;
    int biden = 0;
    List<String> userVoted = new ArrayList<>();
    public static Election getInstance(){
        if (instance == null)
            instance = new Election();
        return instance;
    }
    public void vote(Candidate c, String name){
        for (String n: userVoted) {
            if (n.equals(name))
                return;
        }
        if (c == Candidate.trump){
            trump++;
            userVoted.add(name);
        }
        if (c == Candidate.biden){
            biden++;
            userVoted.add(name);
        }
    }
    public void print(){
        System.out.println("DS:"+ userVoted + "\nTrump: " + trump + "\n" + "Biden: " + biden);
    }
}
