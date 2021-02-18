package hub.guzio.oc2;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.ModInitializer;

public interface Mod extends ModInitializer, ClientModInitializer, DedicatedServerModInitializer {
    @Override
    public abstract void onInitialize();

    @Override
    public abstract void onInitializeClient();

    @Override
    public abstract void onInitializeServer();

    public abstract String getModID();
}
