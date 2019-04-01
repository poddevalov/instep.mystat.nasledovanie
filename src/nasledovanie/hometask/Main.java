package nasledovanie.hometask;

public class Main {
	public static void main(String[] args) {
		Task01 ob = new Task01("Sidorov", "rate", 30);
		Task01 ob1 = new Task01("Petrov", "hourly", 160);
		Task01 ob2 = new Task01("Popov", "piecework", 40);
		Task01 ob3 = new Task01("Ivanov", "rate", 25);
		Task01[] mas = { ob, ob1, ob2, ob3 };
		Task01.show();
		for (Task01 m : mas) 
			m.showStatistic();
		Task01.conclusionTotalSum();

		System.out.println();
		Task02 sb = new Task02("Sidorov", "rate", 30, 20);
		Task02 sb1 = new Task02("Petrov", "hourly", 160, 20);
		Task02 sb2 = new Task02("Popov", "piecework", 40, 15);
		Task02 sb3 = new Task02("Ivanov", "rate", 25, 20);
		Task02[] mas1 = { sb, sb1, sb2, sb3 };
		Task02.show();
		for (Task02 m : mas1) 
			m.showStatistic();
		
		
		System.out.println();
		Task03 q = new Task03("Sidorov", "rate", 30, 20,true);
		Task03 q1 = new Task03("Petrov", "hourly", 160, 20,false);
		Task03 q2 = new Task03("Popov", "piecework", 40, 15,false);
		Task03 q3 = new Task03("Ivanov", "rate", 25, 20,false);
		Task03[] mas2 = { q, q1, q2, q3 };
		Task03.show();
		for (Task03 m : mas2) 
			m.showStatistic();
		
		System.out.println();
		Task04.setKursDolar(0.3);
		Task04 e = new Task04("Sidorov", "rate", 30, 20,true);
		Task04 e1 = new Task04("Petrov", "hourly", 160, 20,false);
		Task04 e2 = new Task04("Popov", "piecework", 40, 15,false);
		Task04 e3 = new Task04("Ivanov", "rate", 25, 20,false);
		Task04[] mas3 = { e, e1, e2, e3 };
		Task04.show();
		for (Task04 m : mas3) 
			m.showStatistic();
		
		System.out.println();
		Task05 a = new Task05("Sidorov", "rate", 30, 20,true);
		Task05 a1 = new Task05("Petrov", "hourly", 160, 20,false);
		Task05 a2 = new Task05("Popov", "piecework", 40, 15,false);
		Task05 a3 = new Task05("Ivanov", "offshore", 30, 40,true);
		Task05[] mas4 = { a, a1, a2, a3 };
		Task05.show();
		for (Task05 m : mas4) 
			m.showStatistic();
		
		System.out.println();
		Task06.setWorkingDayHours(8);
		Task06.setPieceworkOfHours(3);
		Task06.setPrize(100);
		Task06 s = new Task06("Sidorov", "rate", 30, 20,true);
		Task06 s1 = new Task06("Petrov", "hourly",201, 20,false);
		Task06 s2 = new Task06("Popov", "piecework", 40, 15,false);
		Task06 s3 = new Task06("Ivanov", "offshore", 30, 40,true);
		Task06[] mas5 = { s, s1, s2, s3 };
		Task06.show();
		for (Task06 m : mas5) 
			m.showStatistic();
	}
}
