package net.luinesh.kennelpets.entity.client;

import net.luinesh.kennelpets.KennelPets;
import net.luinesh.kennelpets.entity.custom.BorzoiEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BorzoiRenderer extends GeoEntityRenderer<BorzoiEntity> {
    public BorzoiRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new BorzoiModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public Identifier getTextureResource(BorzoiEntity instance) {
        return new Identifier(KennelPets.MOD_ID, "textures/entity/borzoi_texture.png");
    }

}