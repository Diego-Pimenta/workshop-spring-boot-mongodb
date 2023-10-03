package com.nelioalves.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {

	/* irá decodificar o parâmetro passado via url para que possamos
	utilizá-lo (default: .../titlesearch?text=valorQueSeraDecodificado) */
	public static String decodeParam(String text) {
		try {
			return URLDecoder.decode(text, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
}
