package dangvannam_8649;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoomList roomList = new RoomList();
        int choice;
        do {
            System.out.print("1. Add a new meeting room.\n"
                    + "2. Add a new bedroom.\n"
                    + "3. Update Room by id.\n"
                    + "4. Delete Room by id.\n"
                    + "5. Find Room by id.\n"
                    + "6. Display all Rooms.\n"
                    + "7. Find the most expensive Room.\n"
                    + "8. Count the total number of meeting room and bedroom separately in the RoomList.\n"
                    + "9. Exit.\n"
                    + "Enter option: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    MeetingRoom meetingRoom = new MeetingRoom();
                    meetingRoom.enterRoomInfo();
                    roomList.addRoom(meetingRoom);
                    break;
                case 2:
                    BedRoom bedRoom = new BedRoom();
                    bedRoom.enterRoomInfo();
                    roomList.addRoom(bedRoom);
                    break;
                case 3:
                    System.out.print("Enter id: ");
                    String idToUpdate = sc.next();
                    roomList.updateRoomById(idToUpdate);
                    break;
                case 4:
                    System.out.print("Enter id: ");
                    String idToDelete = sc.next();
                    roomList.deleteRoomById(idToDelete);
                    break;
                case 5:
                    System.out.print("Enter id: ");
                    String idToFind = sc.next();
                    roomList.findRoomById(idToFind);
                    break;
                case 6:
                    System.out.println("Display all Rooms");
                    roomList.displayAllRooms();
                    break;
                case 7:
                    System.out.println("Most expensive Room");
                    Room mostExpensiveRoom = roomList.findMostExpensiveRoom();
                    if (mostExpensiveRoom == null) {
                        System.out.println("No room in List");
                    } else {
                        mostExpensiveRoom.displayDetails();
                        System.out.println("Cost : " + mostExpensiveRoom.calculateCost());
                    }
                    break;
                case 8:
                    roomList.countRooms();
                    break;
                case 9 :
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 9);

    }

}
