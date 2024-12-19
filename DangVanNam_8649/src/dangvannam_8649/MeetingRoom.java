package dangvannam_8649;

public class MeetingRoom extends Room {

    private int capacity;

    @Override
    public double calculateCost() {
        return capacity > 50 ? getBaseCost() * super.caculateCaculateDayStays() * 1.2 : getBaseCost() * super.caculateCaculateDayStays();
    }

    @Override
    public void enterRoomInfo() {
        super.enterRoomInfo();
        System.out.println("Capacity: ");
        capacity = sc.nextInt();
    }

    @Override
    public void updateRoomById(String id) {
        super.updateRoomById(id);
        System.out.println("Capacity: ");
        capacity = sc.nextInt();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("6. Capacity: " + capacity);
    }
}
