
import HTLProceduralAPI.*;

public class Sample extends HTLProceduralAPI {

	public void buildGame() {
				
		for (int i = 0; i < 20; i++) {
			addPathLeftRight(i, 5);
		}

	}

	public void updateGame() {


		if (mouseClicked()) {
		
			drawWizard(getClickedX(), getClickedY(), "medic");
		
		}

}
}
