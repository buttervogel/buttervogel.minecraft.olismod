package buttervogel.minecraft.olismod.penguin.client.renderer;

import buttervogel.minecraft.olismod.OlisMod;
import buttervogel.minecraft.olismod.penguin.client.model.PenguinModel;
import buttervogel.minecraft.olismod.penguin.entity.AdeliePenguinEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;

@OnlyIn(Dist.CLIENT)
public class PenguinRenderer extends MobRenderer<AdeliePenguinEntity, PenguinModel<AdeliePenguinEntity>> {

    public PenguinRenderer(EntityRendererManager renderManager) {
        super(renderManager, new PenguinModel<>(), 0.5F);
    }

    @Override
    @Nonnull
    public ResourceLocation getEntityTexture(@Nonnull AdeliePenguinEntity penguin) {
        String name = penguin.getName().getString().toLowerCase().trim();
        if (name.equals("joshie") || name.equals("joshiejack")) {
            return this.getPenguinTexture("joshie");
        } else if (name.equals("darkosto")) {
            return this.getPenguinTexture("darkosto");
        }
        return penguin.isChild() ? this.getPenguinTexture("adelie_child") : this.getPenguinTexture("adelie");
    }

    private ResourceLocation getPenguinTexture(String fileName) {
        return new ResourceLocation(OlisMod.MOD_ID, "textures/entity/penguin/" + fileName + ".png");
    }
}
