
final class ImmutableClass {
	
	private String name;
	private int age;
	private Department dep;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Department getDep() throws CloneNotSupportedException {
	      return (Department) dep.clone();
	}
	
	public ImmutableClass(String name, int age, Department dep) {
		super();
		this.name = name;
		this.age = age;
		this.dep = dep;
	}
	

	@Override
	public String toString() {
		return "Immutable class "+this.age+" "+this.name+" "+this.dep.getId()+" "+this.dep.getDepName();
	}

	

}
