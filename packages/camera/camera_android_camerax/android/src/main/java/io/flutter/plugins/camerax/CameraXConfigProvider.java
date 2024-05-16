package io.flutter.plugins.camerax;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.CameraXConfig;

public class CameraXConfigProvider implements CameraXConfig.Provider {

  @NonNull
  @Override
  public CameraXConfig getCameraXConfig() {
    return CameraXConfig.Builder.fromConfig(Camera2Config.defaultConfig())
        .setMinimumLoggingLevel(Log.ERROR).build();
  }
}
