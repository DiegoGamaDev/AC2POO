package Domain;

public abstract class Jogo {

    private int IdJogo;
    private String Nome;
    private double ValorLocacao;
    private String Genero;
    private String AnoLancamento;
    private static boolean disponivel;

    public Jogo() {
    }

    public Jogo(int idJogo, String nome, double valorLocacao, String genero, String anoLancamento) {
        IdJogo = idJogo;
        Nome = nome;
        ValorLocacao = valorLocacao;
        Genero = genero;
        AnoLancamento = anoLancamento;
        this.disponivel = true;
    }

    public int getIdJogo() {
        return IdJogo;
    }

    public void setIdJogo(int idJogo) {
        IdJogo = idJogo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getValorLocacao() {
        return ValorLocacao;
    }

    public abstract double setValorLocacao(double valorLocacao);

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getAnoLancamento() {
        return AnoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        AnoLancamento = anoLancamento;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        Jogo.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "\n========"
                +"\nId: " + getIdJogo()
                +"\nNome: "+ getNome()
                +"\nValor Locação: "+ getValorLocacao()
                +"\nGenero: "+ getGenero()
                +"\nAno Lançamento: "+ getAnoLancamento()
                +"\nDisponivel: "+ isDisponivel();
        
    }
}
