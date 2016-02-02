package prueba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AutoCompleteBean {
	
	public List<String> filter(String input){
		List<String> newOpts = new ArrayList<>();
		
		for (String string : optArray) {
			if (string.toLowerCase().contains(input.toLowerCase())) {
				newOpts.add(string);
			}
		}
		
		return newOpts;
	}
	
	private String opt, opt2;
	private List<String> optArray = Arrays.asList("Casa", "Carro", "Pupu", "Coño", "Horita", "Mañana");

	public List<String> getOptArray() {
		return optArray;
	}

	public void setOptArray(List<String> opts) {
		this.optArray = opts;
	}

	public String getOpt() {
		return opt;
	}

	public void setOpt(String opt) {
		this.opt = opt;
	}

	public String getOpt2() {
		return opt2;
	}

	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}

}
