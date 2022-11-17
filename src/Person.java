import java.util.Scanner;

public class Person {

    public void putThing(Wardrobe wr){
        Scanner input = new Scanner(System.in);
        wr.openDoor();
        if(wr.getCount() < 3){
            System.out.println("Кладём что-то на полку.");
            wr.setCount(wr.getCount() + 1);
            wr.closeDoor();
         }else {
            System.out.println("Полка занята.");
            System.out.println("Желаете заменить что-то? (да, нет)");
            String s = input.nextLine();
            if(s.equals("да")){
                System.out.println("Меняем шило на мыло...");
            }else if(s.equals("нет")) {
                System.out.println("Как пожелаете.");
            }
            wr.closeDoor();
        }


    }
    public void pullThing(Wardrobe wr){
        wr.openDoor();
        if(wr.getCount() == 0){
            System.out.println("Чтобы взять что-то ненужное, нужно положить что-то ненужное.");
        }else {
            System.out.println("Берём что-то из шкафа.");
            wr.setCount(wr.getCount() - 1);
        }
        wr.closeDoor();
    }
}
