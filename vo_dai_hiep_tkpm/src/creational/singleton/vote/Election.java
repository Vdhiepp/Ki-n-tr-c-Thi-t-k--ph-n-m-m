package creational.singleton.vote;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;
    int trump = 0;
    int biden = 0;
    List<String> usersVoted = new ArrayList<>();
    public static Election getInstance(){
        if (instance == null)
            instance = new Election();
        return instance;
    }
    public void vote(Candidate c, String name){
        for (String n : usersVoted) {
            if (n.equals(name))
                return;
        }

        if (c == Candidate.trump){
            trump++;
            usersVoted.add(name);
        }

        if (c == Candidate.biden){
            biden++;
            usersVoted.add(name);
        }
    }

    public void print(){
        System.out.println("DS:"+ usersVoted + "\nTrump: " + trump + "\n" + "Biden: " + biden);
    }
}