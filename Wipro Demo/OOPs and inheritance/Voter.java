package day3;

public class Voter {
	private String voterID;
    private boolean hasVoted;
    
    public Voter(String id) {
        this.voterID = id;
        this.hasVoted = false; 
    }
    public void setVoterID(String id) {
        this.voterID = id;
    }
    public String getVoterID() {
        return voterID;
    }
    public void vote() {
        if (!hasVoted) {
            hasVoted = true;
            System.out.println("Vote recorded successfully for Voter ID: " + voterID);
        } else {
            System.out.println("You have already voted!");
        }
    }
    public boolean getVotingStatus() {
        return hasVoted;
    }
}
