package nasledovanie.hometask;

public class Task02 extends Task01 {
	private String procent;
	private int countProcent;

	public Task02() {
		// super();
		procent = null;
		countProcent = 0;
	}

	public Task02(String fio, String typeOfWork, int count, int countProcent) {
		super(fio, typeOfWork, count);
		this.countProcent = countProcent;
		procent = procent.valueOf(countProcent) + " %";
	}

	static void show() {
		System.out.printf("%-10s%-15s%-10s%-10s%n", "ФИО", "Налог, %", "Сумма", "К оплате");
		System.out.println("---------------------------------------");
	}

	void showStatistic() {
		System.out.printf("%-10s%-15s%-10s%-10s%n", getFio(), procent, sum(), getSumProcent());
	}

	int getSumProcent() {
		int a  = sum();
		return a-(a*countProcent/100);
	}

	int getCountProcent() {
		return countProcent;
	}
	
	void setCountProcent(int i) {
		countProcent = i;
	}

	String getProcent() {
		return procent;
	}

	void setProcent(String s) {
		procent = s;
	}

}
