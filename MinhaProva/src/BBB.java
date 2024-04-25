//Questão 1) (Primeira prova de LP: Pedro Henrique da Silva Mendes - 12121346)

import java.util.ArrayList;
import java.util.Scanner;

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

    public void incrementaUmVoto() {
        this.votos = getVotos() + 1;
    }
}

public class BBB {
    public static void main(String[] args) {
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

        Scanner scanner = new Scanner(System.in);
        String votoNo;
        do {
            System.out.println("Em quem você vota para sair da casa? (Digite 'sair' para encerrar)");
            votoNo = scanner.nextLine();
            if (!votoNo.equalsIgnoreCase("sair")) {
                boolean encontrado = false;
                for (Jogador j1 : jogadores) {
                    if (j1.getNome().equalsIgnoreCase(votoNo)) {
                        j1.incrementaUmVoto();
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Participante não encontrado.");
                }
            }
        } while (!votoNo.equalsIgnoreCase("sair"));

        Jogador eliminado = null;
        int maisVotos = -1;
        for (Jogador j1 : jogadores) {
            if (j1.getVotos() > maisVotos) {
                eliminado = j1;
                maisVotos = j1.getVotos();
            }
        }

        if (eliminado != null && maisVotos > 0) {
            System.out.println("“Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir \n" +
                    "domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, se eu \n" +
                    "conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu \n" +
                    "vou conseguir te eliminar com alegria. Com " + eliminado.getVotos() + " votos, é você quem sai " + eliminado.getNome());
        }
    }
}