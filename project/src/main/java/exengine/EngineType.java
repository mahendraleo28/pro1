package exengine;

import firstSpringEx.interfaces.Engine;

public class EngineType implements Engine{
	String type;
	public EngineType() {
		type = "unknown";
	}
	
	public EngineType(String type) {
		this.type = type;
	}

	public String type() {
		// TODO Auto-generated method stub
		return type;
	}

}
