package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	
	public void addContract(HourContract contract) {
		contracts.add(contract); // adicionou na lista o contrato
	}
	
	public void removeContract (HourContract contract) {
		contracts.remove(contract); // remove o contrato da lista
	}
	
	public double income(int year, int month) {
		double sum = baseSalary; // sum pega o valor do salario base
		Calendar cal = Calendar.getInstance();// percorrer os contratos desse funcionario, testando se sao do mes certo
		for (HourContract c : contracts) { // caso co contrato c seja do ano e mes, vai fazer o que ta dentro do if
			cal.setTime(c.getDate()); // aqui vamos setar a data do contrato c, sendo a data do calendario
			int c_year = cal.get(Calendar.YEAR); // extrai a data do contrato "C"
			int c_month =  1 + cal.get(Calendar.MONTH); // extrai a data do contrato "C"
			if(year == c_year && month == c_month) {
				sum+=c.totalValue();
			}
			
		}
		
		return sum;
	}
	
	
	
}
