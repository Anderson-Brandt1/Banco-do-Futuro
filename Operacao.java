import java.util.Calendar;

public class Operacao {

    private Tipo tipo; // Tipo da operação: sacar, depositar, transferir.
    private double valor; // Valor da operação
    private CanalAtendimento origem; // Canal de atendimento da operação
    private Calendar dataHora ; // Data e hora da operação

    // Método para realizar saque
    public boolean sacar(double valor) {
        if (valor > 0) {
            this.tipo = Tipo.SAQUE;
            this.valor = valor;
            this.dataHora = Calendar.getInstance();
            return true;
        }
        return false;
    }
 
    // Método para realizar depósito
    public boolean depositar(double valor) {
        if (valor > 0) {
            this.tipo = Tipo.DEPOSITO;
            this.valor = valor;
            this.dataHora = Calendar.getInstance();
            return true;
        }
        return false;
    }

    // Método para realizar transferência
    public boolean transferir(double valor) {
        if (valor > 0) {
            this.tipo = Tipo.TRANSFERENCIA;
            this.valor = valor;
            this.dataHora = Calendar.getInstance();
            return true;
        }
        return false;
    }

    // Método getter para o atributo tipo
    public Tipo getTipo() {
        return tipo;
    }

    // Método setter para o atributo tipo
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    // Método getter para o atributo valor
    public double getValor() {
        return valor;
    }

    // Método setter para o atributo valor
    public void setValor(double valor) {
        this.valor = valor;
    }

    // Método getter para o atributo origem
    public CanalAtendimento getOrigem() {
        return origem;
    }

    // Método setter para o atributo origem
    public void setOrigem(CanalAtendimento origem) {
        this.origem = origem; 
    }

    // Método getter para o atributo dataHora
    public Calendar getDataHora() {
        return dataHora;
    }

    // Método setter para o atributo dataHora
    public void setDataHora(Calendar dataHora) {
        this.dataHora = dataHora;
    }
}

