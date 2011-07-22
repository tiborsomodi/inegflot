package ca.nanometrics.gflot.client.options;

import ca.nanometrics.gflot.client.util.JSONObjectWrapper;

public class PieLabelBackgroundOptions extends JSONObjectWrapper {

	public PieLabelBackgroundOptions setColor(String color) {
		put("color", color);
		return this;
	}
	
	public PieLabelBackgroundOptions setOpacity(double opacity) {
		put("opacity", opacity);
		return this;
	}
}
