package cat.flx.sprite;

/**
 * Created by xaviB on 27/3/17.
 */

public class Crab extends Enemy {
    private static int[][] states = {
            { 20, 20, 20, 16, 17, 20, 20, 20, 18, 19 }
    };
    int[][] getStates() { return states; }

    int x1, x2, dir;

    Crab(Game game) {
        super(game);
        padLeft = padTop = 6;
        colWidth = 20; colHeight = 16;
        dir = 1;
    }

    void physics() {
        x += dir;
        if ((x <= x1) || (x >= x2)) dir = -dir;
    }
}
