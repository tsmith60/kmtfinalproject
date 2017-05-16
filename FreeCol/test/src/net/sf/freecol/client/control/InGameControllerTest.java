package net.sf.freecol.client.control;

import net.sf.freecol.client.ClientTestHelper;
import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.Map;
import net.sf.freecol.common.model.Direction;
import net.sf.freecol.common.model.Player;
import net.sf.freecol.common.model.Tile;
import net.sf.freecol.common.model.TileType;
import net.sf.freecol.common.model.Unit;
import net.sf.freecol.common.model.UnitType;
import net.sf.freecol.server.ServerTestHelper;
import net.sf.freecol.server.model.ServerUnit;
import net.sf.freecol.util.test.FreeColTestCase;

//Additional Class for testing the Ingamecontroller's ability to move in all four directions



public class InGameControllerTest  extends FreeColTestCase {

	InGameController inGC;
	 private static final TileType plains
     = spec().getTileType("model.tile.plains");

 private static final UnitType pioneerType
     = spec().getUnitType("model.unit.hardyPioneer");


	
	
	  public void testeMoveDirection(){
		  
		  
		 
	    	
	    	
	    	 Game game = ServerTestHelper.startServerGame(getTestMap(plains));
	         Map map = game.getMap();

	         FreeColClient client = null;
	         try {
	             client = ClientTestHelper
	                 .startClient(ServerTestHelper.getServer());
	             inGC = client.getInGameController();
	            
	             Player dutch = game.getPlayerByNationId("model.nation.dutch");
	             Tile plain1 = map.getTile(5, 8);
	             plain1.setExplored(dutch, true);
	             Tile plain2 = map.getTile(5, 7);
	             plain2.setExplored(dutch, true);
	     
	             Unit hardyPioneer = new ServerUnit(game, plain1, dutch,
	                                                pioneerType);
	             client.getPreGameController().startGame();
	            assertTrue( inGC.moveDirection(hardyPioneer, Direction.N,true ));
	            
	             
	         } finally {
	             if (client != null) ClientTestHelper.stopClient(client);
	         }
	    }
	  
	  public void testeMoveDirectionSouth(){
		  
		  
			 
	    	
	    	
	    	 Game game = ServerTestHelper.startServerGame(getTestMap(plains));
	         Map map = game.getMap();

	         FreeColClient client = null;
	         try {
	             client = ClientTestHelper
	                 .startClient(ServerTestHelper.getServer());
	             inGC = client.getInGameController();
	            
	             Player dutch = game.getPlayerByNationId("model.nation.dutch");
	             Tile plain1 = map.getTile(5, 8);
	             plain1.setExplored(dutch, true);
	             Tile plain2 = map.getTile(5, 7);
	             plain2.setExplored(dutch, true);
	     
	             Unit hardyPioneer = new ServerUnit(game, plain1, dutch,
	                                                pioneerType);
	             client.getPreGameController().startGame();
	            assertTrue( inGC.moveDirection(hardyPioneer, Direction.S,true ));
	            
	             
	         } finally {
	             if (client != null) ClientTestHelper.stopClient(client);
	         }
	    }
	  
	  public void testeMoveDirectionEast(){
		  
		  
			 
	    	
	    	
	    	 Game game = ServerTestHelper.startServerGame(getTestMap(plains));
	         Map map = game.getMap();

	         FreeColClient client = null;
	         try {
	             client = ClientTestHelper
	                 .startClient(ServerTestHelper.getServer());
	             inGC = client.getInGameController();
	            
	             Player dutch = game.getPlayerByNationId("model.nation.dutch");
	             Tile plain1 = map.getTile(5, 8);
	             plain1.setExplored(dutch, true);
	             Tile plain2 = map.getTile(5, 7);
	             plain2.setExplored(dutch, true);
	     
	             Unit hardyPioneer = new ServerUnit(game, plain1, dutch,
	                                                pioneerType);
	             client.getPreGameController().startGame();
	            assertTrue( inGC.moveDirection(hardyPioneer, Direction.E,true ));
	            
	             
	         } finally {
	             if (client != null) ClientTestHelper.stopClient(client);
	         }
	    }
	  
	  public void testeMoveDirectionWest(){
		  
		  
			 
	    	
	    	
	    	 Game game = ServerTestHelper.startServerGame(getTestMap(plains));
	         Map map = game.getMap();

	         FreeColClient client = null;
	         try {
	             client = ClientTestHelper
	                 .startClient(ServerTestHelper.getServer());
	             inGC = client.getInGameController();
	            
	             Player dutch = game.getPlayerByNationId("model.nation.dutch");
	             Tile plain1 = map.getTile(5, 8);
	             plain1.setExplored(dutch, true);
	             Tile plain2 = map.getTile(5, 7);
	             plain2.setExplored(dutch, true);
	     
	             Unit hardyPioneer = new ServerUnit(game, plain1, dutch,
	                                                pioneerType);
	             client.getPreGameController().startGame();
	            assertTrue( inGC.moveDirection(hardyPioneer, Direction.W,true ));
	            
	             
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
