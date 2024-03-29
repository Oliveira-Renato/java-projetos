package main;

import org.json.JSONObject;
import org.json.JSONException;

public class NovoTeste {
	

	public static void main(String[] args) throws JSONException{
		// TODO Auto-generated method stub
		
		//instancia um novo objeto
		JSONObject carro = new JSONObject();
		
		//preenche o objeto com os campos:modelo, cor, ano
		carro.put("modelo", "Uno");
		carro.put("cor", "Preto");
		carro.put("ano", 1984);
		
		//serializa para uma string e imprime
		String carro_str = carro.toString();
		System.out.println("Objeto ==> " + carro_str);
		System.out.println();
		
		//alterando cor do objeto
		carro.put("cor", "Vermelho");
		carro_str = carro.toString();
		System.out.println("Cor alterada ==> " + carro_str);
		System.out.println();
		
		//recupera campo por campo com o m�todo get() e imprime cada um
		String modelo = carro.getString("modelo");
		String cor = carro.getString("cor");
		Integer ano = carro.getInt("ano");
		
		System.out.println("modelo: " + modelo);
		System.out.println("cor:" + cor);
		System.out.println("ano:" + ano);
		
			

	}

}
