package ironclad49er.template.init;

import ironclad49er.template.ModTemplate;
import ironclad49er.template.common.item.ItemTest;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static Item testItem = new ItemTest("test_item").setRegistryName("test_item");

    public final static Item[] items = {testItem};

    public static void registerItems(final RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.registerAll(items);
    }
}
