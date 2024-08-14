import java.util.ArrayList;


public class Poupanca {
    private int numero; // Número da conta poupança
    private double saldo; // Saldo atual da conta poupança
    private Cliente titular; // Titular da conta poupança
    private double taxaRendimento; // Taxa de rendimento da poupança
    private ArrayList<Operacao> historicoOperacoes; // Histórico de operações

    public Poupanca() {
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
    
    // Método getter para o atributo numero
    public int getNumero() {
        return numero;
    }
 
    // Método setter para o atributo numero
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Método getter para o atributo saldo
    public double getSaldo() {
        return saldo;
    }

    // Método getter para o atributo titular
    public Cliente getTitular() {
        return titular;
    }

    // Método setter para o atributo titular
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    // Método getter para o atributo taxaRendimento
    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    // Método setter para o atributo taxaRendimento
    public void setTaxaRendimento(double taxaRendimento) {
    	taxaRendimento = 0.30;
        this.taxaRendimento = taxaRendimento;
    }

    // Método para realizar depósito na conta poupança
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso na conta poupança. Novo saldo: " + saldo);
    }

    // Método para calcular e adicionar o rendimento mensal à conta poupança
    public void calcularRendimentoMensal() {
        double rendimento = saldo * taxaRendimento;
        saldo += rendimento;
        System.out.println("Rendimento mensal de " + rendimento + " adicionado à conta poupança. Novo saldo: " + saldo);
    }

    // Método para realizar saque na conta poupança
    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso na conta poupança. Novo saldo: " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente na conta poupança.");
            return false;
        }
    }
}
