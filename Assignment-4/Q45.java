import java.util.TreeMap;

public class Q45 {
    public static void main(String[] args) {
        TreeMap<Integer, String> hotelRooms = new TreeMap<>();

        System.out.println("Check-ins in the order guests arrived");
        System.out.println("-------------------------");

        int[] rooms = {305, 102, 410, 201, 118, 307};
        String[] guests = {"Mr. Kapoor", "Ms. Fernandes", "Dr. Rao", "Mrs. Bose", "Mr. Gill", "Ms. Joshi"};

        for (int i = 0; i < rooms.length; i++) {
            hotelRooms.put(rooms[i], guests[i]);
            System.out.println("Room " + rooms[i] + " given to " + guests[i]);
        }

        System.out.println("-------------------------");
        System.out.println("Front desk register, sorted by room number");
        System.out.println("-------------------------");

        for (Integer room : hotelRooms.keySet()) {
            System.out.println("Room " + room + " : " + hotelRooms.get(room));
        }
    }
}
