/* 
* SPDX-FileCopyrightText: 2024 Paranoid Android SPDX-FileCopyrightText: 2025 Neoteric 
* SPDX-License-Identifier: Apache-2.0 
*/

package com.android.settings.deviceinfo.firmwareversion

import android.content.Context
import android.os.SystemProperties
import com.android.settings.core.BasePreferenceController

class NeotericAndroidVersionPreferenceController(
    context: Context,
    preferenceKey: String
) : BasePreferenceController(context, preferenceKey) {

    override fun getAvailabilityStatus(): Int = AVAILABLE_UNSEARCHABLE

    // Removed the incorrect, duplicate getSummary function. This is the only one needed.
    override fun getSummary(): CharSequence =
        SystemProperties.get(NEOTERIC_VERSION_PROP, "Unknown")

    companion object {
        private const val NEOTERIC_VERSION_PROP = "ro.neoteric.version"
    }
}

