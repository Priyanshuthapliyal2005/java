import java.util.*;

public class election {
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);

        int n;
        System.out.println("Enter the number of candidates:");
        n=s.nextInt();

        String candidates[]=new String[n];

        int votes[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the Candidate "+(i+1)+" name:");
            candidates[i]=s.next();

            System.out.println("Enter the votes received byCandidate "+(i+1)+" name: "+candidates[i]);
            votes[i]=s.nextInt();


        }

        int tVotes=0;
        for(int vote:votes){
            tVotes+=vote;
        }

        int maxVotes=Integer.MIN_VALUE;
        int winner=-1;
        double maxD=-1;
        for(int i=0;i<n;i++){
            double p=(double) votes[i] / tVotes * 100;
            if(votes[i]>maxVotes){
                maxVotes=votes[i];
                winner=i;
                maxD=p;
            }
            System.out.println(candidates[i]+" (candidate "+(i+1)+") received "+votes[i] + " votes and his votes percentage is "+String.format("%.2f%%", p));
        }

        System.out.println("Winner from this seat is "+candidates[winner] + " with "+maxVotes+ " votes and "+String.format("%.2f%%", maxD)+" of total votes");
    }
}
