package main;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: arsendeur
 * Date: 15/02/13
 * Time: 23:29
 * To change this template use File | Settings | File Templates.
 */
public class KarateChop {

    public int TrouverIndex(int numeroATrouver, int[] tableauOrdonne) {

        if (tableauOrdonne.length == 0)
            return -1;

        int positionMilieu = 0;
        int position = 0;
        while (tableauOrdonne.length > 0)
        {
            if (tableauOrdonne.length == 1)
                if (tableauOrdonne[0] == numeroATrouver)
                    return position;
                else
                    return -1;

            positionMilieu = tableauOrdonne.length / 2;
            if (tableauOrdonne[positionMilieu] > numeroATrouver)
            {
                tableauOrdonne = Arrays.copyOfRange(tableauOrdonne, 0, positionMilieu);
            }
            else
            {
                tableauOrdonne =   Arrays.copyOfRange(tableauOrdonne, positionMilieu, tableauOrdonne.length);
                position += positionMilieu;
            }

        }
        return position;
    }
}
