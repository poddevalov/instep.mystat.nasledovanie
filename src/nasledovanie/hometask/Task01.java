package nasledovanie.hometask;

public class Task01 {
	final int stavka = 20;//earns for 1 day
	final int hourly = 3;//earns for 1 hour of work
	final int piecewort = 15;//1 earns for the work performed
	private String fio;
	private String typeOfWork;
	private int count;
	private static int total;

	public Task01() {
		fio = null;
		typeOfWork = null;
		count = 0;
	}

	public Task01(String fio, String typeOfWork, int count) {
		this.fio = fio;
		this.typeOfWork = typeOfWork;
		this.count = count;
	}

	static void show() {
		System.out.printf("%-10s%-15s%-10s%n", "ФИО", "Вид работы", "Сумма");
		System.out.println("-----------------------------");
	}

	void showStatistic() {
		System.out.printf("%-10s%-15s%-10s%n", fio, typeOfWork, sum());
		totalSum(sum());
	}

	int sum() {
		if (typeOfWork.equals("ставка"))
			return stavka * count;
		else if (typeOfWork.equals("почасовая"))
			return hourly * count;
		else
			return piecewort * count;
	}

	static int totalSum(int sum) {
		return total += sum;
	}

	static void conclusionTotalSum() {
		System.out.printf("%-5s%23d%n", "Итого", total);
	}

	String getFio() {
		return fio;
	}

	String getType() {
		return typeOfWork;
	}

	int getCount() {
		return count;
	}
}
