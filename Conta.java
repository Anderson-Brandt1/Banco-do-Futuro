import java.util.regex.*;

public class Conta {
    
    private Status status; // Status da conta (ATIVA, INATIVA, etc.)
    private Cliente cliente; // Cliente associado à conta
    private String login; // Login para acesso à conta
    private String senha; // Senha para acesso à conta
    private IdBanco agencia; // Agência da conta
     
    // Método para abrir uma conta
    public void AbrirConta(Cliente cliente, String login, String senha, IdBanco agencia) {
        this.cliente = cliente;
        this.login = login;
        this.senha = senha; 
        this.agencia = agencia;
        this.status = Status.ATIVA;
 
        // Exibir informações sobre a conta aberta
        System.out.println("Conta aberta para o cliente " + cliente.getNome());
        System.out.println("Login: " + login);
        System.out.println("Senha: " + senha);
        System.out.println("Agência: " + agencia.getNumeroAgencia());
        System.out.println("Status: " + status);
    } 

    // Método getter para o atributo status
    public Status getStatus() {
        return status;
    }

    // Método setter para o atributo status
    public void setStatus(Status status) {
        this.status = status;
    }

    // Método getter para o atributo cliente
    public Cliente getCliente() {
        return cliente;
    } 

    // Método setter para o atributo cliente
    public void setCliente(Cliente cliente) {
        // Verificação para garantir que o cliente não seja nulo
        if (cliente != null) {
            this.cliente = cliente;
        } else {
            System.out.println("Erro: Cliente não pode ser nulo.");
        }
    }

    // Método getter para o atributo login
    public String getLogin() {
        return login ;
    }

    // Método setter para o atributo login
    public boolean setLogin(String login) {
        // Verificação para garantir que o login não seja vazio
        if (login != null && !login.isEmpty()) {
            this.login = login;
        } else { 
            System.out.println("Erro: Login não pode ser vazio.");
            return false;
        }
        
        // Verificar se o nome de usuário tem pelo menos 4 caracteres
        if (login.length() < 4) {
            System.out.println("O nome de usuário deve ter pelo menos 4 caracteres.");
            return false;
        }

        // Se o nome de usuário atender aos critérios, retorna true
        return true;
    }

    // Método getter para o atributo senha
    public String getSenha() {
        return senha;
    }

    // Método setter para o atributo senha
    public boolean setSenha(String senha) {
        // Verificação para garantir que a senha não seja vazia
        if (senha != null && !senha.isEmpty()) {
            this.senha = senha;
        } else { 
            System.out.println("Erro: Senha não pode ser vazia.");
            return false;
        }
        
        // Verificar se a senha tem pelo menos 8 caracteres
        if (senha.length() < 8) {
            System.out.println("A senha deve ter pelo menos 8 caracteres.");
            return false;
        }

        // Verificar se a senha contém pelo menos uma letra maiúscula
        if (!Pattern.compile("[A-Z]").matcher(senha).find()) {
            System.out.println("A senha deve conter pelo menos uma letra maiúscula.");
            return false;
        }

        // Verificar se a senha contém pelo menos uma letra minúscula
        if (!Pattern.compile("[a-z]").matcher(senha).find()) {
            System.out.println("A senha deve conter pelo menos uma letra minúscula.");
            return false;
        }

        // Verificar se a senha contém pelo menos um número
        if (!Pattern.compile("[0-9]").matcher(senha).find()) {
            System.out.println("A senha deve conter pelo menos um número.");
            return false;
        }

        // Verificar se a senha contém pelo menos um caractere especial
        if (!Pattern.compile("[^a-zA-Z0-9]").matcher(senha).find()) {
            System.out.println("A senha deve conter pelo menos um caractere especial.");
            return false;
        }

        // Se a senha atender a todos os critérios, retorna true
        return true;
    }

    // Método getter para o atributo agencia
    public IdBanco getAgencia() {
        return agencia;
    }

    // Método setter para o atributo agencia
    public void setAgencia(IdBanco agencia) {
        // Verificação para garantir que a agência não seja nula
        if (agencia != null) {
            this.agencia = agencia;
        } else {
            System.out.println("Erro: Agência não pode ser nula.");
        }
    }

    // Método para verificar se o login e a senha informados são válidos
    public boolean autenticacao(String login, String senha) {
        if (login.equals(this.login) && senha.equals(this.senha)) {
            System.out.println("\nAcesso Permitido!");
            return true;
        } else {
            System.out.println("\nAcesso Negado!");
            return false;
        }
    }
}

