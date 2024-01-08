package Singleton.A4;

public class MainA4 {
    public static void main(String[] args) {
        User user = new User("Abc");
        user.vote(Candidate.trump);
        user.vote(Candidate.biden);
        User user1 = new User("Def");
        user1.vote(Candidate.biden);

        Election.getInstance().print();
    }
}
