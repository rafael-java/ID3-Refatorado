package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import objetos.ListasPadrao;
//import objetos.AuxProcesso;
import objetos.NohOuRamo;
import objetos.Request;
import objetos.Response;
import processo.Selecao;
import processo.Processo;

public class Testes {

	public static Processo p = new Processo();

	public void Teste_Entropia() {
		ListasPadrao l = new ListasPadrao();
		l.setClassePadrao();
		l.setListaDadosPadrao();
		l.setPropsPadrao();
		Selecao e = new Selecao(l.getProps(), l.getListaDados());
		e.main();
	}
	
	public void Todos_Testes() {
		System.out.println();
		System.err.println("\t___15 testes___");
		System.out.println();
		System.err.println("\n ->>> 1. Teste Hashmap: ");
		teste_hashmap();
		System.err.println("\n ->>> 7. Teste 1: ");
		teste1();
	}

	public void teste1() {
		System.out.println("Deve receber uma lista com todos os elementos da mesma classe (todos risco alto) e "
				+ "\n retornar nó com valor preenchido com alto, por exemplo");
		System.out.println("Vamos Testar o Induzir Arvore.");
		NohOuRamo a = p.induzirArvore();
		System.out.println(a.getFilhos());
		System.out.println();
	}

	public void teste_hashmap() {
		Map<String, String> teste = new HashMap<String, String>();
		teste.put("Risco", "alto");
		teste.put("História de Crédito", "valor 2");
		teste.put("Nome 3", "valor 3");
		teste.put("Nome 1", "valor 4");
		System.out.println("Tudo:" + teste.toString());
		System.out.println("Todas as keys:" + teste.keySet());
		System.out.println("todos os valores:" + teste.values());
		System.out.println("Tamanho: " + teste.size());
		System.out.println("Valor do Nome 1: " + teste.get("Nome 1"));
	}

	public void teste_predizer() {
		Processo p = new Processo();
		Request req = new Request();

		req.setDivida("baixa");
		req.setGarantia("nenhuma");
		req.setHistoria("desconhecida");
		req.setRenda("0 a 15");

		NohOuRamo nor = new NohOuRamo();
		nor.setNomePropNoh("História de Crédito");
		nor.setId(1);

		NohOuRamo nor2 = new NohOuRamo();
		nor2.setValorPropRamo("ruim");
		nor2.setId(2);

		NohOuRamo nor3 = new NohOuRamo();
		nor3.setValorClasseFolha("baixo");
		nor3.setId(3);

		NohOuRamo nor4 = new NohOuRamo();
		nor4.setValorPropRamo("desconhecida");
		nor4.setId(4);

		NohOuRamo nor5 = new NohOuRamo();
		nor5.setNomePropNoh("Dívida");
		nor5.setId(5);

		NohOuRamo nor6 = new NohOuRamo();
		nor6.setValorPropRamo("baixa");
		nor6.setId(6);

		NohOuRamo nor7 = new NohOuRamo();
		nor7.setValorClasseFolha("moderado");
		nor7.setId(7);

		NohOuRamo nor8 = new NohOuRamo();
		nor8.setValorPropRamo("alta");
		nor8.setId(8);

		NohOuRamo nor9 = new NohOuRamo();
		nor9.setNomePropNoh("Garantia");
		nor9.setId(9);

		NohOuRamo nor10 = new NohOuRamo();
		nor10.setValorPropRamo("nenhuma");
		nor10.setId(10);

		NohOuRamo nor11 = new NohOuRamo();
		nor11.setValorClasseFolha("alto");
		nor11.setId(11);

		NohOuRamo nor12 = new NohOuRamo();
		nor12.setValorPropRamo("alta");
		nor12.setId(12);

		NohOuRamo nor13 = new NohOuRamo();
		nor13.setValorClasseFolha("moderado");
		nor13.setId(13);

		nor.addFilhos(nor2);
		nor.addFilhos(nor4);

		nor2.addFilhos(nor3);

		nor4.addFilhos(nor5);

		nor5.addFilhos(nor8);
		nor5.addFilhos(nor6);

		nor6.addFilhos(nor7);

		nor8.addFilhos(nor9);
		nor9.addFilhos(nor10);
		nor10.addFilhos(nor11);

		nor9.addFilhos(nor12);
		nor12.addFilhos(nor13);

		List<Integer> caminho = new ArrayList<Integer>();
		Response res = new Response();
		p.predizer(nor, req, caminho, res);
		System.out.println(caminho);
		System.out.println(res.getRiscoFinal());
	}

	public void predizer_antigo() {
		// public String decidir(NohOuRamo nor, AuxPredict aux) {
//		if (nor.getValorClasseFolha() != null) {
//			return "Risco " + nor.getValorClasseFolha();
//		} else if (nor.getNomePropNoh() != null) {
//			return nor.getNomePropNoh();
//		} else if (nor.getValorPropRamo() != null) {
//			return nor.getValorPropRamo();
//		} else {
//			return null;
//		}
		// }
		//
		// public String decidir1(NohOuRamo nor, AuxPredict aux, int iteracao) {
//		String retorno = "";
		//
//		iteracao = iteracao++;
		//
//		if (nor.getFilhos().isEmpty()) {
//			retorno = decidir(nor, aux);
//		} else {
//			for (NohOuRamo filho : nor.getFilhos()) {
//				retorno = decidir1(filho, aux, iteracao) + "|" + decidir(nor, aux);
//				System.out.println(retorno);
//			}
//		}
		//
//		return retorno;
		// }

		// public String mB3(NohOuRamo nor, AuxPredict aux) {
//		String valorNoh = decidirValor(nor, aux);
//		String nomeNoh = decidirNoh(nor, aux);
		//
//		if (valorNoh != null && valorNoh.equals(aux.getHistoria())) {
//			if (nor.getFilhos().isEmpty()) {
//				return (nor.getValorClasseFolha());
//			} else {
//				mB1(nor, aux);
//			}
//		} else {
//			mB1(nor, aux);
//		}
//		return "erro3";
		// }
	}

}
