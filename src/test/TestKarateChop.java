import main.KarateChop;
import org.junit.Before;
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
    private KarateChop unKarateChop;

    @Before
    public void initialiserLesObjects()
    {
        unKarateChop = new KarateChop();
    }

    @Test
    public void retourneNombreNegatifSiLeTableauEstVide()
    {
        assertEquals(-1, unKarateChop.TrouverIndex(1, new int[]{}));
    }

    @Test
    public void retourneNombreNegatifSiLeNombreRechercheNEstPasDansLeTableau()
    {
        assertEquals(-1, unKarateChop.TrouverIndex(3, new int[]{1, 2, 4, 5}));
    }

    @Test
    public void peutRetournerLeBonIndex()
    {
        assertEquals(2, unKarateChop.TrouverIndex(4, new int[]{1, 2, 4, 5, 7, 9}));
        assertEquals(5, unKarateChop.TrouverIndex(9, new int[]{1, 2, 4, 5, 7, 9}));
        assertEquals(3, unKarateChop.TrouverIndex(5, new int[]{1, 2, 3, 5, 7, 9, 10}));
        assertEquals(1, unKarateChop.TrouverIndex(2, new int[]{1, 2, 4, 5, 7, 9, 10, 19}));
        assertEquals(0, unKarateChop.TrouverIndex(1, new int[]{1, 2, 4, 5, 7, 9, 10, 19}));
    }
}
