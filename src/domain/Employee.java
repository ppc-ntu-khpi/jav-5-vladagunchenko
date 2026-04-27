package domain;

/**
 * Клас, що представляє загальну модель співробітника компанії
 * @author Vlada
 * @version 1.0
 */
public class Employee {

    /**
     * Повертає інформацію про співробітника у вигляді рядка
     * @return String представлення об'єкта
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

    /**
     * Конструктор для створення нового співробітника з параметрами
     * @param name Ім'я співробітника
     * @param jobTitle Посада
     * @param level Рівень (1-3)
     * @param dept Відділ
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Конструктор за замовчуванням, що генерує випадковий ID
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
    }

    /**
     * Встановлює посаду співробітника
     * @param job назва посади
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає посаду співробітника
     * @return String посада
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я співробітника
     * @return String ім'я
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень кваліфікації співробітника (1, 2 або 3)
     * @param level рівень кваліфікації
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень кваліфікації співробітника
     * @return int рівень
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає назву відділу
     * @return String відділ
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює відділ для співробітника
     * @param dept назва відділу
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я співробітника з перевіркою на валідність через регулярний вираз
     * @param name повне ім'я
     */
    public void setName(String name) {
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}