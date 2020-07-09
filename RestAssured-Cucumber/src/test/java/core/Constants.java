package core;

import io.restassured.http.ContentType;

/**
 * Utilizei esta Interface para definir informa�oes e valores
 * que nortear�o o projeto
 *
 */
public interface Constants {

	
	/**
	 * Defino o tipo de formato que utilizarei
	 */
	public static ContentType API_CONTENT_TYPE = ContentType.JSON;
	
	/**
	 * Seto o tempo maximo de espera de cada requisi��o
	 */
	public static Long MAX_TIME_OUT = 5000L;
	
}