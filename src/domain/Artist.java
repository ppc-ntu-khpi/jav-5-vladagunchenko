package domain;

/**
 * Клас, що представляє художника (Artist), який є спеціалізованим типом співробітника
 * @author Vlada
 * @version 1.0
 * @see Employee
 */
public class Artist extends Employee {

    /**
     * Конструктор для створення художника з повним набором даних
     * @param skiils Масив навичок художника
     * @param name Ім'я
     * @param jobTitle Посада
     * @param level Рівень
     * @param dept Відділ
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Конструктор для створення художника лише з масивом навичок
     * @param skiils Масив навичок
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * Конструктор за замовчуванням, що ініціалізує порожній масив на 10 навичок
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Повертає інформацію про художника разом зі списком його навичок
     * @return String представлення об'єкта
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    /**
     * Повертає навички художника у вигляді одного рядка через кому
     * @return String рядок навичок
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює новий масив навичок для художника
     * @param skills Масив нових навичок
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Повертає масив навичок як об'єкт
     * @return String[] масив навичок
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}