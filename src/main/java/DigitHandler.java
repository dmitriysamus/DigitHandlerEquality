import java.util.Objects;

/**
 * Класс - обертка над числом value.
 */
public class DigitHandler {
    private int value;

    /**
     * Конструктор объекта типа DigitHandler.
     */
    public DigitHandler(int value) {
        this.value = value;
    }

    /**
     * Производит расчет hashCode объекта по полю value.
     */
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    /**
     * Проверяет идентичность объектов по полю value.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!obj.getClass().equals(this.getClass())) {
            return false;
        }
        DigitHandler other = (DigitHandler) obj;

        return this.value == other.value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
