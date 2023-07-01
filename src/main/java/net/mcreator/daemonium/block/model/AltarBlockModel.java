package net.mcreator.daemonium.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.daemonium.block.entity.AltarTileEntity;

public class AltarBlockModel extends AnimatedGeoModel<AltarTileEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(AltarTileEntity animatable) {
		return new ResourceLocation("daemonium", "animations/altar.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(AltarTileEntity animatable) {
		return new ResourceLocation("daemonium", "geo/altar.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(AltarTileEntity entity) {
		return new ResourceLocation("daemonium", "textures/blocks/altartexture.png");
	}
}
