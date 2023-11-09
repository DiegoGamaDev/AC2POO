package Domain;

public class JogoPlayStation extends Jogo{


    @Override
    public double setValorLocacao(double valorLocacao) {
        return valorLocacao * 0.3;
    }

    public JogoPlayStation() {
    }

    public JogoPlayStation(int idJogo, String nome, double valorLocacao, String genero, String anoLancamento) {
        super(idJogo, nome, valorLocacao, genero, anoLancamento);
    }
}
