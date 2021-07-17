public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		int i= (square)/8; 
		if (i%2==1 && square%2 ==0 || i%2==0 && square%2==1) {
			return true;
		}else {
			return false;
		}
		//System.out.println(square);	
	}
}
