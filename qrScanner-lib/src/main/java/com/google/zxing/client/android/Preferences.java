/*
 * Copyright (C) 2008 ZXing authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.zxing.client.android;

import com.google.zxing.client.android.camera.FrontLightMode;

/**
 * The main settings activity.
 *
 * @author dswitkin@google.com (Daniel Switkin)
 * @author Sean Owen
 */
public final class Preferences {

    public static final FrontLightMode KEY_FRONT_LIGHT_MODE = FrontLightMode.OFF;
    public static final boolean KEY_AUTO_FOCUS = true;
    public static final boolean KEY_INVERT_SCAN = false;

    public static final boolean KEY_DISABLE_CONTINUOUS_FOCUS = true;
    public static final boolean KEY_DISABLE_EXPOSURE = true;
    public static final boolean KEY_DISABLE_METERING = true;
    public static final boolean KEY_DISABLE_BARCODE_SCENE_MODE = true;
}
