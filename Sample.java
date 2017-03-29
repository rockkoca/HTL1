
import HTLProceduralAPI.*;

public class Sample extends HTLProceduralAPI {

    public void buildGame() {
        drawToolbars();

        for (int i = 0; i < 7; i++) {
            addPathLeftRight(i, 5);
        }

        // can wrap the corner into a function later
        addPathDownLeft(7, 5);
        addPathUpDown(7, 4);
        addPathUpRight(7, 3);
        addPathLeftRight(8, 3);
        addPathUpLeft(9, 3);
        addPathUpDown(9, 4);
        addPathDownRight(9, 5);

        for (int i = 10; i < 20; i++) {
            addPathLeftRight(i, 5);
        }

        // set the start and end path for walkers
        preparePathForWalkers(0, 5, 19, 5);
    }

    public void updateGame() {

        // click screen to add medic wizard
        if (mouseClicked()) {
            int x = getClickedX();
            int y = getClickedY();
            drawWizard(x, y, "medic");
        }

        // press right arrow to add walkers
        if (keyboardIsPressingRight()) {
            addWalker("basic");
        } else if (keyboardIsPressingUp()){
            // press up arrow to add quick walkers
            addWalker("quick");
        }
        // dafsasdf

    }
}
