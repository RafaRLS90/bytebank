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
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.depositar(1000);
		
		boolean sucessoTransferencia = 
				contaDaMarcela.transferir(300, contaRafael);
		
		if(sucessoTransferencia) {
			System.out.println("transferencia feita com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		};
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaRafael.saldo);
		
		contaRafael.titular = "rafael lima";
		System.out.println(contaRafael.titular);
	}
	}
	
