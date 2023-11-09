package Domain;

public class JogoSwitch extends Jogo{
    @Override
    public double setValorLocacao(double valorLocacao) {
        return valorLocacao * 0.2;
    }

    public JogoSwitch() {
    }

    public JogoSwitch(int idJogo, String nome, double valorLocacao, String genero, String anoLancamento) {
        super(idJogo, nome, valorLocacao, genero, anoLancamento);
    }
}
