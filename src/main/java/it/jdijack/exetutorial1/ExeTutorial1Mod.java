package it.jdijack.exetutorial1;

import it.jdijack.exetutorial1.proxy.CommonProxy;
import it.jdijack.exetutorial1.util.MyLogger;
import it.jdijack.exetutorial1.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION/*, updateJSON = Reference.UPDATE_JSON, acceptedMinecraftVersions=Reference.ACCEPTED_VERSIONS, guiFactory = Reference.GUI_FACTORY*/)
public class ExeTutorial1Mod {

	@Mod.Instance(Reference.MODID)
	public static ExeTutorial1Mod instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preinit(FMLPreInitializationEvent e){
		proxy.preinit(e);
		MyLogger.getLogger().info("preinit");
	}

	@EventHandler
	public void init(FMLInitializationEvent e){
		proxy.init(e);	
		MyLogger.getLogger().info("init");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {   	
		proxy.postinit(e);
		MyLogger.getLogger().info("postinit");
	}  
/*
	@SubscribeEvent
	public void onConfigChange(ConfigChangedEvent.OnConfigChangedEvent event){
		proxy.onConfigChange(event);   	
	}

	public static CreativeTabs coats_of_arms = new CreativeTabs("coats_of_arms"){
		@Override
		public Item getTabIconItem(){
			return ModItems.item_tela_stendardo_1;
		}
	};*/

}
