package ca.nanometrics.gflot.client.options;

import com.google.gwt.core.client.JavaScriptObject;

import ca.nanometrics.gflot.client.util.JSONObjectWrapper;

public class PieLabelOptions extends JSONObjectWrapper {
	
//	private PieLabelFormatter m_formatter;

	public PieLabelOptions setShow(boolean show) {
		put("show", show);
		return this;
	}
	
	public PieLabelOptions setRadius(double radius) {
		put("radius", radius);
		return this;
	}
	
	public PieLabelOptions setBackground(PieLabelBackgroundOptions pieLabelBackgroundOptions) {
		put("background", pieLabelBackgroundOptions);
		return this;
	}
	
	public PieLabelOptions setThreshold(double threshold) {
		put("threshold", threshold);
		return this;
	}
	
	public PieLabelOptions setFormatter(PieLabelFormatter formatter) {
		setFormatterNative(getWrappedObj().getJavaScriptObject(),
				formatter);
		return this;
	}
	
	static native void setFormatterNative(JavaScriptObject pieLabelOptions,
			PieLabelFormatter formatter)/*-{
	    pieLabelOptions.formatter = function(val, slice)
	    {
	      var jsonSeriesObject = @com.google.gwt.json.client.JSONObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(slice);
	      var javaSeriesObject = @ca.nanometrics.gflot.client.Series::new(Lcom/google/gwt/json/client/JSONObject;)(jsonSeriesObject);
	      return formatter.@ca.nanometrics.gflot.client.options.PieLabelFormatter::formatValue(Ljava/lang/String;Lca/nanometrics/gflot/client/Series;)(val, javaSeriesObject);
	    };
	  }-*/;
	
}
