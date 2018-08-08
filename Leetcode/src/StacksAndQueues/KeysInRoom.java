package StacksAndQueues;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class KeysInRoom {

    HashSet<Integer> enteredRooms = new HashSet<Integer>();

    public boolean canVisitAllRooms(List<ArrayList<Integer>> rooms) {
        enterRoom(0, rooms);
        return enteredRooms.size() == rooms.size();
    }

    public void enterRoom(int roomId, List<ArrayList<Integer>> rooms) {
        enteredRooms.add(roomId);
        List<Integer> keysInRoom = rooms.get(roomId);
        for(int key : keysInRoom) {
            if(!enteredRooms.contains(key)) {
                enterRoom(key, rooms);
            }
        }
    }

    public static void main(String[] args) {
        KeysInRoom keysInRoom = new KeysInRoom();
        List<Integer> room0 = new ArrayList<>();
        List<Integer> room1 = new ArrayList<>();
        List<Integer> room2 = new ArrayList<>();
        List<Integer> room3 = new ArrayList<>();

        List<ArrayList<Integer>> rooms = new ArrayList<ArrayList<Integer>>();

        room0.add(1);
        room1.add(2);
        room2.add(3);

        rooms.add(new ArrayList<>(room0));
        rooms.add(new ArrayList<>(room1));
        rooms.add(new ArrayList<>(room2));
        rooms.add(new ArrayList<>(room3));

        System.out.println(keysInRoom.canVisitAllRooms(rooms));
    }
}
