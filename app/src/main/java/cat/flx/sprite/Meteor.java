package cat.flx.sprite;

class Meteor extends Enemy {

    private int speed, x1, x2;

    private static int[][] states = {
            { 51, 51, 52, 53, 53, 54, 55, 55 }
    };
    int[][] getStates() { return states; }

    Meteor(Game game) {
        super(game);
        y = -20; //comença a la part superior
        x = (int)(Math.random() * 512); //ordenada y aleatoria
        padLeft = padTop = 0;
        colWidth = 40;
        colHeight = 25;
        this.speed = (int)(Math.random() * 3) + 1; //3 velocitats diferents, aleatòriament
    }

    void physics() {

        vx = speed*2;
        vy = speed;

        x = x - vx;
        y = y + vy;

        Scene scene = game.getScene();

    }
}
