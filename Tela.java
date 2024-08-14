import java.util.ArrayList;
import java.util.Scanner;

public class Tela {
   
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        // criando o cliente 
        
        Cliente cliente = new Cliente();
        	System.out.println("TESTE CRIAÇÃO DO CLIENTE");
        
        System.out.println("Informe seu nome: ");
        cliente.setNome(teclado.nextLine()); 

        System.out.println("Informe seu CPF: ");
        cliente.setCpf(teclado.nextLine());

        System.out.println("Insira seu telefone: ");
        cliente.setTelefone(teclado.nextLine()); 
        
        System.out.println("Insira seu Endereço: ");
        cliente.setEndereco(teclado.nextLine());  
        
        System.out.println("Nome do titular: ");
        cliente.setTitular(teclado.nextLine()); 

        System.out.println("Cadastro realizado!\n");
        
        // Teste do cadastro do banco
         
        IdBanco agencia = new IdBanco();
        System.out.println("TESTE CRIAÇÃO DO BANCO");
        
        System.out.println("Nome da agência: ");
        agencia.setNome(teclado.nextLine());

        System.out.println("Número da agência: ");
        agencia.setNumeroAgencia(Integer.parseInt(teclado.nextLine()));

        System.out.println("Endereço da agência: ");
        agencia.setEndereco(teclado.nextLine());

        System.out.println("Telefone da agência: ");
        agencia.setTelefone(teclado.nextLine());

        System.out.println("Nome do gerente: ");
        agencia.setGerente(teclado.nextLine());

        System.out.println("Agência cadastrada!\n");

        //  Teste de validação do login e senha
        
        Conta conta1 = new Conta();
        System.out.println("TESTE CRIAÇÃO DO LOGIN E SENHA");
       
        System.out.println("Informe o login: ");
        String login = teclado.nextLine();
        conta1.setLogin(login);
       
        System.out.println("A senha precisa conter mais de 8 caracteres"+"\n Deve possuir pelo menos uma letra maiuscula");
        System.out.println("Deve possuir pelo menos uma letra minuscula"+"Deve possuir pelo menos um caracter especial");
        System.out.println("Informe a senha: ");
        String senha = teclado.nextLine();
        conta1.setSenha(senha); 
        
        conta1.AbrirConta(cliente, login, senha, agencia);  
      
        // Teste de validação da conta corrente
        
        Corrente pessoa1 = new Corrente();
        float valor;
        System.out.println("TESTE OPERAÇÃO DE CONTA CORRENTE");
        System.out.println("Para iniciar operações em conta corrente insira suas credenciais:");
        

        System.out.println("Informe o login: ");
        String loginverificacao = teclado.nextLine();

        System.out.println("Informe a senha: ");
        String senhaverificacao = teclado.nextLine();
      
        if (conta1.autenticacao(loginverificacao, senhaverificacao)) {
            System.out.println("Autenticação bem-sucedida!");
           
            Operacao operacao = new Operacao();
            pessoa1.addOperacao(operacao);

            System.out.println("Quanto deseja depositar em sua conta?");
    		pessoa1.depositar(valor  = teclado.nextFloat());
            System.out.println("Saldo é : " + pessoa1.getSaldo());
            
            System.out.println("Quanto deseja sacar?");
            pessoa1.sacar(valor = teclado.nextFloat());
            System.out.println("Voce sacou: " + valor + "\nSeu novo saldo é :" + pessoa1.getSaldo());
            
            Corrente pessoa2 = new Corrente();
            System.out.println("Quanto deseja transferir?");
            pessoa1.transferir(valor = teclado.nextFloat() , pessoa2);
            System.out.println("Seu novo saldo é " +  pessoa1.getSaldo() + "o novo saldo ");
             
            ArrayList<Operacao> historico = pessoa1.getHistoricoOperacoes();
            System.out.println("Histórico de Operações:");
            System.out.println(pessoa1.getHistoricoOperacoes());
            
             
        } else 
            System.out.println("Credenciais inválidas. Operação encerrada.");

         
}
}
