package ca.nanometrics.gflot.client.example;

import ca.nanometrics.gflot.client.DataPoint;
import ca.nanometrics.gflot.client.PlotModel;
import ca.nanometrics.gflot.client.SeriesHandler;
import ca.nanometrics.gflot.client.SimplePlot;
import ca.nanometrics.gflot.client.options.PieSeriesOptions;
import ca.nanometrics.gflot.client.options.PlotOptions;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;

public class PieExample implements GFlotExample {

	public String getName(){
		return "Pie Chart";
	}

	public Widget createExample(){
		PlotModel model = new PlotModel();
	
		SeriesHandler series = model.addSeries("Elephant");
		series.add(new DataPoint(1.0, 30.0));
		SeriesHandler series2 = model.addSeries("Lion");
		series2.add(new DataPoint(1.0, 70.0));
		
		PlotOptions plotOptions = new PlotOptions();
		PieSeriesOptions pieOptions = new PieSeriesOptions();
		pieOptions.setShow(true);
		plotOptions.setDefaultPieOptions(pieOptions);
		
		// create the plot
		SimplePlot plot = new SimplePlot(model, plotOptions);

		// put it on a panel
		FlowPanel panel = new FlowPanel();
		panel.add(plot);
		return panel;
	}
	
}
