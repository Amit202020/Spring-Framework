package com;
import org.springframework.beans.factory.annotation.Autowired;
public class Bus {
	
	public Bus() {	
	}
	
	@Autowired
 	private Engine engine;
	
	private String busName;
	private String busBrand;
	
	public Bus(Engine engine) {
		this.engine = engine;
		System.out.println("parameterized const inside bus");
	}
	
//	public Engine getEngine() {
//		return engine;
//	}

	public void setEngine(Engine engine) {
		this.engine = engine;
		System.out.println("setter inside engine");
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
		System.out.println("setter inside busname");
	}

//	public String getBusBrand() {
//		return busBrand;
//	}
//
//	public void setBusBrand(String busBrand) {
//		this.busBrand = busBrand;
//	}

	public void show(){
		System.out.println("bus name:"+busName);
		System.out.println("bus brand:"+busBrand);
		System.out.println("Engine Model No:"+engine.getModelNo());
	}	
}
