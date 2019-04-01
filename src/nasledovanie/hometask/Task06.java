package nasledovanie.hometask;

public class Task06 extends Task05 {
	private static int workingDayHours;// рабочий день ставка и офшор в часах
	private static int pieceworkOfHours;// количество затарченных часов на 1
										// работу
	private static int prize; // премия

	Task06(String fio, String typeOfWork, int count, int countProcent, boolean children) {
		super(fio, typeOfWork, count, countProcent, children);
	}

	static void setWorkingDayHours(int hours) {
		workingDayHours = hours;
	}

	static void setPieceworkOfHours(int hours) {
		pieceworkOfHours = hours;
	}

	static void setPrize(int sizePrize) {
		prize = sizePrize;
	}

	int paymentOfMoneyPrize() {
		if (getType().equals("rate")) {
			if (workingDayHours * getCount() > 200)
				return sum() + prize;
			return sum();
		} else if (getType().equals("hourly")) {
			if (getCount() > 200)
				return sum() + prize;
			return sum();
		} else if (getType().equals("piecework")) {
			if (pieceworkOfHours * getCount() > 200)
				return sum() + prize;
			return sum();
		} else
			return sum();
	}

	void showStatistic() {
		System.out.printf("%-10s%-15s%-10d%-10d%-10d%n", getFio(), childTax(), paymentOfMoneyPrize(),
				oplataSumProcent(), perevodDolar());
	}
	
	int getSumProcent() {
		int a  = paymentOfMoneyPrize();
		if(getType().equals("offshore"))
			setCountProcent(0);
		return a-(a*getCountProcent()/100);
	}
	

}
