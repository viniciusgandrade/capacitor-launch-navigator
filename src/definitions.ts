export interface LaunchNavigatorPlugin {
  navigate(options: { latitude: number, longitude: number }): Promise<void>;
}
