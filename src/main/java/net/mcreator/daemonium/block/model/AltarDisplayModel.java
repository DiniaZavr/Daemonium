package net.mcreator.daemonium.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.daemonium.block.display.AltarDisplayItem;

public class AltarDisplayModel extends AnimatedGeoModel<AltarDisplayItem> {
	@Override
	public ResourceLocation getAnimationFileLocation(AltarDisplayItem animatable) {
		return new ResourceLocation("daemonium", "animations/altar.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(AltarDisplayItem animatable) {
		return new ResourceLocation("daemonium", "geo/altar.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(AltarDisplayItem entity) {
		return new ResourceLocation("daemonium", "textures/blocks/altartexture.png");
	}
}
