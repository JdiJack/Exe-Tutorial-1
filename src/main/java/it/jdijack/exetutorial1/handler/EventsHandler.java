package it.jdijack.exetutorial1.handler;

import it.jdijack.exetutorial1.util.MyLogger;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventsHandler {
	
	//**************************************[EVENTI LATO SERVER - INIZIO]
	//**************************************[EVENTI LATO SERVER - FINE]

	//**************************************[EVENTI LATO CLIENT - INIZIO]
	//**************************************[EVENTI LATO CLIENT - FINE]

	//**************************************[EVENTI COMUNI - INIZIO]
	@SubscribeEvent
	public void rightClickItemEvent(PlayerInteractEvent.RightClickItem event){
		MyLogger.getLogger().info(event.getEntityPlayer().getName()+" ha cliccato sul blocco alla: x="+event.getPos().getX()+" con "+event.getItemStack().getDisplayName());
	}
	//**************************************[EVENTI COMUNI - FINE]
}
