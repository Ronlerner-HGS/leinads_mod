package pixel.leinad.scp.Items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import pixel.leinad.LeinadsMod;

public class ModItems {
    public static Item register(Item item, String id){
        Identifier itemID = Identifier.of(LeinadsMod.MOD_ID,id);

        Item registredItem = Registry.register(Registries.ITEM,itemID,item);

        return registredItem;
    }

    public static final Item.Settings SCP_500_SETTINGS =
            new Item.Settings()
                    .food(new FoodComponent.Builder()
                            .nutrition(1)
                            .saturationModifier(0.0f)
                            .alwaysEdible()
                            .statusEffect(
                                    new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 10, 4),
                                    1.0f
                            )
                            .statusEffect(
                                    new StatusEffectInstance(StatusEffects.ABSORPTION, 20 * 60, 2),
                                    1.0f
                            )
                            .build()

                    )
                    .maxCount(1);

    public static final Item SCP_500 = register(
            new Item(SCP_500_SETTINGS),
            "scp_500"
    );

    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(LeinadsMod.MOD_ID,"scp"));
    public static final ItemGroup Cystom_Item_Group = FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.leinads-mod"))
            .build();

    public static void initialize(){
        Registry.register(Registries.ITEM_GROUP,CUSTOM_ITEM_GROUP_KEY,Cystom_Item_Group);

        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY)
                .register((itemGroup)-> itemGroup.add(ModItems.SCP_500));
    }

}
