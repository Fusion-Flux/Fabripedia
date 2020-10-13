package net.yourname.modname.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.yourname.modname.ModName;

public class ModNameBlocks {
    /** NORMAL_BLOCK is where your block name would go. In .of(Material.STONE) you would replace STONE with whatever material your trying to replicate
     * If you cant find that material try to find one that is very close this is not needed but its nice. Lastly .hardness(3.5f) is the well hardness of your block
     * google different block harnesses for reference */
    public static final Block NORMAL_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.5f));
    /** Add .luminance(state -> [Light Level]) to make your block glow, 15 is the glow strength of glowstone for reference */
    public static final Block GLOWING_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.5f).luminance(state -> 15));
    /**
     * registers the Blocks so they now exist in the registry
     */
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(ModName.MOD_ID, "normal_block"), NORMAL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(ModName.MOD_ID, "normal_block"), new BlockItem(NORMAL_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
