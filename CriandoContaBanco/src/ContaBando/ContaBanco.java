package ContaBando;

public class ContaBanco {
	// atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	// metodos personalizado
	
	public void estadoAtual() {
		System.out.println("conta:" + this.getNumConta());
		System.out.println("tipo:" + this.getTipo());
		System.out.println("dono" + this.getDono());
		System.out.println("saldo" + this.getSaldo());
		System.err.println("status" + this.getStatus());
	}
	 void abriConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo (50);
		} else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("conta aberta com sucesso");

	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("conta não pode ser fechada( ainda tem dinheiro)");
		} else if (this.getSaldo() <= 0) {
			System.out.println("sua conta sera fechada  , pois n tem saldo suficiente");
		} else {
			this.setStatus(false);
		}
		System.out.println("conta fechada com sucesso");

	}

	public void depositar(float v) {
		if (this.getStatus() == true) {
			// this.saldo = this.saldo+v; direto no atributos
			this.setSaldo(this.getSaldo() + v);
			System.out.println("deposito efetuado com sucesso " + this.dono);

		} else {
			System.out.println("impossivel depositar em uma conta fechada");

		}

	}

	public void sacar(float v) {
		if (this.getStatus()) {
			if(this.getSaldo()>= v) {
				this.setSaldo(this.getSaldo()-v);
				System.out.println("saque realizado na conta de  "+ this.getDono());
			}else {
				System.out.println("saldo insulficiente para efetuar o saque ");
			}
		}else {
			System.out.println("impossivel sacar de uma conta fechada!!!");
		}
	}

	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "cc") {
			v =12;
		}else if (this.getTipo()== "cp") {
			v =20;
		}
		if(this.getStatus()) {
		this.setSaldo(this.getSaldo()-v);
		System.out.println(",emsalidade paga com sucessi por "+ this.dono);
		}else {
			System.out.println("impossivek pagar com uma conta fechada!!");
		}

	}

	// metodos Especiais

	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
