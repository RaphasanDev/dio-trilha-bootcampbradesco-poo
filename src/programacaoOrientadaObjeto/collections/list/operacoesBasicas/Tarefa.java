package programacaoOrientadaObjeto.collections.list.operacoesBasicas;

public class Tarefa {
//atributo
	private String descricao;
	
	public Tarefa(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	} 
	
	public String toString() {
		return descricao;
		//return "Tarefa {" + "\"descrição\"" +": " + '\"' + descricao + "\"}\"";
	}
}
