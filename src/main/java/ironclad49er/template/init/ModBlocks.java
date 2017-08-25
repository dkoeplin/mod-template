package ironclad49er.template.init;

import ironclad49er.template.ModTemplate;
import ironclad49er.template.common.block.BlockTest;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static Block testBlock = new BlockTest("test_block").setRegistryName("test_block");

    public static ItemBlock testBlockItem = (ItemBlock) new ItemBlock(testBlock).setRegistryName("test_block");

    public final static Item[] itemBlocks = {testBlockItem};
    public final static Block[] blocks = {testBlock};

    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.registerAll(blocks);
    }

    public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.registerAll(itemBlocks);
    }
}
