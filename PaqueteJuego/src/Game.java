package PaqueteJuego.src;
public class Game {
    private Player player;
    private List<Room> rooms;

    public Game() {
        player = new Player("Jugadorq");
        rooms = new ArrayList<>();
    }

    private void initializeRooms() {
        Room room1 =  new Room("Sala de entrada");
        Room room2 =  new Room("Sala del misterio");
        room1.setNextRoom(room2);
        rooms.add(room1);
        rooms.add(room2);

        room1.setPuzzle(new Riddleüzzle("tengo llaves pero no puedo abrir puerta.¿Que soy?" "piano"));
        room2.setPuzzle(new MatePuzzle("¿Que numero sigue en la secuencia 2, 4, 8, 16?" "32"));

    }

    public void starte() {
        while (true) {
            Room currenRoom = player.getCurrentRoom();
            System.out.println(currenRoom.getDescription());
            currenRoom.getPuzzle().ask();
            String answer = player.getAnswer();
            if (currenRoom.getPuzzle().checkAnswer(answer)) {
                System.out.println("¡Correcto!");
                player.moverToNextRoom();
            } else {
                System.out.println("Incorrecto. Intenta de nuevo");
            }
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
