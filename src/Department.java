
public class Department implements Cloneable{
    private int id;
    private String depName;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepName() {
		return depName;
	}
	public Department(int id, String depName) {
		super();
		this.id = id;
		this.depName = depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Override
	public String toString() {
		return "Inner Immutable class "+this.id+" "+this.depName+" ";
	}
	
	public Object clone() throws CloneNotSupportedException {
	      return super.clone();
	   }


}
