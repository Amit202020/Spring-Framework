package pp;

public class Engine {
	
	private String  modelNo;

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	@Override
	public String toString() {
		return "Engine [modelNo=" + modelNo + "]";
	}
	
}
