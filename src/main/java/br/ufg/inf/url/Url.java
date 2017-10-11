package br.ufg.inf.url;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Url {

	public static boolean validarUrl(String url) {
		String regex = "\\b(https?|ftp|file):\\/\\/([-a-zA-Z0-9]*)\\.([-a-zA-Z0-9.]*)\\/?([-a-zA-Z0-9.]*)\\/([-a-zA-Z0-9.]*\\=[-a-zA-Z0-9.]*)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(url);
		
		if(matcher.matches())
			return true;
		else
			return false;
		
	}
}
