package Program;

public class Pessoa {
	private String name;
	private int age;
	private Double hight;
		
	
	public Pessoa(String name, int age, Double hight) {
		
		this.name = name;
		this.age = age;
		this.hight = hight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Double getHight() {
		return hight;
	}
	public void setHight(Double hight) {
		this.hight = hight;
	}
	
	
	
}
