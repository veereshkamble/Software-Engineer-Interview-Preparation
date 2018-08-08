package StacksAndQueues;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class KeysInRoom {

    HashSet<Integer> enteredRooms = new HashSet<Integer>();

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        enterRoom(0, rooms);
        return enteredRooms.size() == rooms.size();
    }

    public void enterRoom(int roomId, List<List<Integer>> rooms) {
        enteredRooms.add(roomId);
        List<Integer> keysInRoom = rooms.get(roomId);
        for(int key : keysInRoom) {
            if(!enteredRooms.contains(key)) {
                enterRoom(key, rooms);
            }
        }
    }

    
}
