package models;

public class Pagamento {
	
	private int tipo_pagamento;
	private String data_pagamento;
	private String currentUser;
	private double pago_total;
	private double troco_total;
	
	
	public int getTipo_pagamento() {
		return tipo_pagamento;
	}
	public void setTipo_pagamento(int tipo_pagamento) {
		this.tipo_pagamento = tipo_pagamento;
	}
	public String getData_pagamento() {
		return data_pagamento;
	}
	public void setData_pagamento(String data_pagamento) {
		this.data_pagamento = data_pagamento;
	}
	public String getCurrentUser() {
		return currentUser;
	}
	public void setCurrentUser(String currentUser) {
		this.currentUser = currentUser;
	}
	public double getPago_total() {
		return pago_total;
	}
	public void setPago_total(double pago_total) {
		this.pago_total = pago_total;
	}
	public double getTroco_total() {
		return troco_total;
	}
	public void setTroco_total(double pago, double preco) {
		
		if(pago > preco){
			this.troco_total = pago - preco;
		}
		
	}

}
