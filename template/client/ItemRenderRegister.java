package ironclad49er.template.client;

import ironclad49er.template.ModTemplate;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {

    private static void reg(Item item) {
        String modid = ModTemplate.MODID;
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
            .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void registerItemRenderers() {
        reg(ModTemplate.testItem);
    }
}
