package PaqueteJuego.src;

// src/GraphicsManager.java
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.List;

public class GraphicsManager {
    private Stage stage;
    private Player player;
    private List<Room> rooms;
    private Game game;
    private Pane layout;
    private ImageView backgroundImageView;
    private Text puzzleText;

    public GraphicsManager(Stage stage, Player player, List<Room> rooms, Game game) {
        this.stage = stage;
        this.player = player;
        this.rooms = rooms;
        this.game = game;
        this.layout = new Pane();
        this.backgroundImageView = new ImageView();
        this.puzzleText = new Text();
    }

    public void startGame() {
        player.setCurrentRoom(rooms.get(0));
        layout.getChildren().add(backgroundImageView);
        layout.getChildren().add(player.getPlayerImage());
        layout.getChildren().add(puzzleText);
        puzzleText.setLayoutY(550); // Posición del texto del puzzle
        puzzleText.setWrappingWidth(800); // Ancho del texto del puzzle
        updateRoomView();
        setupMovement();
    }

    public void updateRoomView() {
        Room currentRoom = player.getCurrentRoom();
        backgroundImageView.setImage(new Image(currentRoom.getImageFile()));
        player.getPlayerImage().setLayoutX(400);
        player.getPlayerImage().setLayoutY(300);
        puzzleText.setText(""); // Limpiar el texto del puzzle

        if (currentRoom.isOutside()) {
            setupEnterHouse();
        }
    }

    private void setupMovement() {
        Scene scene = new Scene(layout, 800, 600);
        scene.setOnKeyPressed(event -> {
            double x = player.getPlayerImage().getLayoutX();
            double y = player.getPlayerImage().getLayoutY();

            if (event.getCode() == KeyCode.UP) {
                player.getPlayerImage().setLayoutY(y - 10);
            } else if (event.getCode() == KeyCode.DOWN) {
                player.getPlayerImage().setLayoutY(y + 10);
            } else if (event.getCode() == KeyCode.LEFT) {
                player.getPlayerImage().setLayoutX(x - 10);
            } else if (event.getCode() == KeyCode.RIGHT) {
                player.getPlayerImage().setLayoutX(x + 10);
            }

            // Check if player reached the door to the next room
            Room currentRoom = player.getCurrentRoom();
            if (!currentRoom.isOutside() && x >= 750) {
                game.nextRoom();
            } else if (currentRoom.isOutside() && x >= 750) {
                game.nextRoom();
            }

            // Check if player reached the puzzle area (example coordinates)
            if (x >= 300 && x <= 500 && y >= 200 && y <= 400 && currentRoom.getPuzzle() != null) {
                showPuzzle(currentRoom.getPuzzle());
            }
        });

        stage.setScene(scene);
        stage.show();
    }

    private void setupEnterHouse() {
        Scene scene = stage.getScene();
        scene.setOnKeyPressed(event -> {
            double x = player.getPlayerImage().getLayoutX();
            double y = player.getPlayerImage().getLayoutY();

            if (event.getCode() == KeyCode.UP) {
                player.getPlayerImage().setLayoutY(y - 10);
            } else if (event.getCode() == KeyCode.DOWN) {
                player.getPlayerImage().setLayoutY(y + 10);
            } else if (event.getCode() == KeyCode.LEFT) {
                player.getPlayerImage().setLayoutX(x - 10);
            } else if (event.getCode() == KeyCode.RIGHT) {
                player.getPlayerImage().setLayoutX(x + 10);
            }

            // Check if player reached the door
            if (x >= 750) {
                game.nextRoom();
            }
        });

        stage.setScene(scene);
        stage.show();
    }

    private void showPuzzle(Puzzle puzzle) {
        puzzleText.setText(puzzle.getQuestion());
        // Aquí puedes agregar un campo de texto para ingresar la respuesta
    }

    public void showEndScreen() {
        Label endMessage = new Label("¡Has completado el juego!");
        layout.getChildren().clear();
        layout.getChildren().add(endMessage);
        endMessage.setLayoutX(350);
        endMessage.setLayoutY(300);
        Scene endScene = new Scene(layout, 800, 600);
        stage.setScene(endScene);
        stage.show();
    }
}
