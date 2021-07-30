package tp1;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.Objects;

public class TrabalhoPratico1 {
	//ArrayLists para armazenar as informaçoes dos clientes e dos produtos

	static ArrayList<String> nomeClientes = new ArrayList<String>();
	
	static ArrayList<String> enderecoClientes = new ArrayList<String>();
	
	static ArrayList<String> telefoneClientes = new ArrayList<String>();
	
	static ArrayList<String> nomeProdutos = new ArrayList<String>();
	
	static ArrayList<String> descricaoProdutos = new ArrayList<String>();
	
	static ArrayList<Float> valorProdutos = new ArrayList<Float>();
	
	static ArrayList<Float> porcentagemLucros = new ArrayList<Float>();
	
	static ArrayList<Integer> qntdEstoques = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		menuClienteProduto();
		
	}
	
	public static void menuClienteProduto() {
		
		char escolha = '0';
		int i=0, g=0, preRegistroProdutoQuantidadeEstoque;
		String preRegistroClienteNome, preRegistroClienteEndereco, preRegistroClienteTelefone,preRegistroProdutoNome,preRegistroProdutoDescricao;
		float preRegistroProdutoValor, preRegistroProdutoLucro;
		
		Scanner ler = new Scanner(System.in);
		
		//preregistro dos 10 clientes e produtos
		for(i = 0; i < 10; i++) {

	            //gera  e armazena pre-registro dos clientes genericos
	            preRegistroClienteNome = "cliente " + (g + 1);
	            
	            preRegistroClienteEndereco = "Endereço do Cliente " + (g + 1);
	            
	            preRegistroClienteTelefone = "Telefone do Cliente " + (g + 1);
	            
	            nomeClientes.add(preRegistroClienteNome);
	            
	            telefoneClientes.add(preRegistroClienteEndereco);
	            
	            enderecoClientes.add(preRegistroClienteTelefone);


	            //gera e armazena pre-registro dos produtos generico
	            preRegistroProdutoNome = "produto " +  (g + 1);
	            
	            preRegistroProdutoDescricao = "Descrição do Produto " + (g + 1);
	            
	            preRegistroProdutoValor = 2 + 5 * i;
	            
	            preRegistroProdutoLucro = 10 + 8 * i;
	            
	            preRegistroProdutoQuantidadeEstoque = 7 + 6 * i;
	           
	            nomeProdutos.add(preRegistroProdutoNome);
	            
	            descricaoProdutos.add(preRegistroProdutoDescricao);
	            
	            valorProdutos.add(preRegistroProdutoValor);
	            
	            porcentagemLucros.add(preRegistroProdutoLucro);
	            
	            qntdEstoques.add(preRegistroProdutoQuantidadeEstoque);

	            g++;
	        
		}
		
		do {
			if(escolha == '0' || escolha == '1' || escolha == '2' || escolha == '3' || escolha == '4' || escolha == '5' || escolha == '6' || escolha == '7' ) {
			
			System.out.println("Escolha o serviço desejado e presseione Enter");
            System.out.println("1 -> Cadastro de novo(s) cliente(s)");
            System.out.println("2 -> Busca por cliente");
            System.out.println("3 -> Cadastro de novo(s) produto(s)");
            System.out.println("4 -> Busca por produto");
            System.out.println("5 -> Cadastro de venda");
            System.out.println("6 -> Mostrar produtos em estoque");
            System.out.println("7 -> Sair");
            
			}
            
            if(escolha != '0' && escolha != '1' && escolha != '2' && escolha != '3' && escolha != '4' && escolha != '5' && escolha != '6' && escolha != '7' ) {
            	
            	System.out.println("1 -> Cadastro de novo(s) cliente(s)");
                System.out.println("2 -> Busca por cliente");
                System.out.println("3 -> Cadastro de novo(s) produto(s)");
                System.out.println("4 -> Busca por produto");
                System.out.println("5 -> Cadastro de venda");
                System.out.println("6 -> Mostrar produtos em estoque");
                System.out.println("7 -> Sair");
            }
            
            escolha = ler.nextLine().charAt(0);
                       
            switch(escolha) {
            
            case '1':
            	
            	cadastroDeClientes();
            	
            	break;
            	
            case '2':
      
            	buscaPorCLiente();
            	
            	break;
            	
            case '3':
            	
            	cadastroDeProdutos();
            	
            	break;
            	
            case '4':
            	
            	buscaPorProduto();
            	
            	break;
            	
            case '5':
            	
            	cadastroDeVenda();
            	
            	break;
            	
            case '6':
            	
            	 mostraEstoqueProdutos();
            	
            	break;
            	
            case '7':
            	System.out.println("Você saiu do programa com sucesso, obrigado por usar!");
            	System.exit(0);
            	break;
            	
            default:
            	System.out.println("Por favor, escolha um dos serviços listados");
            	break;
            }

			
		}while(escolha != '7');
	}

	public static void cadastroDeClientes () {
		
		String nomeCliente, enderecoCliente,telefoneCliente;
		int qntdCliente,i=0;
		
		
		Scanner ler = new Scanner(System.in);
		
		//Pedindo as informaçoes do novo cliente.
		System.out.println("Digite a quantidade de clientes a serem cadastrados:");
		
		qntdCliente = ler.nextInt();
		
		ler.nextLine();//esvaziar o buffer
		
		for(i = 0; i < qntdCliente; i++) {
		
		if(i == 0) {
		System.out.println("Digite o nome do cliente:");
		
		nomeCliente = ler.nextLine();
		
		nomeClientes.add(nomeCliente);
		
		System.out.println("Digite o endereço do cliente:");
		
		enderecoCliente = ler.nextLine();
		
		enderecoClientes.add(enderecoCliente);
		
		System.out.println("Digite o telefone do cliente:");
		
		telefoneCliente = ler.nextLine();
		
		telefoneClientes.add(telefoneCliente);
		}
		
		if(i > 0) {
		System.out.println("Digite o nome do proximo cliente:");
			
		nomeCliente = ler.nextLine();
		
		nomeClientes.add(nomeCliente);
			
		System.out.println("Digite o endereço do proximo cliente:");
			
		enderecoCliente = ler.nextLine();
		
		enderecoClientes.add(enderecoCliente);
		
		System.out.println("Digite o telefone do proximo cliente:");
			
		telefoneCliente = ler.nextLine();
		
		telefoneClientes.add(telefoneCliente);
			
		}
		
		}
		
		
	}
	
	public static void buscaPorCLiente (){
		
		String procuraNome,resposta, nao = "nao", sim = "sim", novoNome,novoEndereco,novoTelefone;
		int i = 0, validaNome = 2,j = 0;
		
		Scanner ler = new Scanner(System.in);
				
		System.out.println("Informe o nome do cliente a ser procurado");
		
		procuraNome = ler.nextLine();
		
		for(i = 0; i < nomeClientes.size();i++) {
			//pegando os dados do cliente de acordo com o nome
			
			if(Objects.equals(procuraNome, nomeClientes.get(i))) {
				
				System.out.println("Os dados do cliente sao:");
				
				System.out.printf("%s\n", enderecoClientes.get(i));
				
				System.out.printf("%s\n", telefoneClientes.get(i));

				validaNome = 1;
				j = i;
				
			}else if(validaNome != 1) {
				//verifica se o nome digitado esta na lista, se nao, printa o esperado
				
				validaNome = 0; 
			}
				
		}
		
		do {
			
			System.out.println("Você deseja alterar os dados do cliente?");
			resposta = ler.nextLine();
			if(Objects.equals(resposta, sim)) {
				//le as informaçoes novas e substitui as antigas
				
				System.out.println("Digite o novo nome do cliente");
				
				novoNome = ler.nextLine();
				nomeClientes.set(j, novoNome);
				
				System.out.println("Digite o novo endereço do cliente");
				
				novoEndereco = ler.nextLine();
				enderecoClientes.set(j, novoEndereco);
				
				System.out.println("Digite o novo telefone do cliente");
				
				novoTelefone = ler.nextLine();
				telefoneClientes.set(j, novoTelefone);
				
				System.out.println("Os novos dados foram carregados");
			
			}else if(Objects.equals(resposta, nao)) {
				
				System.out.println("Os dados nao foram alterados");
				
			}else {
				
				System.out.println("Por favor,escreva 'sim' se voce deseja mudar ou 'nao', se nao desejar");
			}
			
			
		}while(Objects.equals(resposta, nao) == false && Objects.equals(resposta, sim) == false);
		
		if(validaNome == 0) {
			
			System.out.println("Cliente não encontrado!");
			
		}
		
	}
	
	public static void cadastroDeProdutos() {
		
		String nomeProduto, descricaoProduto;
		int qntdProdutos,i=0,qntdEstoque;
		float porcentagemLucro, valorProduto;
		
		Scanner ler = new Scanner(System.in);
		
		//Pedindo e lendo as informaçoes do novo produto.
		System.out.println("Digite a quantidade de produtos a serem cadastrados:");
		
		qntdProdutos = ler.nextInt();
		
		ler.nextLine();//esvaziar o buffer
		
		for(i = 0; i < qntdProdutos; i++) {
		
		if(i == 0) {
		System.out.println("Digite o nome do produto:");
		
		nomeProduto = ler.nextLine();
		nomeProdutos.add(nomeProduto);
		
		System.out.println("Digite a descrição do produto:");
		
		descricaoProduto = ler.nextLine();
		descricaoProdutos.add(descricaoProduto);
		
		System.out.println("Digite o valor de compra do produto:");
		
		valorProduto = ler.nextFloat();
		valorProdutos.add(valorProduto);
		
		System.out.println("Digite a porcentagem de lucro do produto:");
		
		porcentagemLucro = ler.nextFloat();
		porcentagemLucros.add(porcentagemLucro);
		
		System.out.println("Digite a quantidade de estoque desejada para o produto:");
		
		qntdEstoque = ler.nextInt();
		qntdEstoques.add(qntdEstoque);
		
		ler.nextLine();// esvaziar o buffer
		
		}
		
		if(i > 0) {
		System.out.println("Digite o nome do proximo produto:");
			
		nomeProduto = ler.nextLine();
		nomeProdutos.add(nomeProduto);
			
		System.out.println("Digite a descrição do proximo produto:");
			
		descricaoProduto = ler.nextLine();
		descricaoProdutos.add(descricaoProduto);
			
		System.out.println("Digite o valor de compra do proximo produto:");
			
		valorProduto = ler.nextFloat();
		valorProdutos.add(valorProduto);
			
		System.out.println("Digite a porcentagem de lucro do proximo produto:");
			
		porcentagemLucro = ler.nextFloat();
		porcentagemLucros.add(porcentagemLucro);
			
		System.out.println("Digite a quantidade de estoque desejada para o proximo produto:");
			
		qntdEstoque = ler.nextInt();
		qntdEstoques.add(qntdEstoque);
		
		ler.nextLine();// esvaziar o buffer	
		}
		
		}
		
	}
	
	public static void buscaPorProduto(){
		
		String procuraNome,resposta, nao = "nao", sim = "sim", novoNome,novaDescricao;   
		int i = 0, validaNome = 2,j = 0, novoEstoque;
		float novoValor,novaPorcentagemLucro;
		
		Scanner ler = new Scanner(System.in);
				
		System.out.println("Informe o nome do produto a ser procurado");
		
		procuraNome = ler.nextLine();
		
		for(i = 0; i < nomeProdutos.size();i++) {
			//pegando os dados do produto de acordo com o nome
			
			if(Objects.equals(procuraNome, nomeProdutos.get(i))) {
				
				System.out.println("Os dados do produto sao:");
				
				System.out.printf("%s\n", descricaoProdutos.get(i));
				
				System.out.printf("Valor = R$%.1f\n", valorProdutos.get(i));
				
				System.out.printf("Porcentagem de Lucro = %.1f%%\n", porcentagemLucros.get(i));
				
				System.out.printf("Estoque = %d\n", qntdEstoques.get(i));

				validaNome = 1;
				j = i;
				
			}else if(validaNome != 1) {
				//verifica se o nome digitado esta na lista, se nao, printa o esperado
				
				validaNome = 0; 
			}
				
		}
		
		do {
			
			System.out.println("Você deseja alterar os dados do produto?");
			resposta = ler.nextLine();
			if(Objects.equals(resposta, sim)) {
				//le as informaçoes novas e substitui as antigas
				
				System.out.println("Digite o novo nome do produto");
				
				novoNome = ler.nextLine();
				nomeProdutos.set(j, novoNome);
				
				System.out.println("Digite a nova descrição do produto");
				
				novaDescricao = ler.nextLine();
				descricaoProdutos.set(j, novaDescricao);
				
				System.out.println("Digite o novo valor do produto");
				
				novoValor = ler.nextFloat();
				valorProdutos.set(j, novoValor);
				
				System.out.println("Digite a nova porcentagem de lucro do produto");
				
				novaPorcentagemLucro = ler.nextFloat();
				porcentagemLucros.set(j, novaPorcentagemLucro);
				
				System.out.println("Digite a nova quantidade de estoque do produto");
				
				novoEstoque = ler.nextInt();
				qntdEstoques.set(j, novoEstoque);
				
				System.out.println("Os novos dados foram carregados");
			
			}else if(Objects.equals(resposta, nao)) {
				
				System.out.println("Os dados nao foram alterados");
				
			}else {
				
				System.out.println("Por favor,escreva 'sim' se voce deseja mudar ou 'nao', se nao desejar");
			}
			
			
		}while(Objects.equals(resposta, nao) == false && Objects.equals(resposta, sim) == false);
		
		if(validaNome == 0) {
			
			System.out.println("Produto não encontrado!");
			
		}
		
	}
	
	
	public static void cadastroDeVenda() {
		
		int i=0, j=0, g=0, p=0,flag = 0, qntdVendida;
		String nomeSelecionado, produtoSelecionado, sim = "sim", nao = "nao", resposta = "n" ;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Selecione o cliente comprador, mostrado na lista abaixo");
		
		for(i = 0; i < nomeClientes.size(); i++) {
			
			System.out.printf("Cliente: %s\n", nomeClientes.get(i));
		}
		
		nomeSelecionado = ler.nextLine();
		
		for(i = 0; i < nomeClientes.size(); i++) {
			if(Objects.equals(nomeSelecionado, nomeClientes.get(i))) {
				
				g = i;
			}
		}
		
		do {
			if(flag == 0) {
			System.out.println("Voce deseja cadastrar alguma(s) venda(s) para o cliente?");
			
			resposta = ler.nextLine();
			
			if(Objects.equals(resposta, sim)) {
				
				System.out.println("Selecione o produto a ser vendido");
				
				
				for(j = 0; j < nomeProdutos.size(); j++) {
					
					System.out.printf("Produto: %s\n", nomeProdutos.get(j));
					
				}
				
				produtoSelecionado = ler.nextLine();
				
				for(j = 0; j < nomeProdutos.size(); j++) {
					if(Objects.equals(produtoSelecionado, nomeProdutos.get(j))) {
						
						p = j;
					}
				}
				
				System.out.println("Informe a quantidade a ser vendida deste produto");
				
				qntdVendida = ler.nextInt();
				qntdEstoques.set(p, qntdEstoques.get(p) - qntdVendida );
				
				ler.nextLine();//esvaziar buffer
				
				System.out.println("O(s) produto(s) fora(m) vendido(s) corretamente para o cliente desejado");
				
			}else if(Objects.equals(resposta, nao)) {
				
				System.out.println("Nenhuma venda foi cadastrada");
				
			}else {
				
				System.out.println("Por favor,escreva 'sim' se voce deseja cadastrar alguma(s) venda(s) ou 'nao', se nao desejar");
			}
			flag++;
			} else if(flag != 0) {
				System.out.println("Voce deseja cadastrar alguma(s) outra(s) venda(s) para o cliente?");
				
				resposta = ler.nextLine();
				
				if(Objects.equals(resposta, sim)) {
					
					System.out.println("Selecione o produto a ser vendido");
					
					
					for(j = 0; j < nomeProdutos.size(); j++) {
						
						System.out.printf("Produto: %s\n", nomeProdutos.get(j));
						
					}
					
					produtoSelecionado = ler.nextLine();
					
					for(j = 0; j < nomeProdutos.size(); j++) {
						if(Objects.equals(produtoSelecionado, nomeProdutos.get(j))) {
							
							p = j;
						}
					}
					
					System.out.println("Informe a quantidade a ser vendida deste produto");
					
					qntdVendida = ler.nextInt();
					qntdEstoques.set(p, qntdEstoques.get(p) - qntdVendida );
					
					ler.nextLine();//esvaziar buffer
					
					System.out.println("O(s) produto(s) fora(m) vendido(s) corretamente para o cliente desejado");
					
				}else if(Objects.equals(resposta, nao)) {
					
					System.out.println("Nenhuma venda a mais foi cadastrada");
					
				}else {
					
					System.out.println("Por favor,escreva 'sim' se voce deseja mudar ou 'nao', se nao desejar");
				}
				
			}
			
		}while(Objects.equals(resposta, nao) == false ||  Objects.equals(resposta, sim));
		
	}
	
	public static void mostraEstoqueProdutos() {
		
		int i= 0;
		
		for(i=0 ; i < nomeProdutos.size(); i++) {
			
			System.out.printf("Produto: %s\n", nomeProdutos.get(i));
			
			System.out.printf("Quantidade em estoque: %d\n\n", qntdEstoques.get(i));
		}
		
	}
		
	}
	
	
	

