import javax.swing.JOptionPane;

public class quizassignment {
	public static void main (String [] args) {
int numTimesPlayed= 0;
int computerWins= 0;
int userWins= 0;


for (int i= 0; numTimesPlayed< 10; i ++) {
	int compdieRoll= (int) (Math.random() *6)+1;
	int userdieRoll= (int) (Math.random() *6)+1; 

	if (compdieRoll > userdieRoll) {
		computerWins= computerWins+ 1;
		JOptionPane.showMessageDialog (null, "The computer roll was " + compdieRoll + "\n" + "The user roll was" + userdieRoll + "\n" + "The computer has won this round!");
	}
	if (compdieRoll < userdieRoll) {
		userWins= userWins+1;
		JOptionPane.showMessageDialog (null, "The computer roll was" + compdieRoll + "\n" + "The user roll was" + userdieRoll + "\n" + "The user has won this round!");
	}
	if (compdieRoll == userdieRoll) {
		JOptionPane.showMessageDialog (null, "The computer roll was " + compdieRoll + "\n" + "The user roll was" + userdieRoll + "\n" + "Tie! No scores!");
	
	}
	numTimesPlayed= numTimesPlayed + 1;
}
	if (computerWins > userWins) {
		JOptionPane.showMessageDialog (null, "The computer won " + computerWins + "\n" + "The user won " + userWins + "\n" +"The computer wins!! They are taking over the world mwuahaha");
	}
	if (computerWins < userWins) {
		JOptionPane.showMessageDialog (null, "The computer won " + computerWins + "\n" + "The user won " + userWins + "\n" + "The user wins!! Fascinating!!");
	}
	if (computerWins == userWins) {
		JOptionPane.showMessageDialog (null, "The computer won " + computerWins + "\n" + "The user won " + userWins + "\n" + "Tie.");
	}
		}
	}
