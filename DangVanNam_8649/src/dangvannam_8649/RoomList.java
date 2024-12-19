package dangvannam_8649;

import java.util.ArrayList;

public class RoomList {

    private ArrayList<IRoom> roomList = new ArrayList<>();

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public void updateRoomById(String id) {
        for (IRoom room : roomList) {
            room.updateRoomById(id);
        }
    }

    public void deleteRoomById(String id) {
//        for (IRoom room: roomList) {
//            if (((Room)room).getId().equals(id)) {
//                roomList.remove(room);
//            }
//        }
        if (roomList.removeIf(room -> ((Room) room).getId().equals(id))) {
            System.out.println("Success");
        } else {
            System.out.println("Invalid id!");
        }
    }

    public void findRoomById(String id) {
        for (IRoom room : roomList) {
            if (((Room) room).getId().equals(id)) {
                room.displayDetails();
            }
        }
    }

    public void displayAllRooms() {
        for (IRoom room : roomList) {
            room.displayDetails();
        }
    }

    public Room findMostExpensiveRoom() {
        if (roomList.isEmpty()) {
            return null;
        }

        Room mostExpensiveRoom = (Room) roomList.get(0);
        double maxCost = mostExpensiveRoom.calculateCost();

        for (IRoom room : roomList) {
            if ((room.calculateCost() > maxCost)) {
                mostExpensiveRoom = (Room) room;
                maxCost = room.calculateCost();
            }
        }

        return mostExpensiveRoom;
    }

    public void countRooms() {
        int coutMeetingRoom = 0, coutBedRoom = 0;
        for (IRoom room : roomList) {
            if (room instanceof MeetingRoom) {
                coutMeetingRoom++;
            } else if (room instanceof BedRoom) {
                coutBedRoom++;
            }
        }
        System.out.println("Meeting room: " + coutMeetingRoom + " rooms");
        System.out.println("Bed room: " + coutBedRoom + " rooms");
    }

}
