public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1");
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total += salary;
            month++;
            System.out.println("Месяц" + month + " сумма накоплений " + total + " рублей");
        }
        System.out.println(" Задача2 ");
        int ten = 10;
        int zero = 0;
        while (zero < 10) {
            zero = zero++;
            zero++;
            System.out.print(zero + " ");
        }
        System.out.println();
        for (int a = 10; a > 0; a = a - 1) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Задача3 ");
        int y = 12000000;
        int birthrate = 17;
        int mortaliti = 8;
        int year = birthrate - mortaliti;
        for (int i = 1; i <= 10; i++) {
            y += y * year / 1000;
            System.out.println(" Год " + i + " численность населения составляе" + y);
        }
        System.out.println("Задача4");
        int vasia = 15000;
        int summa = 12_000_000;
        double mons = 0.07;
        int yer = 1;
        while (vasia <= summa) {
            vasia += vasia * mons;
            System.out.println(" месяц  " + yer + "%, сумма накоплений равен" + vasia);
            yer++;
            }

        System.out.println("Задача 5");
        int vasiaw = 15000;
        int summaw = 12_000_000;
        double monsw = 0.07;
        int yers = 1;
        while (vasiaw <= summaw) {
            vasiaw += vasiaw * monsw;

            if (yers  %6 == 0){
                System.out.println(" месяц + % " + yers + " сумма " + vasiaw);
            }
            yers++;

        }
            System.out.println("Задача6");
        int mony = 15000;
        int time = 7;
        int z = 0;
        int monht = 9 * 12 +1;
        for (int i = 0; i < monht ;  i ++ ) {
            z = (mony * 7) / 100;
            mony = mony + z;
            if (i % 6 == 0) {
                System.out.println(i + " сумма " + mony);
            }
        }
                System.out.println("Задача7");
                int friday = 7;
                int months = 31;
                while (friday <= months ) {
                        System.out.println(" Сегодня пятница " + friday + " число. необходимо подготовить отчет ");
                        friday += 7;

                }
                System.out.println("Задача8");
                int nowYear = 2023;
                int startYear = nowYear - 200;
                int finishYear = nowYear + 100;
                for (int day = 0; day < finishYear; day += 79) {
                    if (day > 0) {
                        System.out.println(" Сегодня пятница " + day + " число. Необходимо поготовить отчет");
                    }
                }

    }
}