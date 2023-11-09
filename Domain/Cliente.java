package Domain;

import java.util.ArrayList;

public class Cliente {

    private int IdCliente;
    private String Nome;
    private String Telefone;
    private ArrayList<Jogo> ListaJogos = new ArrayList<>();

    public Cliente(int idCliente, String nome, String telefone) {
        IdCliente = idCliente;
        Nome = nome;
        Telefone = telefone;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int idCliente) {
        IdCliente = idCliente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public ArrayList<Jogo> getListaJogos() {
        return ListaJogos;
    }

    public void setListaJogos(ArrayList<Jogo> listaJogos) {
        ListaJogos = listaJogos;
    }

    @Override
    public String toString() {
        return "\n =========="
                +"\nNome: "+ getNome()
                +"\nTelefone: "+ getTelefone()
                +"\n Jogos: "+ListaJogos;
    }
}
