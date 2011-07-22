package ca.nanometrics.gflot.client.example;

import ca.nanometrics.gflot.client.Axis;
import ca.nanometrics.gflot.client.DataPoint;
import ca.nanometrics.gflot.client.PlotModel;
import ca.nanometrics.gflot.client.SeriesHandler;
import ca.nanometrics.gflot.client.SimplePlot;
import ca.nanometrics.gflot.client.options.AxisOptions;
import ca.nanometrics.gflot.client.options.LegendOptions;
import ca.nanometrics.gflot.client.options.PlotOptions;
import ca.nanometrics.gflot.client.options.TickFormatter;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;

public class MultiAxesExample implements GFlotExample {

	private static final String[] MONTH_NAMES = { "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct",
			"nov", "dec" };
	
	FlowPanel legendPanel = new FlowPanel();
	
	public String getName() {
		return "MultiAxesExample";
	}

	public Widget createExample() {

		PlotModel model = new PlotModel();
		PlotOptions plotOptions = new PlotOptions();
		LegendOptions legendOptions = new LegendOptions();
		plotOptions.setLegendOptions(legendOptions.setContainer(legendPanel.getElement(), "a"));
		

		// add tick formatter to the options
//		plotOptions.setXAxisOptions(new AxisOptions().setTicks(12).setTickFormatter(new TickFormatter() {
//			public String formatTickValue(double tickValue, Axis axis) {
//				return MONTH_NAMES[(int) (tickValue - 1)];
//			}
//		}));
		
		AxisOptions[] yAxes = new AxisOptions[2];
		yAxes[0] = new AxisOptions().setPosition("left").setShow("true");
		yAxes[1] = new AxisOptions().setPosition("right").setShow("true");
		
		plotOptions.setYAxesOptions(yAxes);
		

		// create a series
		SeriesHandler handler = model.addSeries("Ottawa's Month Temperatures (Daily Average in &deg;C)", "blue");

		handler.getSeries().setYaxis(2);
		// add data
		handler.add(new DataPoint(1, -10.5));
		handler.add(new DataPoint(2, -8.6));
		handler.add(new DataPoint(3, -2.4));
		handler.add(new DataPoint(4, 6));
		handler.add(new DataPoint(5, 13.6));
		handler.add(new DataPoint(6, 18.4));
		handler.add(new DataPoint(7, 21));
		handler.add(new DataPoint(8, 19.7));
		handler.add(new DataPoint(9, 14.7));
		handler.add(new DataPoint(10, 8.2));
		handler.add(new DataPoint(11, 1.5));
		handler.add(new DataPoint(12, -6.6));

		// create the plot
		SimplePlot plot = new SimplePlot(model, plotOptions);

		// put it on a panel
		FlowPanel panel = new FlowPanel();
		panel.add(legendPanel);
		panel.add(plot);
		
		return panel;
	}

}