package domain;

/**
 * Клас, що представляє редактора, який є спеціалізованим типом художника
 * @author Vlada
 * @version 1.0
 * @see Artist
 */
public class Editor extends Artist {

    /**
     * Конструктор для створення редактора з усіма параметрами
     * @param electronicEditing чи віддає перевагу електронному редагуванню
     * @param skiils масив навичок
     * @param name ім'я
     * @param jobTitle посада
     * @param level рівень
     * @param dept відділ
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор для створення редактора з навичками та вподобаннями
     * @param electronicEditing чи віддає перевагу електронному редагуванню
     * @param skiils масив навичок
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор для створення редактора лише з вподобаннями щодо редагування
     * @param electronicEditing чи віддає перевагу електронному редагуванню
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Конструктор за замовчуванням (встановлює електронне редагування як true)
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає повну інформацію про редактора, включаючи вподобання щодо редагування
     * @return String представлення об'єкта
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    /**
     * Повертає поточні вподобання щодо типу редагування
     * @return boolean true, якщо електронне; false, якщо паперове
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює вподобання щодо типу редагування
     * @param electronic true для електронного, false для паперового
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}