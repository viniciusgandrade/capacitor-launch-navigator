package br.com.gs3tecnologia.launchnavigator;

import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "LaunchNavigator")
public class LaunchNavigatorPlugin extends Plugin {
    @PluginMethod
    public void navigate(PluginCall call) {
        Double latitude = call.getDouble("latitude");
        Double longitude = call.getDouble("longitude");
        call.resolve();
    }
}
