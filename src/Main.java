import java.util.SortedMap;
public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Бояра", "Боярский", "", 2, 35000);
        employees[1] = new Employee("Вика", "Мазутину", "", 5, 39000);
        employees[2] = new Employee("Илья", "Глазкович", "", 1, 90000);
        employees[3] = new Employee("Мимино", "Хачатирян", "", 1, 99000);
        employees[4] = new Employee("Васкес", "Рыбников", "", 3, 9000);
        employees[5] = new Employee("Семён", "Персунов", "", 1, 7000);
        employees[6] = new Employee("Самван", "Персон", "", 2, 36000);
        employees[7] = new Employee("Сребро", "Гнжевиц", "", 5, 49000);
        employees[8] = new Employee("Володарь", "Саамский", "", 4, 59000);
        employees[9] = new Employee("Глубокослав", "Солнцеславич", "", 4, 29000);
        System.out.println(getSalaryMin());
        System.out.println(getSalaryMax());
        System.out.println(getSalaryMid());
        System.out.println(calculateSalary());
        System.out.println(employees[0]);
    }

    public static int calculateSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee getSalaryMin() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public static Employee getSalaryMax() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

        public static double getSalaryMid () {
        return calculateSalary() / employees.length;
        }

    public static void showEmployees () {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void showEmployeesNames () {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }


    }