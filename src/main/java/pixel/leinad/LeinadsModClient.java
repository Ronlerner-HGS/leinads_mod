package pixel.leinad;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import pixel.leinad.scp.entites.SCP_173Model;

public class LeinadsModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

//        EntityModelLayerRegistry.registerModelLayer(
//                ModEntityModelLayers.SCP_173,
//                SCP_173Model::getTexturedModelData
//        );
    }
}
