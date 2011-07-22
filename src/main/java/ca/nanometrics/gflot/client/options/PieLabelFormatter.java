package ca.nanometrics.gflot.client.options;

import ca.nanometrics.gflot.client.Series;

public interface PieLabelFormatter {

	public String formatValue(String label, Series slice);
}
