package br.com.dalla.ezdevs.bank.accont;

public class AccontModel {

	private Integer money;
	private Integer id;
	
	AccontModel(Integer id, Integer money){
		setId(id);
		setMoney(money);
	}
	
	private void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getMoney() {
		return money;
	}
	
	public void setMoney(Integer money) {
		this.money = money;
	}
	
	public Integer getId() {
		return id;
	}
}
