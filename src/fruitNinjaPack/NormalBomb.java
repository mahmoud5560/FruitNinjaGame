package fruitNinjaPack;

public class NormalBomb extends Dangerous {

	@Override
	public int getDanger() {
			return -1;
		}

	@Override
	public String getImage() {
		// TODO Auto-generated method stub
		return "bombImage";
	}
}
