/*
 * Copyright 2013 MovingBlocks
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
package org.terasology.reflection.copy.strategy;

import org.terasology.math.geom.Vector4f;
import org.terasology.reflection.copy.CopyStrategy;
import org.terasology.reflection.copy.RegisterCopyStrategy;

/**
 */
@RegisterCopyStrategy
public class Vector4fCopyStrategy implements CopyStrategy<Vector4f> {

    @Override
    public Vector4f copy(Vector4f value) {
        if (value != null) {
            return new Vector4f(value);
        }
        return null;
    }
}
