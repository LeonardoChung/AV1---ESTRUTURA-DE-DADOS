public class Cliente {
    private String identificacao;
    private String nome;
    private String motivo;

    public Cliente(String identificacao, String nome, String motivo) {
        this.identificacao = identificacao;
        this.nome = nome;
        this.motivo = motivo;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
