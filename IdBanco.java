public class IdBanco {

    private String nome;
    private int numeroAgencia;
    private String endereco;
    private String telefone;
    private String gerente;

    // Método getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Método setter para o atributo nome
    public void setNome(String nome) {
        // Verifica se o nome não é vazio e contém apenas letras
        if (nome != null && nome.matches("[A-Za-z\\s]+")) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido. Certifique-se de fornecer um nome válido contendo apenas letras.");
        }
    }

    // Método getter para o atributo numeroAgencia
    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    // Método setter para o atributo numeroAgencia
    public void setNumeroAgencia(int numeroAgencia) {
        // Verifica se o número da agência é positivo
        if (numeroAgencia > 0) {
            this.numeroAgencia = numeroAgencia;
        } else {
            System.out.println("Número da agência inválido. Certifique-se de fornecer um valor positivo.");
        }
    }

    // Método getter para o atributo endereco
    public String getEndereco() {
        return endereco;
    }
 
    // Método setter para o atributo endereco
    public void setEndereco(String endereco) {
        // Verifica se o endereço não é vazio
        if (endereco != null && !endereco.isEmpty()) {
            this.endereco = endereco;
        } else {
            System.out.println("Endereço inválido. Certifique-se de fornecer um endereço válido.");
        }
    }

    // Método getter para o atributo telefone
    public String getTelefone() {
        return telefone;
    }

    // Método setter para o atributo telefone
    public void setTelefone(String telefone) {
        // Verifica se o telefone não é vazio
        if (telefone != null && !telefone.isEmpty()) {
            this.telefone = telefone;
        } else {
            System.out.println("Telefone inválido. Certifique-se de fornecer um número de telefone válido.");
        }
    }

    // Método getter para o atributo gerente
    public String getGerente() {
        return gerente;
    }

    // Método setter para o atributo gerente
    public void setGerente(String gerente) {
        // Verifica se o nome não é vazio e contém apenas letras
        if (gerente != null && gerente.matches("[A-Za-z\\s]+")) {
            this.gerente = gerente;
        } else {
            System.out.println("Nome inválido. Certifique-se de fornecer um nome válido contendo apenas letras.");
        }
    }
}
