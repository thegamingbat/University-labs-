class Main {
    public static void main(String[] args) {
        //do not touch this code
        Monopoly monopoly = new Monopoly();
        Chess chess = new Chess();
        Battleships battleships = new Battleships();

        monopoly.play();
        chess.play();
        battleships.play();
        monopoly.getName();
    }
}

abstract class Game {
    abstract String getName();
    abstract void play();
    public String name;
}

class Monopoly extends Game {
    String name = "Monopoly";

    //give "Monopoly" name to game
    @Override
    String getName() {
        return name;

    }

    // play method should print "Buy all property."
    @Override
    void play() {
        System.out.println("Buy all property");
    }
}

class Chess extends Game {
    String name = "Chess";

    //give "Chess" name to game
    String getName() {
        return name;

    }

    // play method should print "Kill the enemy king."
    @Override
    void play() {
        System.out.println("Kill the enemy king");
    }
}

class Battleships extends Game {

    //give "Battleships" name to game
    String name = "Battleships";
    String getName() {
        return name;
    }

    // play method should print "Sink all ships."
    void play() {
        System.out.println("Sink all ships");

    }
}