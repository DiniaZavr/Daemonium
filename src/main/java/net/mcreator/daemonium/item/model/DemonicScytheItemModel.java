package net.mcreator.daemonium.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.daemonium.item.DemonicScytheItem;

public class DemonicScytheItemModel extends AnimatedGeoModel<DemonicScytheItem> {
	@Override
	public ResourceLocation getAnimationFileLocation(DemonicScytheItem animatable) {
		return new ResourceLocation("daemonium", "animations/demon_weapon.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(DemonicScytheItem animatable) {
		return new ResourceLocation("daemonium", "geo/demon_weapon.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(DemonicScytheItem animatable) {
		return new ResourceLocation("daemonium", "textures/items/texture_1.png");
	}
}
