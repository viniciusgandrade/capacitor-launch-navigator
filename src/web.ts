import { WebPlugin } from '@capacitor/core';

import type { LaunchNavigatorPlugin } from './definitions';

export class LaunchNavigatorWeb
  extends WebPlugin
  implements LaunchNavigatorPlugin {
  navigate(options: { latitude: number; longitude: number }): Promise<void> {
    console.log(options);
    return Promise.resolve(undefined);
  }
}
