
public class MoreFunctions implements Visitor {

	private Match mm;
	@Override
	public void visit(Visitable v) {
		// TODO Auto-generated method stub
		
		mm = (Match) v;
	}
	
	public void restartMatch() {
		int s1 = 0;
		int s2 = 0;
		mm.setTeam1Score(s1);
		mm.setTeam2Score(s2);
	}
	public String readResult() {
		if(mm.readTeam1Score()>mm.readTeam2Score()) {
			return "City Winning";
		}
		else if(mm.readTeam1Score()<mm.readTeam2Score()) {
			return "United Winning";
		}
		else {
			return "Draw";
		}
		}
}
