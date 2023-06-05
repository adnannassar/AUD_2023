package Sort;

public class HeapSort
{
    // Versickere das Element mit Index zuversickern in dem Teilfeld von Index links bis einschlie�lich Index rechts
    public static void versickere(int[] array, final int links, int pos, final int rechts)
    {
        // Im Gegensatz zur Vorlesung ben�tigt diese Methode vier Parameter, da der zu sortierende Bereich
        // nicht bei 0, sondern bei links anf�ngt. Linkes Kind von Knoten i: (i-links)*2+links+1 = 2*i+1-links

        int i = pos;
        final int x = array[i];
        boolean versickernErforderlich = true;
        int kind;

        // Linkes Kind
        while(2*i+1-links <= rechts)
        {
            kind=2*i+1-links;
            // Gibt es auch ein rechts Kind, das einen gr��eren Schl�ssel hat?
            if ((kind < rechts) && (array[kind] < array[kind+1]))
                kind++;
            // Jetzt ist array[kind] in jedem Fall das gr��ere der beiden Kinder

            if (x < array[kind])
            {
                // x versickern lassen, array[kind] steigt nach oben
                array[i] = array[kind];
                i = kind;
            }
            else
            {
                // Endg�ltige Position gefunden
                array[i] = x;
                i = rechts;
                versickernErforderlich = false;
            }
        }
        // x an endg�ltige Position schreiben
        if (versickernErforderlich)
            array[i] = x;

    }

    // Optimierte Version
    public static void versickereOpt(int[] array, final int links, int pos, final int rechts)
    {
        // Im Gegensatz zur Vorlesung ben�tigt diese Methode vier Parameter, da der zu sortierende Bereich
        // nicht bei 0, sondern bei links anf�ngt. Linkes Kind von Knoten i: (i-links)*2+links+1 = 2*i+1-links

        final int x = array[pos];
        int kind;

        // Linkes Kind
        while((kind=2*pos+1-links) <= rechts)
        {
            // Gibt es auch ein rechts Kind, das einen gr��eren Schl�ssel hat?
            if ((kind < rechts) && (array[kind] < array[kind+1]))
                kind++;
            // Jetzt ist array[kind] in jedem Fall das gr��ere der beiden Kinder

            if (x < array[kind])
            {
                // x versickern lassen, array[kind] steigt nach oben
                array[pos] = array[kind];

                pos = kind;
            }
            else
            {
                // Endg�ltige Position gefunden
                break;
            }
        }

        // x an endg�ltige Position schreiben
        array[pos] = x;
    }


    public static void heapsort(int[] array, final int links, final int rechts)
    {
        // 1. Phase: Heap herstellen
        for (int a = (rechts + links - 1) / 2; a >= links; a--)
            versickere(array, links, a, rechts);

        // 2. Phase: erstes und letztes Element vertauschen und versickern lassen
        for (int re = rechts; re > links; )
        {
            int temp = array[re];
            array[re] = array[links];
            array[links] = temp;

            if (--re > links)
                versickere(array, links, links, re);
        }
    }
}