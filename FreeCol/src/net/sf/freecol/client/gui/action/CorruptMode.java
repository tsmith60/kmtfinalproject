package net.sf.freecol.client.gui.action;
import java.awt.event.ActionEvent;

import net.sf.freecol.client.FreeColClient;



public class CorruptMode extends FreeColAction{

	public static final String id = "corruptAction";


    /**
     * Creates this action
     *
     * @param freeColClient The <code>FreeColClient</code> for the game.
     */
    public CorruptMode(FreeColClient freeColClient) {
        super(freeColClient, id);
    }
    

    // Interface ActionListener

    /**
     * {@inheritDoc}
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
}
