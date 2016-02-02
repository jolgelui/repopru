package prueba;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.BarChartSeries;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.primefaces.model.chart.PieChartModel;

@ManagedBean
@SessionScoped
public class ChartsBean {
	private PieChartModel pcm1;	
	private LineChartModel lcm;
	private LineChartModel lcm2;
	private BarChartModel bcm;

	public PieChartModel getPcm1() {
		pcm1 = new PieChartModel();
		pcm1.set("Valor 1", 5);
		pcm1.set("Valor 2", 20);
		pcm1.set("Valor 3", 13);
		
		pcm1.setTitle("Valores de los valores");
		pcm1.setLegendPosition("se");
		
		return pcm1;
	}

	public void setPcm1(PieChartModel pcm1) {
		this.pcm1 = pcm1;
	}

	public LineChartModel getLcm() {
		LineChartSeries lcs1 = new LineChartSeries();
		lcs1.setLabel("Cosa 1");
		lcs1.set("2013", 5);
		lcs1.set("2014", 3);
		lcs1.set("2015", 3);
		lcs1.set("2016", 1);

		LineChartSeries lcs2 = new LineChartSeries();
		lcs2.setLabel("Cosa 2");
		lcs2.set("2013", 4);
		lcs2.set("2014", 5);
		lcs2.set("2015", 6);
		lcs2.set("2016", 4);

		LineChartSeries lcs3 = new LineChartSeries();
		lcs3.setLabel("Cosa 3");
		lcs3.set("2013", 1);
		lcs3.set("2014", 5);
		lcs3.set("2015", 8);
		lcs3.set("2016", 2);
				
		lcm = new LineChartModel();
		
		lcm.setTitle("Tendencia de las cosas a valorar");
		lcm.setLegendPosition("ne");
		lcm.setShowPointLabels(true);
		
		lcm.getAxes().put(AxisType.X, new CategoryAxis("Años"));
		
		Axis y = lcm.getAxis(AxisType.Y); 
		y.setMax(9);
		y.setMin(0);
		y.setLabel("Label del eje y");
		
		lcm.addSeries(lcs1);
		lcm.addSeries(lcs2);
		lcm.addSeries(lcs3);
		
		return lcm;
	}

	public void setLcm(LineChartModel lcm) {
		this.lcm = lcm;
	}

	public LineChartModel getLcm2() {
		LineChartSeries lcs1 = new LineChartSeries();
		lcs1.setLabel("Cosa 1");
		lcs1.setFill(true);
		lcs1.set("2013", 4);
		lcs1.set("2014", 2);
		lcs1.set("2015", 2);
		lcs1.set("2016", 0);

		LineChartSeries lcs2 = new LineChartSeries();
		lcs2.setLabel("Cosa 2");
		lcs2.setFill(true);
		lcs2.set("2013", 3);
		lcs2.set("2014", 4);
		lcs2.set("2015", 1);
		lcs2.set("2016", 3);

		LineChartSeries lcs3 = new LineChartSeries();
		lcs3.setLabel("Cosa 3");
		lcs3.setFill(true);
		lcs3.set("2013", 1);
		lcs3.set("2014", 2);
		lcs3.set("2015", 3);
		lcs3.set("2016", 2);
				
		lcm2 = new LineChartModel();
		lcm2.setStacked(true);
		
		lcm2.setTitle("Tendencia de las cosas a valorar");
		lcm2.setLegendPosition("ne");
		lcm2.setShowPointLabels(true);
		
		lcm2.getAxes().put(AxisType.X, new CategoryAxis("Años"));
		
		Axis y = lcm2.getAxis(AxisType.Y); 
		y.setMax(10);
		y.setMin(0);
		y.setLabel("Label del eje y");
		
		lcm2.addSeries(lcs1);
		lcm2.addSeries(lcs2);
		lcm2.addSeries(lcs3);
		
		return lcm2;
	}

	public void setLcm2(LineChartModel lcm2) {
		this.lcm2 = lcm2;
	}

	public BarChartModel getBcm() {
		BarChartSeries bcs1 = new BarChartSeries();
		bcs1.setLabel("Uno");
		bcs1.set("2013", 10);
		bcs1.set("2014", 80);
		bcs1.set("2015", 50);

		BarChartSeries bcs2 = new BarChartSeries();
		bcs2.setLabel("Dos");
		bcs2.set("2013", 90);
		bcs2.set("2014", 20);
		bcs2.set("2015", 50);

		BarChartSeries bcs3 = new BarChartSeries();
		bcs3.setLabel("Tres");
		bcs3.set("2013", 30);
		bcs3.set("2014", 60);
		bcs3.set("2015", 75);
		
		bcm = new BarChartModel();
		bcm.setTitle("Gráfico de barras");
		bcm.setLegendPosition("nw");
		
		Axis xAxis = bcm.getAxis(AxisType.X); 
		xAxis.setLabel("Año"); 
		Axis yAxis = bcm.getAxis(AxisType.Y);
		yAxis.setMin(0);
		yAxis.setMax(100); 
		yAxis.setLabel("Lnnng");
				
		bcm.addSeries(bcs1);
		bcm.addSeries(bcs2);
		bcm.addSeries(bcs3);
		
		return bcm;
	}

	public void setBcm(BarChartModel bcm) {
		this.bcm = bcm;
	}
}
