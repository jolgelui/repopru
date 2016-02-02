package prueba;

import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class B {
	private boolean flag;
	private List<List<String>> strings = Arrays.asList(Arrays.asList("Uno", "Dos", "Tres", "1"),
			Arrays.asList("Cuatro", "Cinco", "Seis", "2"),
			Arrays.asList("Siete", "Ocho", "Nueve", "3"),
			Arrays.asList("Diez", "Once", "Doce", "4"),
			Arrays.asList("Trece", "Catorce", "Quince", "5"),
			Arrays.asList("Dieciseis", "Diecisiete", "Dieciocho", "6"),
			Arrays.asList("Diecinueve", "Veinte", "Veintiunooo", "7"));
	
	private List<String> temas = Arrays.asList( "afterdark", "afternoon", "afterwork", "black-tie", 
			"blitzer", "bluesky", "casablanca", "cruze", "cupertino", "dark-hive", "dot-luv", "eggplant", "excite-bike", 
			"flick", "glass-x", "home", "hot-sneaks", "humanity", "le-frog", "midnight", "mint-choc", "overcast", 
			"pepper-grinder", "redmond", "rocket", "sam", "smoothness", "south-street", "start", "sunny", "swanky-purse", 
			"trontastic", "twitter bootstrap", "ui-darkness", "ui-lightness", "vader" );
	
	public List<String> getTemas() {
		return temas;
	}

	private String tableSelection;
	
	public String action(){
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (flag) {
			FacesContext.getCurrentInstance().addMessage("it1", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Coño", "Coñito"));
		}
		flag = !flag;
		
		return null;
	}
	
	public String toPruebas2(){
		return "pruebas2.jsf?faces-redirect=true";
	}
	
	private Integer numero = 50;
	private int autoInc =3;


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public int getAutoInc() {
		autoInc += 1;
		return autoInc;
	}


	public void setAutoInc(int autoInc) {
		this.autoInc = autoInc;
	}

	public List<List<String>> getStrings() {
		return strings;
	}

	public void setStrings(List<List<String>> strings) {
		this.strings = strings;
	}

	public String getTableSelection() {
		return tableSelection;
	}

	public void setTableSelection(String tableSelection) {
		this.tableSelection = tableSelection;
	}
}
