/*
 * Copyright (c) 2017.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package ironclad49er.template;

import ironclad49er.template.common.*;
import ironclad49er.template.common.block.BlockTest;
import ironclad49er.template.common.item.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
        modid   = ModTemplate.MODID,
        name    = ModTemplate.MODNAME,
        version = ModTemplate.VERSION
)
public final class ModTemplate {
    public static final String MODID   = "template";
    public static final String MODNAME = "Mod Template";
    public static final String VERSION = "1.0";
    @Mod.Instance
    public static ModTemplate instance;

    @SidedProxy(clientSide="ironclad49er.template.client.ClientProxy", serverSide="ironclad49er.template.common.ServerProxy")
    public static CommonProxy proxy;

    public static Item testItem = new ItemTest("test_item").setRegistryName("test_item");
    public static Block testBlock = new BlockTest("test_block").setRegistryName("test_block");
    public static ItemBlock testBlockItem = (ItemBlock) new ItemBlock(testBlock).setRegistryName("test_block");

    public static void createItems() {
        GameRegistry.register(testItem);
    }
    public static void createBlocks() {
        GameRegistry.register(testBlock );
        GameRegistry.register(testBlockItem);
    }


    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
