package de.dhbw.tinf22b.clean;

import java.util.List;
import java.util.Optional;

public class Snippet {
	
	protected Optional<JsonAuftragsforderungen> für(final Auftragnummer auftrag) {
	    for (final JsonAuftragsforderungen each : cached()) {
	        if (each.istFür(auftrag)) {
	            return Optional.of(each);
	        }
	    }
	    return Optional.empty();
	}

	private List<JsonAuftragsforderungen> cached() {
		// TODO Auto-generated method stub
		return null;
	}
}

