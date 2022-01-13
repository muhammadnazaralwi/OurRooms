package room;

public class RoomPrinter {
    RoomLoader roomLoader = new RoomLoader();
    public void showRoomList() throws Exception {
        Room[] rooms = roomLoader.load();

        for (Room room : rooms) {
            System.out.println(room.id + ". " + room.name);
        }
    }

    public void showDetailList(int id) throws Exception {
        Room[] rooms = roomLoader.load();;

        int index = id-1;
        System.out.println(rooms[index].name.toUpperCase());
        for (String facility : rooms[index].facilities) {
            System.out.println("\t- " + facility);
        }
        System.out.println("\tHarga: Rp" + rooms[index].price);
    }
}
