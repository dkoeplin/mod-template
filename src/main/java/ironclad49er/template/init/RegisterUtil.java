package ironclad49er.template.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegisterUtil {
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        ModBlocks.registerBlocks(event);
    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        ModBlocks.registerBlockItems(event);
        ModItems.registerItems(event);
    }
}
