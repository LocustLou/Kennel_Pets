package net.luinesh.kennelpets.entity.ModEntities;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.luinesh.kennelpets.KennelPets;
import net.luinesh.kennelpets.entity.custom.BorzoiEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntites {
    public static final EntityType<BorzoiEntity> BORZOI = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(KennelPets.MOD_ID,"borzoi"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BorzoiEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build());

}