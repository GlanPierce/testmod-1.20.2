package name.testmod.items;

import name.testmod.TestMod;
import name.testmod.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SHUAIGE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TestMod.MOD_ID, "shuaige"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.SHUAIGE))
                    .displayName(Text.translatable("itemgroup.testmod.shuaige"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SHUAIGE);
                        entries.add(ModBlocks.SHUAIGE_ORE);

                        entries.add(Items.DIAMOND);

                    })
                    .build());


    public static void registerModIteGroup() {
        TestMod.LOGGER.debug("Registering mod item group for" + TestMod.MOD_ID);
    }
}
