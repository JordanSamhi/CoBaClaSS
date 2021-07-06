/*
 * Copyright (C) 2019 The Android Open Source Project
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

package com.android.systemui.tv;

import android.content.Context;

import com.android.systemui.SystemUIFactory;
import com.android.systemui.dagger.SystemUIRootComponent;

/**
 * TV variant {@link SystemUIFactory}, that substitutes default {@link SystemUIRootComponent} for
 * {@link TvSystemUIRootComponent}
 */
public class TvSystemUIFactory extends SystemUIFactory {
    @Override
    protected SystemUIRootComponent buildSystemUIRootComponent(Context context) {
        return DaggerTvSystemUIRootComponent.builder()
                .context(context)
                .build();
    }
}
