package FishAndCancer;

public abstract class FishAndMarineArthropods implements Lightable {

    protected String name;

    public FishAndMarineArthropods(String name) {
        this.name = name;
    }

    public abstract String feed(); // Что кушает. Абстрактный метод не нужно описывать, это сделают классы наследники;

    public abstract String sizeFish(); // размер животного;

    public  abstract String light(); // Освещение аквариума;

//    public  abstract String light(); // Свет в аквариуме;

    @Override // Проверяет нужно ли метод переопределять;
    public String toString() {
        return String.format("Имя: %s, Питание: %s, Размер: %s", name, feed(), sizeFish());
    }

}
