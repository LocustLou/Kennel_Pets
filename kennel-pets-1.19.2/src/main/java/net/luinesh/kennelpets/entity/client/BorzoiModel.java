package net.luinesh.kennelpets.entity.client;

import net.luinesh.kennelpets.KennelPets;
import net.luinesh.kennelpets.entity.custom.BorzoiEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BorzoiModel extends AnimatedGeoModel<BorzoiEntity> {
    @Override
    public Identifier getModelResource(BorzoiEntity object) {
        return new Identifier(KennelPets.MOD_ID, "geo/borzoi.geo.json");
    }

    @Override
    public Identifier getTextureResource(BorzoiEntity object) {
        return new Identifier(KennelPets.MOD_ID, "textures/entity/borzoi_texture.png");
    }

    @Override
    public Identifier getAnimationResource(BorzoiEntity animatable) {
        return new Identifier(KennelPets.MOD_ID, "animations/borzoi.animation.json");
    }
}
