import java.util.Scanner;

import br.com.cdl.moviehub.calculos.CalculadoraDeTempo;
import br.com.cdl.moviehub.modelos.Anime; // Importando o Anime conforme criado
import br.com.cdl.moviehub.modelos.Filme;
import br.com.cdl.moviehub.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Informação dos filmes
        Filme filme1 = new Filme();
        System.out.println("Digite o nome do filme:");
        filme1.setNome(scanner.nextLine());
        System.out.println("Digite o nome do diretor do filme:");
        filme1.setDiretor(scanner.nextLine());
        System.out.println("Digite o ano de lançamento do filme:");
        filme1.setAnoDeLancamento(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a duração do filme em minutos:");
        filme1.setTotalEmMinutos(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a quantidade de avaliações:");
        int qtd = Integer.parseInt(scanner.nextLine().trim());
        for (int i=0;i<qtd;i++){
            System.out.println("Digite a nota da avaliação " + (i+1) + ":");
            filme1.avalia(Double.parseDouble(scanner.nextLine().trim()));
        }
        // Informação das séries
        Serie serie1 = new Serie();
        System.out.println("Digite o nome da série:");
        serie1.setNome(scanner.nextLine());
        System.out.println("Digite o ano de lançamento da série:");
        serie1.setAnoDeLancamento(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a quantidade de temporadas da série:");
        serie1.setTemporadas(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a quantidade de episódios por temporada:");
        serie1.setEpisodiosPorTemporada(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a duração de cada episódio em minutos:");
        serie1.setMinutosPorEpisodio(Integer.parseInt(scanner.nextLine().trim()));
        
        // --- BLOCO DO ANIME ADICIONADO SEM ALTERAR O ANTERIOR ---
        Anime anime1 = new Anime();
        System.out.println("Digite o nome do anime:");
        anime1.setNome(scanner.nextLine());
        System.out.println("Digite o ano de lançamento do anime:");
        anime1.setAnoDeLancamento(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite o estúdio de animação:");
        anime1.setEstudio(scanner.nextLine());
        System.out.println("Digite a quantidade de temporadas do anime:");
        anime1.setTemporadas(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a quantidade de episódios por temporada:");
        anime1.setEpisodiosPorTemporada(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a duração de cada episódio em minutos:");
        anime1.setMinutosPorEpisodio(Integer.parseInt(scanner.nextLine().trim()));

        // O scanner só fecha depois que todas as entradas (inclusive Anime) terminam
        scanner.close();
        
        // --- EXIBIÇÃO DAS FICHAS TÉCNICAS SEPARADAS ---
        System.out.println("\n=== FICHAS TÉCNICAS ===");
        
        System.out.println("--- FILME ---");
        filme1.exibeFichaTecnica();
        System.out.println(); 

        System.out.println("--- SÉRIE ---");
        // Customização para contornar o "Nome do filme" sem modificar o arquivo Serie.java!
        System.out.println("Nome da série: " + serie1.getNome());
        System.out.println("Ano de lançamento: " + serie1.getAnoDeLancamento());
        System.out.println("Duração em minutos: " + serie1.getDuracaoEmMinutos());
        System.out.println(); 

        System.out.println("--- ANIME ---");
        anime1.exibeFichaTecnica(); // Chama a ficha linda do Anime
        System.out.println(); 
        
        System.out.println("=== AVALIAÇÕES ===");
        System.out.println("Soma das avaliações: " + filme1.getSomaDasAvaliacoes());
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + filme1.pegaMedia());

        // Calculadora de tempo atualizada
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(serie1);
        calculadora.inclui(anime1); // Incluindo o anime na maratona!
        System.out.println("\nTempo total da maratona: " + calculadora.getTempoTotal() + " minutos.");
    }
}