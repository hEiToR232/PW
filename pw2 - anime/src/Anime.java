public class Anime {
    private String nome;
    private int classificacaoIndicativa;
    private String genero;
    private String autor;
    private int qtdEpisodios;
    private int numeroTemporadas;
    private String mensagem;

    public int mediaEpisodiosPorTemporada(int qtdEpisodios, int numeroTemporadas) {
        this.qtdEpisodios = qtdEpisodios;
        this.numeroTemporadas = numeroTemporadas;
        return qtdEpisodios / numeroTemporadas;
    }

    public String exibirClassificacao(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
        if (classificacaoIndicativa == 0) {
            return "LIVRE PARA TODAS OS PÚBLICOS";
        } else if (classificacaoIndicativa == 10) {
            return "NÃO RECOMENDADO PARA MENORES DE 10 ANOS";
        } else if (classificacaoIndicativa == 12) {
            return "NÃO RECOMENDADO PARA MENORES DE 12 ANOS";
        } else if (classificacaoIndicativa == 14) {
            return "NÃO RECOMENDADO PARA MENORES DE 14 ANOS";
        } else if (classificacaoIndicativa == 16) {
            return "NÃO RECOMENDADO PARA MENORES DE 16 ANOS";
        } else if (classificacaoIndicativa == 18) {
            return "NÃO RECOMENDADO PARA MENORES DE 18 ANOS";
        }
    }
}