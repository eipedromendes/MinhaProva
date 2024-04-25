import java.util.ArrayList;
import javax.swing.JOptionPane;

class Jogador {
    String nome;
    int votos;

    public Jogador(String nome) {
        this.nome = nome;
        this.votos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVotos() {
        return votos;
    }

    public void incrementaVoto() {
        this.votos = getVotos() + 1;
    }
}

public class BBBGUI {

    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = registrarJogadores();
        emitirVotos(jogadores);
        determinarEliminado(jogadores);
    }

    private static ArrayList<Jogador> registrarJogadores() {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Alane Dias"));
        jogadores.add(new Jogador("Beatriz Reis"));
        jogadores.add(new Jogador("Davi Brito"));
        jogadores.add(new Jogador("Deniziane Ferreira"));
        jogadores.add(new Jogador("Fernanda Bande"));
        jogadores.add(new Jogador("Giovanna Lima"));
        jogadores.add(new Jogador("Giovanna Pitel"));
        jogadores.add(new Jogador("Isabelle Nogueira"));
        jogadores.add(new Jogador("Juninho"));
        jogadores.add(new Jogador("Leidy Elin"));
        jogadores.add(new Jogador("Lucas Henrique"));
        jogadores.add(new Jogador("Lucas Luigi"));
        jogadores.add(new Jogador("Lucas Pizane"));
        jogadores.add(new Jogador("Marcus Vinicius"));
        jogadores.add(new Jogador("Matteus Amaral"));
        jogadores.add(new Jogador("Maycon Cosmer"));
        jogadores.add(new Jogador("MC Bin Laden"));
        jogadores.add(new Jogador("Michel Nogueira"));
        jogadores.add(new Jogador("Nizam"));
        jogadores.add(new Jogador("Raquele Cardozo"));
        jogadores.add(new Jogador("Rodriguinho"));
        jogadores.add(new Jogador("Thalyta Alves"));
        jogadores.add(new Jogador("Vanessa Lopes"));
        jogadores.add(new Jogador("Vinícius Rodrigues"));
        jogadores.add(new Jogador("Wanessa Camargo"));
        jogadores.add(new Jogador("Yasmin Brunet"));

        return jogadores;
    }

    private static void emitirVotos(ArrayList<Jogador> jogadores) {
        String voto;
        while (true) {
            voto = JOptionPane.showInputDialog("Em quem você vota para sair do reality show? (Digite 'sair' para encerrar)");
            if (voto.equalsIgnoreCase("sair")) {
                break;
            }

            boolean jogadorEncontrado = false;
            for (Jogador jogador : jogadores) {
                if (jogador.getNome().equalsIgnoreCase(voto)) {
                    jogador.incrementaVoto();
                    JOptionPane.showMessageDialog(null, "Voto registrado para " + jogador.getNome() + "!");
                    jogadorEncontrado = true;
                    break;
                }
            }

            if (!jogadorEncontrado) {
                JOptionPane.showMessageDialog(null, "Participante não encontrado. Por favor, digite o nome corretamente.");
            }
        }
    }

    private static void determinarEliminado(ArrayList<Jogador> jogadores) {
        Jogador eliminado = jogadores.get(0);
        for (Jogador jogador : jogadores) {
            if (jogador.getVotos() > eliminado.getVotos()) {
                eliminado = jogador;
            }
        }
        JOptionPane.showMessageDialog(null, "“Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir \n" +
                "domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, se eu \n" +
                "conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu \n" +
                "vou conseguir te eliminar com alegria. Com " + eliminado.getVotos() + " votos, o participante eliminado é " +eliminado.getNome() + "!");
    }
}