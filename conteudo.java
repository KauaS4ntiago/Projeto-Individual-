public class Streaming {
	protected String titulo; // Titulo da serie, filme, documentario e etc...
	protected String genero; // Genero do filme, serie, documentario e etc...
	protected String categoria; // Se é filme, serie, documentario e etc...
	protected int classificacaoIndicada; // maiores de 18, para maiores de 16 e etc...
	protected String idioma; // audio em Portugues, ingles, espanhol e etc...
	protected String legenda; // lengenda em Portugues, ingles, espanhol e etc...

	// Construtores
	public Streaming() {

	}

	public Streaming(String titulo, String genero, int classificacaoIndicada, String idioma, String categoria,
			String legenda) {
		this.titulo = titulo;
		this.genero = genero;
		this.categoria = categoria;
		this.classificacaoIndicada = classificacaoIndicada;
		this.idioma = idioma;
		this.legenda = legenda;
	}

	// getters e setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return this.genero;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setClassificacaoIndicada(int classificacaoIndicada) {
		this.classificacaoIndicada = classificacaoIndicada;
	}

	public int getClassificacaoIndicada() {
		return this.classificacaoIndicada;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getIdioma() {
		return this.idioma;
	}

	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}

	public String getLegenda() {
		return this.legenda;
	}

}
