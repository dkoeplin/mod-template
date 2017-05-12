package ironclad49er.template.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTest extends Block {

    public BlockTest(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.REDSTONE);
        this.setHardness(hardness);
        this.setSoundType(SoundType.METAL);
        this.setResistance(resistance);
    }

    public BlockTest(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.IRON, hardness, resistance);
    }

    public BlockTest(String unlocalizedName) {
        this(unlocalizedName, 0.0f, 10.0f);
    }

}
