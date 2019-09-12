package captainmk.diamonds4ever;

import net.minecraft.init.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MODID, name= Reference.MODNAME, version= Reference.VERSION, acceptedMinecraftVersions= Reference.ACCEPTED_MINECRAFT_VERSIONS)
public class DiamondsAreForever {
    @Instance
    public static DiamondsAreForever instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(Reference.MODID + ":preInit");
        Items.DIAMOND_HELMET.setMaxDamage(0);
        Items.DIAMOND_CHESTPLATE.setMaxDamage(0);
        Items.DIAMOND_LEGGINGS.setMaxDamage(0);
        Items.DIAMOND_BOOTS.setMaxDamage(0);
        Items.DIAMOND_AXE.setMaxDamage(0);
        Items.DIAMOND_HOE.setMaxDamage(0);
        Items.DIAMOND_PICKAXE.setMaxDamage(0);
        Items.DIAMOND_SHOVEL.setMaxDamage(0);
        Items.DIAMOND_SWORD.setMaxDamage(0);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(Reference.MODID + ":init");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println(Reference.MODID + ":postInit");
    }
}