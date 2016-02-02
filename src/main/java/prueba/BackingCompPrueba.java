package prueba;

import java.io.IOException;

import javax.faces.component.FacesComponent;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIInput;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;

@FacesComponent("backing1")
public class BackingCompPrueba extends UIInput implements NamingContainer {
	
	@Override
	public void encodeBegin(FacesContext arg0) throws IOException {
		UIOutput ot1 = (UIOutput) findComponent("ot1");
		ot1.setValue("valor defecto");
		
		UIInput txtEntrada = (UIInput) findComponent("txtEntrada");
		txtEntrada.setValue(getAttributes().get("value2"));
		
		super.encodeBegin(arg0);
	}
	
	@Override
	protected Object getConvertedValue(FacesContext arg0, Object arg1) throws ConverterException {
		valor=valor + "";
		return super.getConvertedValue(arg0, arg1);
	}
	
	@Override
	public String getFamily() {
		return("javax.faces.NamingContainer");
	}
	
	@Override
	public Object getSubmittedValue() {
		return this;
	}
	
	private String valor;

	public void setValor(String valor) {
		this.valor = valor;
	}
}
