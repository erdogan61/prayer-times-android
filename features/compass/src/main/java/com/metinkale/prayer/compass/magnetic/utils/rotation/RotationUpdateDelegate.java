/*
 * Copyright (c) 2013-2019 Metin Kale
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.metinkale.prayer.compass.magnetic.utils.rotation;

/**
 * Delegate to receive updates when rotation of device changes
 *
 * @author Adam
 */
public interface RotationUpdateDelegate {
    /**
     * @param newMatrix - 4x4 matrix
     */
    void onRotationUpdate(float[] newMatrix);
    
    void onAccuracyChanged(int accuracy);
}