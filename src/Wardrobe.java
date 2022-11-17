
public class Wardrobe extends SomeWardrobe implements UseWardrobe {
    private int count = 0;
    private StateDoor state;

    public Wardrobe() {
        this.state = StateDoor.Closed;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public StateDoor getState() {
        return state;
    }

    public void setState(StateDoor state) {
        this.state = state;
    }

    @Override
    public void openDoor() {
        if (this.state == StateDoor.Closed) {
            System.out.println("Открываем дверь...");
            this.state = StateDoor.Opened;
        } else {
            System.out.println("Нельзя открыть то, что уже открыто.");
        }
    }

    @Override
    public void closeDoor() {
        if (this.state == StateDoor.Opened) {
            System.out.println("Закрываем дверь...");
            this.state = StateDoor.Closed;
        } else {
            System.out.println("Нельзя закрыть то, что уже закрыто.");
        }
    }


}
