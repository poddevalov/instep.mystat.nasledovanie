package nasledovanie.hometask;

public class Task04 extends Task03 {
	private static double kursDolara;
	private int money;

	Task04(String fio, String typeOfWork, int count, int countProcent, boolean children) {
		super(fio, typeOfWork, count, countProcent, children);
		money = 0;

	}

	int perevodDolar() {
		if (getType().equals("hourly"))
			return (int) (money * kursDolara);
		return money;
	}

	int oplataSumProcent() {
		if (getType().equals("hourly")) {
			money = getSumProcent() / 2;
			return money;
		}
		return getSumProcent();
	}

	static void show() {
		System.out.printf("%-10s%-15s%-10s%-15s%-15s%n", "FIO", "Tax, %", "Sum", "For payment", "At the rate");
		System.out.println("--------------------------------------------------------");
	}

	void showStatistic() {
		System.out.printf("%-10s%-15s%-10d%-15d%-15d%n", getFio(), childTax(), sum(), oplataSumProcent(),
				perevodDolar());
	}

	static void setKursDolar(double kurs) {
		kursDolara = kurs;
	}

}
