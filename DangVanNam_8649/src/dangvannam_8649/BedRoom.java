package dangvannam_8649;

public class BedRoom extends Room {

    private int numberOfBeds;

    @Override
    public double calculateCost() {
        return numberOfBeds > 3 ? getBaseCost() * super.caculateCaculateDayStays() * 1.1 : getBaseCost() * super.caculateCaculateDayStays();
    }

    @Override
    public void enterRoomInfo() {
        super.enterRoomInfo();
        System.out.println("Number of beds: ");
        numberOfBeds = sc.nextInt();
    }

    @Override
    public void updateRoomById(String id) {
        super.updateRoomById(id);
        System.out.println("Number of beds: ");
        numberOfBeds = sc.nextInt();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("6. Number of beds: " + numberOfBeds);
    }
}
