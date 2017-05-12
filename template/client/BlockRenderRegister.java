package ironclad49er.template.client;

import ironclad49er.template.ModTemplate;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister {

    private static void reg(Block block) {
        String modid = ModTemplate.MODID;
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void registerBlockRenderer() {
        reg(ModTemplate.testBlock);
    }
}
