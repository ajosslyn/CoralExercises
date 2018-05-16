import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//javac Main.java
//java Main

public class Practice2 {

    public static void main(String[] args) {

        List<String> votes = Arrays.asList(
                "Ian","Debra","John", "Debra",
                "John","Ian","Debra", "Debra",
                "Debra","John","John", "Debra"
        );
    System.out.println(tallyVotes(votes));
    }

    public static HashMap<String, Integer> tallyVotes(List<String> votes){
        HashMap<String, Integer> talliedVotes = new HashMap<>();

        votes.forEach(vote ->{
            if(!talliedVotes.containsKey(vote)){
                talliedVotes.put(vote,1);
            }
            else{
                int whitespace = talliedVotes.get(vote);
                whitespace++;
                talliedVotes.put(vote, whitespace);
            }
        });
        return talliedVotes;


    }
}
