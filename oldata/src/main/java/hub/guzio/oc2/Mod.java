package hub.guzio.oc2;

import net.fabricmc.api.ModInitializer;

public interface Mod extends ModInitializer{
    @Override
    public abstract void onInitialize();
    public abstract String getModID();
}
