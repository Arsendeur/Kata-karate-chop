import main.KarateChop;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: arsendeur
 * Date: 15/02/13
 * Time: 23:28
 * To change this template use File | Settings | File Templates.
 */
public class TestKarateChop {

    @Test
    public void retourneNombreNegatifSiLeTableauEstVide()
    {
        KarateChop unKarateChop = new KarateChop();
        assertEquals(-1, unKarateChop.TrouverIndex(1, new int[]{}));
    }

    @Test
    public void retourneNombreNegatifSiLeNombreRechercheNEstPasDansLeTableau()
    {
        KarateChop unKarateChop = new KarateChop();
        assertEquals(-1, unKarateChop.TrouverIndex(3, new int[]{1, 2, 4, 5}));
    }

    @Test
    public void peutRetournerLIndex2()
    {
        KarateChop unKarateChop = new KarateChop();
        assertEquals(-1, unKarateChop.TrouverIndex(4, new int[]{1, 2, 4, 5, 7, 9}));
    }
}
