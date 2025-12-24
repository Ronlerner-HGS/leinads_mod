package pixel.leinad.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import pixel.leinad.scp.entites.SCP_173;
import pixel.leinad.scp.entites.SCP_173Model;

public class SCPRenderer extends MobEntityRenderer<SCP_173, SCP_173Model> {
    private static final Identifier TEXTURE = Identifier.of("leinads-mod", "textures/entity/texture.png");

    public SCPRenderer(EntityRendererFactory.Context context, SCP_173Model entityModel, float f) {
        super(context, entityModel, f);
    }

    @Override
    public Identifier getTexture(SCP_173 entity) {
        return TEXTURE;
    }
}
