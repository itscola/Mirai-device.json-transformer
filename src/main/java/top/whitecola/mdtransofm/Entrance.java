package top.whitecola.mdtransofm;

import top.whitecola.siesta.SiestaContext;

public class Entrance {
    public static void main(String[] args) {
        SiestaContext.getSiestaContext().runApplication(MDTransfomer.class,args);
    }
}
