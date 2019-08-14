package com.rroggia.oo.java.part1.solution.week1.exercise23;

import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.SamplingXYLineRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Graph {

	private ChartFrame frame;
	private JFreeChart chart;
	private Plot plot;
	private XYDataset data;
	private XYSeries series;

	public static Graph instance;

	public Graph(String name) {
		series = new XYSeries(name);
		series.add(0, 0);
		data = new XYSeriesCollection(series);
		plot = new XYPlot(data, new NumberAxis("x"), new NumberAxis("y"), new SamplingXYLineRenderer());
		chart = new JFreeChart(plot);
		frame = new ChartFrame(name, chart);
		frame.pack();
		frame.setVisible(true);
	}

	public static Graph getInstance() {
		if (instance == null)
			instance = new Graph("Graph");
		return instance;
	}

	public static void addNumber(double y) {
		getInstance().addNumber_(y);
	}

	private void addNumber_(double y) {
		double x = series.getMaxX() + 1;
		series.add(x, y);
	}

}
