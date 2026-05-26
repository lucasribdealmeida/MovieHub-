package br.com.cdl.moviehub.modelos;

public class Anime extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private boolean emLancamento;
    private String estudio;

    // Sobrescrita para a CalculadoraDeTempo somar os minutos corretamente
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    // Sobrescrita para exibir a ficha customizada e corrigir o "Nome do filme"
    @Override
    public void exibeFichaTecnica() {
        System.out.println("Nome do anime: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Estúdio de animação: " + this.estudio);
        System.out.println("Temporadas: " + this.temporadas);
        System.out.println("Episódios por temporada: " + this.episodiosPorTemporada);
        System.out.println("Minutos por episódio: " + this.minutosPorEpisodio);
        System.out.println("Duração total: " + getDuracaoEmMinutos() + " minutos");
    }

    // Métodos Getters e Setters
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean isEmLancamento() {
        return emLancamento;
    }

    public void setEmLancamento(boolean emLancamento) {
        this.emLancamento = emLancamento;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}