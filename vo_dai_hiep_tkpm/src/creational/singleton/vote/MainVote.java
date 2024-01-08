package creational.singleton.vote;

public class MainVote {
    public static void main(String[] args) {
        User user = new User("Hiep");
        user.vote(Candidate.trump);
        user.vote(Candidate.biden);
        User user1 = new User("Hung");
        user1.vote(Candidate.biden);

        Election.getInstance().print();
    }
}
