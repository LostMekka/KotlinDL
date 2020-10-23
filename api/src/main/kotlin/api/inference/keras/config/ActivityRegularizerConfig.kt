/*
 * Copyright 2020 JetBrains s.r.o. and Kotlin Deep Learning project contributors. All Rights Reserved.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE.txt file.
 */

package api.inference.keras.config

internal data class ActivityRegularizerConfig(
    val l1: Double?,
    val l2: Double?
)