
public class MoreFunctions implements Visitor{
	private Golf gg;
	@Override
	public void visit(Visitable v) {
		// TODO Auto-generated method stub
		
	}
	
	public void restartRound() {
	int x = 0;
	gg.setHolesPlayed(x);
	gg.setShots(x);
	}
	public int readHolesLeftToPlay() {
		
		return 18 - gg.readHolesPlayed();
		}
}
