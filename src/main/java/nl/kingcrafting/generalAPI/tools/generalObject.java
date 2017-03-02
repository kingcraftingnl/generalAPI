package nl.kingcrafting.generalAPI.tools;

import nl.kingcrafting.generalAPI.ObjectType;

public abstract class generalObject {
		
	protected String name;
	protected ObjectType type;
	protected int id;
	
	
	public generalObject() {
	
		
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setType(ObjectType type) {
		this.type = type;
	}


	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}




	public ObjectType getType() {
		return type;
	}




	public int getId() {
		return id;
	}


	
	
}
