import java.util.ArrayList;

public class Corrente {
    private int numero; // Número da conta corrente
    private double saldo = 0; // Saldo atual da conta corrente
    private double limite; // Limite de saldo negativo permitido
    private int senha; // Senha da conta
    private Cliente titular; // Titular da conta corrente
    private Conta conta; // Conta associada à conta corrente
    private ArrayList<Operacao> historicoOperacoes; // Histórico de operações

    // Construtor da classe Corrente
    public Corrente() {
        historicoOperacoes = new ArrayList<>();
    }

    // Método para adicionar operação ao histórico
    public void addOperacao(Operacao operacao) {
        historicoOperacoes.add(operacao);
    }
 
    // Método getter para o histórico de operações
    public ArrayList<Operacao> getHistoricoOperacoes() {
        return historicoOperacoes;
    }

    // Método para obter o extrato das operações
    public ArrayList<Operacao> obterExtrato() {
        return historicoOperacoes;
    }

    // Método getter para o atributo conta
    public Conta getConta() {
        return conta;
    }

    // Método getter para o atributo saldo
    public double getSaldo() {
        return saldo;
    }

    // Método getter para o atributo titular
    public Cliente getTitular() {
        return titular;
    }

    // Método getter para o atributo numero
    public int getNumero() {
        return numero;
    }


    // Método getter para o atributo senha
    public int getSenha() {
        return senha;
    }

    // Método getter para o atributo limite
    public double getLimite() {
        return limite;
    }

    // Método setter para o atributo limite
    public void setLimite(double limite) {
        this.limite = limite;
    }

    // Método para realizar saque na conta corrente
    public boolean sacar(double valor) {
        Operacao operacao = new Operacao();
        if (operacao.sacar(valor)) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    // Método para realizar depósito na conta corrente
    public boolean depositar(double valor) {
        Operacao operacao = new Operacao();
        if (operacao.depositar(valor)) {
            saldo += valor;
            return true;
        }
        return false;
    }

    // Método para realizar transferência entre contas correntes
    public boolean transferir(double valor, Corrente destino) {
        Operacao operacao = new Operacao();
        if (operacao.transferir(valor)) {
            saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}
