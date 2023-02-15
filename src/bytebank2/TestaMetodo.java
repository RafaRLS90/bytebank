package bytebank2;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaRafael = new Conta();
		contaRafael.saldo = 100;
		contaRafael.depositar(50);
		System.out.println(contaRafael.saldo);
		
		boolean conseguiuRetirar = contaRafael.sacar(20);
		System.out.println(contaRafael.saldo);
		System.out.println(conseguiuRetirar);
	}
	}
	
