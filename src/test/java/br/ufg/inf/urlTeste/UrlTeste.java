package br.ufg.inf.urlTeste;
import org.junit.Assert;
import org.junit.Test;
import br.ufg.inf.url.Url;

public class UrlTeste {
	
	@Test
    public void urlValida()
    {
        String url = "http://www.google.com/mail/user=fulano";
        Assert.assertTrue(Url.validarUrl(url));
    }
	
	@Test
    public void urlInvalida()
    {
        String url1 = "http://ww.google.com/mail//user=fulano";
        String url2 = "naovaifuncionar";
        Assert.assertFalse(Url.validarUrl(url1));
        Assert.assertFalse(Url.validarUrl(url2));
    }

}
