package ca.nanometrics.gflot.client.options;

public class PieSeriesOptions extends SeriesOptions {

	public PieSeriesOptions setRadius(double radius){
		put("radius", radius);
		return this;
	}
	
	public PieSeriesOptions setInnerRadius(double innerRadius){
		put("innerRadius", innerRadius);
		return this;
	}
	
	public PieSeriesOptions setStartAngle(double startAngle){
		put("startAngle", startAngle);
		return this;
	}
	
	public PieSeriesOptions setTilt(double tilt){
		put("tilt", tilt);
		return this;
	}
	
	public PieSeriesOptions setLabel(PieLabelOptions pieLabelOptions){
		put("label", pieLabelOptions);
		return this;
	}
	
}
