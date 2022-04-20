package objetos;

import java.util.ArrayList;
import java.util.List;

public class Response {

	private List<Integer> idCaminho;
	private NohOuRamo nohFinal;
	private String riscoFinal;
	
	public Response() {
		idCaminho = new ArrayList<Integer>();
	}

	public List<Integer> getIdCaminho() {
		return idCaminho;
	}

	public void setIdCaminho(List<Integer> idCaminho) {
		this.idCaminho = idCaminho;
	}

	public NohOuRamo getNohFinal() {
		return nohFinal;
	}

	public void setNohFinal(NohOuRamo nohFinal) {
		this.nohFinal = nohFinal;
	}

	public String getRiscoFinal() {
		return riscoFinal;
	}

	public void setRiscoFinal(String riscoFinal) {
		this.riscoFinal = riscoFinal;
	}
	
	
	
}
