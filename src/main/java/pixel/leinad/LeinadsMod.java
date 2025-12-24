package pixel.leinad;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pixel.leinad.scp.Items.ModItems;
import pixel.leinad.scp.entites.SCP_173;


public class LeinadsMod implements ModInitializer {
	public static final String MOD_ID = "leinads-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final EntityType<SCP_173> scp_173 = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(MOD_ID,"SCP 173"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SCP_173::new)
                    .dimensions(EntityDimensions.fixed(0.6f,1.8f))
                    .build()
    );

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
        ModItems.initialize();
        FabricDefaultAttributeRegistry.register(scp_173,SCP_173.createAttributes());

	}
}