import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;

public class Practice{
    public static void main(String[] args) {
        List<String> votes = Arrays.asList(
            "Ian","Debra","John", "Debra",
            "John","Ian","Debra", "Debra",
            "Debra","John","John", "Debra"
        );

        System.out.print(tallyVotes(votes));
        
    }

    public static HashMap<String, Integer> tallyVotes(List<String> votes){
        HashMap<String, Integer> talliedVotes = new HashMap<String, Integer>();

        votes.forEach(vote -> {
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