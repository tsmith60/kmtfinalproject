package net.sf.freecol.client.control;

import org.w3c.dom.Element;

import net.sf.freecol.FreeCol;
import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.common.model.Direction;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.Map;
import net.sf.freecol.common.model.Player;
import net.sf.freecol.common.model.Tile;
import net.sf.freecol.common.model.TileType;
import net.sf.freecol.common.model.Unit;
import net.sf.freecol.common.networking.Connection;
import net.sf.freecol.common.networking.DOMMessage;
import net.sf.freecol.server.model.ServerUnit;
import net.sf.freecol.util.test.FreeColTestCase;
import net.sf.freecol.client.ClientTestHelper;
import net.sf.freecol.server.ServerTestHelper;

//Test class created to test out the handle, addObject, animateAttack, and animateMove methods

public class InGameInputHandlerTest extends FreeColTestCase {
	
	InGameInputHandler inIH;
	 private static final TileType plains
     = spec().getTileType("model.tile.plains");
	 
	public void testHandle(){
		
		 Game game = ServerTestHelper.startServerGame(getTestMap(plains));
         Map map = game.getMap();

         FreeColClient client = null;
         try {
             client = ClientTestHelper
                 .startClient(ServerTestHelper.getServer());
             inIH = client.getInGameInputHandler();
             //Connection mc =   client.getConnectController().getConnection(FreeCol.META_SERVER_ADDRESS, FreeCol.META_SERVER_PORT);
             Connection mc = new Connection(FreeCol.META_SERVER_ADDRESS,FreeCol.META_SERVER_PORT, null,FreeCol.CLIENT_THREAD);
             Element element = DOMMessage.createMessage("gameState");
             Element ret = inIH.handle(mc, element);
             System.out.println("Check it "+ret.toString());
             
            assertNotNull(ret);
          
            
             
         }catch(Exception e){
        	 assertFalse(true);
        	 
         } finally {
             if (client != null) ClientTestHelper.stopClient(client);
         }
	
		
	}
	 @Override
	    public void tearDown() throws Exception {
	        ServerTestHelper.stopServerGame();
	        super.tearDown();
	    }
}
