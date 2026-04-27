package domain;

/**
 * Клас, що представляє менеджера, який керує списком підлеглих
 * @author Vlada
 * @version 1.0
 * @see Employee
 */
public class Manager extends Employee {

    /**
     * Конструктор для створення менеджера з повним набором даних
     * @param employees масив підлеглих співробітників
     * @param name ім'я
     * @param jobTitle посада
     * @param level рівень
     * @param dept відділ
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Конструктор для створення менеджера зі списком підлеглих
     * @param employees масив підлеглих
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Конструктор за замовчуванням, що ініціалізує порожній масив підлеглих на 10 позицій
     */
    public Manager() {
        super();
        this.employees = new Employee[10];
    }

    /**
     * Повертає інформацію про менеджера разом зі списком його підлеглих
     * @return String представлення об'єкта
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees();
    }

    private Employee[] employees;

    /**
     * Повертає імена всіх підлеглих у вигляді одного рядка
     * @return String рядок з іменами
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює новий список підлеглих
     * @param employees масив нових підлеглих
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Повертає масив підлеглих як об'єкт
     * @return Employee[] масив співробітників
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}