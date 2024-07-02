public class ConstrutorPreenchidoAtividade {
    public static void main(String[] args) {

        Flamengo f = new Flamengo("Rio de Janeiro",  1895, 8);

        System.out.println("Localizacao: " + f.Localizacao);
        System.out.println("Datafund: " + f.Datafund);
        System.out.println("Titulosbrasileiros: " + f.Titulosbrasileiros);

        Estudante e = new Estudante("Marcus", 17, 3);

        System.out.println("Nome: " + e.Nome);
        System.out.println("Idade: " + e.Idade);
        System.out.println("Serie: " + e.Serie);

        Jogador j = new Jogador("Gabigol", "Atacante", 27);

        System.out.println("Nome" + j.Nome);
        System.out.println("Posicao" + j.Posicao);
        System.out.println("Idade" + j.Idade);

    
    }
    
}
