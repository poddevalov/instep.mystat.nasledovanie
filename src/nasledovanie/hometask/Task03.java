package nasledovanie.hometask;

public class Task03 extends Task02 {
	private boolean presenceOfChildren;

	public Task03(String fio, String typeOfWork, int count, int countProcent, boolean children) {
		super(fio, typeOfWork, count, countProcent);
		presenceOfChildren = children;
	}

	String childTax() {
		if (!(presenceOfChildren)) {
			setCountProcent(getCountProcent() + 5);
			setProcent(getProcent().valueOf(getCountProcent()) + " %");
		}
		return getProcent();
	}

	void showStatistic() {
		System.out.printf("%-10s%-15s%-10s%-10s%n", getFio(), childTax(), sum(), getSumProcent());
	}
	
	 boolean getPresenceOfChildren(){
		 return presenceOfChildren;
	 }
}
