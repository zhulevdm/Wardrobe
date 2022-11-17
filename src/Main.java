public class Main {
    public static void main(String[] args) {
        Wardrobe wr1 = new Wardrobe();
        Person pr1 = new Person();

        pr1.putThing(wr1); //Положить что-то в шкаф
        pr1.putThing(wr1); //Положить что-то в шкаф
        pr1.putThing(wr1); //Положить что-то в шкаф

        pr1.putThing(wr1); //Положить в заполненный шкаф

        pr1.pullThing(wr1); //Взять что-то из шкафа
        pr1.pullThing(wr1); //Взять что-то из шкафа
        pr1.pullThing(wr1); //Взять что-то из шкафа

        pr1.pullThing(wr1); //Взять из пустого шкафа

        wr1.closeDoor(); //Пробуем закрыть уже закрытый шкаф
    }
}