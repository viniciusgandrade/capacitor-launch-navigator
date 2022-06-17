import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(LaunchNavigatorPlugin)
public class LaunchNavigatorPlugin: CAPPlugin {
    @objc func navigate(_ call: CAPPluginCall) {
        let latitude = call.getDouble("latitude") ?? 0.0
        let longitude = call.getDouble("longitude") ?? 0.0
        call.resolve()
    }
}
