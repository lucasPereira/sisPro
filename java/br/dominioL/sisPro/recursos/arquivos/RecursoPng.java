package br.dominioL.sisPro.recursos.arquivos;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.dominioL.sisPro.infraestrutura.dominio.Arquivo;
import br.dominioL.sisPro.infraestrutura.http.TipoDeMidia;
import br.dominioL.sisPro.infraestrutura.http.TiposDeMidia;
import br.dominioL.sisPro.recursos.Recurso;

@Path("/png/{nome: .+}")
public final class RecursoPng extends Recurso {

	@GET
	@Produces(TiposDeMidia.PNG)
	public Response obterJpg(@PathParam("nome") String nome) {
		File arquivo = Arquivo.PNG.fornecerArquivo(nome);
		return new RecursoArquivo().obter(arquivo, TipoDeMidia.PNG);
	}

}