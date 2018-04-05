package it.jdijack.exetutorial1.proxy;

import it.jdijack.exetutorial1.handler.EventsHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy{

	public void preinit(FMLPreInitializationEvent e) {		
	}

	public void init(FMLInitializationEvent event) {
	}

	public void postinit(FMLPostInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new EventsHandler()); 
	}
}
