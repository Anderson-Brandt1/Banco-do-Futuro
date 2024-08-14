public class Cliente {
    
    // Declaração dos atributos da classe Cliente
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String titular;
    
    // Método getter para o atributo titular
    public String getTitular() { 
        return titular;   
    }  
 
    // Método setter para o atributo titular
    public void setTitular(String titular) {
        this.titular = titular;
    }
  
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
    
    // Método getter para o atributo cpf
    public String getCpf() {
        return cpf;
    }
    
    // Método setter para o atributo cpf
    public boolean setCpf(String cpf) {
        // Verifica se o CPF é válido
        if (cpf.equals("00000000000") || cpf.length() != 11) {
            System.out.println("CPF inválido. Certifique-se de fornecer um CPF válido com 11 dígitos.");
            return false;
        } else {
            this.cpf = cpf;
            return true;
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
}
