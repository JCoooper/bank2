
public class Checking extends BAccount {
	private int with;
	private int withd = 0;// here

	public Checking(double moneys, double timePass, int accT, int withdraw) {
		super(moneys, timePass, accT);
		with = withdraw;

		if (with > 3) {
			moneys = getBal() - 1;
		}

		// withd = withd + 1;// here

		if (withd > 3) { // here
			setBal(getBal() - 1);
		}
	}

	public int getwith() {
		return with;
	}

	public void setWit(int set) {// ?? set
		with = 0;
	}

	public int getWithd() {
		return withd;
	}

	public void setWithd(int withdra) {
		withd = withdra;
	}

}
