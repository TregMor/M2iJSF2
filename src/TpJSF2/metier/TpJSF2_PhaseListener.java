package TpJSF2.metier;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class TpJSF2_PhaseListener implements PhaseListener {

	@Override
	public void afterPhase(PhaseEvent event) {
		System.out.println("Sortie de la phase:" + event.getPhaseId());
	}
	
	@Override
	public void beforePhase(PhaseEvent event) {
		System.out.println("Entr�e dans la phase:" + event.getPhaseId());
	}
	
	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}
}
