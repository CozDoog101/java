public class Main {

    interface Manageable {
        double calculateBonus();
    }

    abstract static class Employee implements Manageable {
        protected int id;
        protected String name;
        protected double salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        @Override
        public abstract double calculateBonus();

        public void displayInfo() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary + " lv.");
        }
    }

    static class Manager extends Employee {
        private final double bonusPercentage;

        public Manager(int id, String name, double salary,
                       double bonusPercentage) {
            super(id, name, salary);
            this.bonusPercentage = bonusPercentage;
        }

        @Override
        public double calculateBonus() {
            return salary * bonusPercentage / 100;
        }
    }

    static class Developer extends Employee {
        private final double fixedBonus;

        public Developer(int id, String name, double salary,
                          double fixedBonus) {
            super(id, name, salary);
            this.fixedBonus = fixedBonus;
        }

        @Override
        public double calculateBonus() {
            return fixedBonus;
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Manager(1, "Ivan", 3000, 15),
            new Developer(2, "Maria", 2500, 500),
            new Manager(3, "Georgi", 4000, 20),
            new Developer(4, "Elena", 2800, 700)
        };

        for (Employee employee : employees) {
            employee.displayInfo();

            System.out.println(
                "Bonus: " + employee.calculateBonus() + " lv."
            );

            System.out.println("--------------------");
        }
    }
}