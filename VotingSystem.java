import java.util.*;
public class VotingSystem {
    public static void main(String[] args) {

        HashMap<String, Integer> votes=new HashMap<>();
        Scanner sc=new Scanner(System.in);

        votes.put("Raju",0);
        votes.put("Kartik",0);

        for(int i=1; i<= 3;i++) {
            System.out.print("Vote for: ");
            String name = sc.nextLine();
            votes.put(name, votes.get(name) + 1);
        }
        System.out.println("Final Votes:");
        System.out.println(votes);
    }
}
