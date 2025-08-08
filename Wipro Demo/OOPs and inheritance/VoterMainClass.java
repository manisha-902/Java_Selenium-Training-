package day3;

public class VoterMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voter voter1 = new Voter("V12345");
		System.out.println("Voter ID: " + voter1.getVoterID());
		voter1.vote();
		System.out.println("Has Voted? " + voter1.getVotingStatus());
	}

}
