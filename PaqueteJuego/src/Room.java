package PaqueteJuego.src;

// src/Room.java
public class Room {
    private String description;
    private String imageFile;
    private Room nextRoom;
    private Puzzle puzzle;
    private boolean isOutside;

    public Room(String description, String imageFile) {
        this.description = description;
        this.imageFile = imageFile;
        this.isOutside = false;
    }

    public Room(String description, String imageFile, boolean isOutside) {
        this.description = description;
        this.imageFile = imageFile;
        this.isOutside = isOutside;
    }

    public String getDescription() {
        return description;
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setNextRoom(Room nextRoom) {
        this.nextRoom = nextRoom;
    }

    public Room getNextRoom() {
        return nextRoom;
    }

    public void setPuzzle(Puzzle puzzle) {
        this.puzzle = puzzle;
    }

    public Puzzle getPuzzle() {
        return puzzle;
    }

    public boolean isOutside() {
        return isOutside;
    }
}


