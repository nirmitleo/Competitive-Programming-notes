package TopCoder;

import java.util.TreeSet;

public class KnightTour
{
    public String checkTour(String[] cs)
    {
        String cells[] = new String[cs.length + 1];
        for (int i = 0; i < cs.length; i++)
        {
            cells[i] = cs[i];
        }
        cells[cells.length - 1] = cs[0];


        TreeSet<String> was = new TreeSet<String>();
        outer: for (int i = 0; i < cells.length-1; i++)
        {
            for (int r = -2; r <= 2; r++)
            {
                for (int c = -2; c <= 2; c++)
                {
                    if (Math.abs(r * c) == 2)
                    {
                        char nr = (char) (cells[i].charAt(0) + r);
                        int nc = (cells[i].charAt(1) - '0') + c;
                        if (cells[i + 1].equals(nr + "" + nc))
                        {
                            was.add(cells[i]);
                            continue outer;
                        }
                    }
                }
            }
            return "Invalid";
        }
        if (was.size() == 36)
        {
            return "Valid";
        }else
        {
            return "Invalid";
        }
    }
}
