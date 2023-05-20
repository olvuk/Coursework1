public class Main {
    public static void printNames(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e.getName());
        }
    }
    public static double getAverageSalary(Employee[] employees) {
        return calculateTotalSalary(employees) / employees.length;
    }
    public static Employee getEmployeeWithMaxSalary (Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }
    public static Employee getEmployeeWithMinSalary (Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }

    public static void printEmployees(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public static int calculateTotalSalary(Employee[] employees) {
        int total = 0;
        for (Employee e : employees) {
            total = total + e.getSalary();
        }
        return total;
    }

        public static void main (String[] args) {

            Employee[] employees = new Employee[10];
            employees[0] = new Employee("Николева Наталья Сергеевна", 1, 36000);
            employees[1] = new Employee("Федорова Анна Петровна", 2, 45000);
            employees[2] = new Employee("Лецко Нина Александровна", 1, 40000);
            employees[3] = new Employee("Прус Алла Борисовна", 1, 56000);
            employees[4] = new Employee("Васильева Мария Александровна", 3, 55000);
            employees[5] = new Employee("Васильев Иван Николаевич", 4, 51000);
            employees[6] = new Employee("Ведлер Татьяна Николаевна", 5, 47000);
            employees[7] = new Employee("Ведлер Марина Николаевна", 5, 65000);
            employees[8] = new Employee("Петров Игорь Сергеевич", 1, 74000);
            employees[9] = new Employee("Найданов Сергей Васильевич", 3, 85000);

            printEmployees(employees);
            System.out.println();
            System.out.println("Сумма затрат на зарплату в месяц: " + calculateTotalSalary(employees) + " рублей.");
            System.out.println();
            System.out.println("Минимальная зарплата у сотрудника: " + getEmployeeWithMinSalary(employees));
            System.out.println();
            System.out.println("Максимальная зарплата у сотрудника: " + getEmployeeWithMaxSalary(employees));
            System.out.println();
            System.out.println("Средняя зарплата: " + getAverageSalary(employees) + " рублей.");
            System.out.println();
            printNames(employees);
            System.out.println();
            employees[5].setDepartment(2);
            employees[5].setSalary(63000);
            System.out.println(employees[5]);
        }
    }