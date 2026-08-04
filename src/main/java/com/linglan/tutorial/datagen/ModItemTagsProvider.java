package com.linglan.tutorial.datagen;

import com.linglan.tutorial.item.ModItems;
import com.linglan.tutorial.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(ModItemTags.SUGAR_TAG)
                .add(Items.BEETROOT)
                .add(ModItems.STRAWBERRY);

        valueLookupBuilder(ModItemTags.FIRE_ETHER_TOOL_MATERIAL)
                .add(ModItems.FIRE_ETHER);

        valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ICE_ETHER_HELMET)
                .add(ModItems.ICE_ETHER_CHESTPLATE)
                .add(ModItems.ICE_ETHER_LEGGINGS)
                .add(ModItems.ICE_ETHER_BOOTS);
    }
}
