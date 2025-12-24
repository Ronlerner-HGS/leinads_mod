package pixel.leinad.scp.entites;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class SCP_173Model extends EntityModel<Entity> {
	private final ModelPart bb_main;
	public SCP_173Model(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(48, 9).cuboid(-1.0F, 0.0F, 5.0F, 2.0F, 19.0F, 2.0F, new Dilation(0.0F))
		.uv(34, 51).cuboid(-1.0F, 0.0F, -8.0F, 2.0F, 19.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-4.0F, 19.0F, -8.0F, 9.0F, 27.0F, 15.0F, new Dilation(0.0F))
		.uv(0, 42).cuboid(-3.0F, 46.0F, -6.0F, 7.0F, 13.0F, 10.0F, new Dilation(0.0F))
		.uv(34, 42).cuboid(-14.0F, 37.0F, -12.0F, 17.0F, 5.0F, 4.0F, new Dilation(0.0F))
		.uv(48, 0).cuboid(-14.0F, 37.0F, 7.0F, 17.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bb_main.render(matrices, vertexConsumer, light, overlay);
	}

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {

    }
}