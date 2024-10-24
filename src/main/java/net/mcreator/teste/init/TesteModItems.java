
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.teste.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.teste.item.BbbbbbbbbbbbbbbbbbbbbbbbItem;
import net.mcreator.teste.TesteMod;

public class TesteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TesteMod.MODID);
	public static final RegistryObject<Item> AAAAAAAAAAAAAAAAAAAAAAAAAAA = block(TesteModBlocks.AAAAAAAAAAAAAAAAAAAAAAAAAAA);
	public static final RegistryObject<Item> BBBBBBBBBBBBBBBBBBBBBBBB = REGISTRY.register("bbbbbbbbbbbbbbbbbbbbbbbb", () -> new BbbbbbbbbbbbbbbbbbbbbbbbItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
