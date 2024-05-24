package PaqueteJuego.src;

// src/Player.java
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Player {
    private String name;
    private Room currentRoom;
    private ImageView playerImage;

    public Player(String name, String imagePath) {
        this.name = name;
        this.playerImage = new ImageView(new Image(imagePath));
        this.playerImage.setFitWidth(40);
        this.playerImage.setFitHeight(40);
        this.playerImage.setLayoutX(200); // Posición inicial X
        this.playerImage.setLayoutY(200); // Posición inicial Y
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void moveToNextRoom() {
        currentRoom = currentRoom.getNextRoom();
    }

    public ImageView getPlayerImage() {
        return playerImage;
    }
}

