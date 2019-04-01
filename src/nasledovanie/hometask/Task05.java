package nasledovanie.hometask;

public class Task05 extends Task04 {
	private final int feeOffshoreRate = 40;

	Task05(String fio, String typeOfWork, int count, int countProcent, boolean children) {
		super(fio, typeOfWork, count, countProcent, children);
	}

	int sum() {
		if (getType().equals("rate"))
			return stavka * getCount();
		else if (getType().equals("hourly"))
			return hourly * getCount();
		else if (getType().equals("piecework"))
			return piecewort * getCount();
		else
			return feeOffshoreRate * getCount();
	}

	String childTax() {
		if (!(getPresenceOfChildren()) && !(getType().equals("offshore"))) {
			setCountProcent(getCountProcent() + 5);
			setProcent(getProcent().valueOf(getCountProcent()) + " %");
		}
		return getProcent();
	}
	
	int getSumProcent() {
		int a  = sum();
		if(getType().equals("offshore"))
			setCountProcent(0);
		return a-(a*getCountProcent()/100);
	}
	
	
}
