/*
 * Copyright 2020 The Embulk project
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

package org.embulk.util.config.rebuild;

import com.fasterxml.jackson.databind.node.FloatNode;

final class FloatNodeRebuilder {
    private FloatNodeRebuilder() {
        // No instantiation.
    }

    static FloatNode rebuild(final Object from) {
        final float floatValue = Util.getThroughGetter(
                from,
                "com.fasterxml.jackson.databind.node.FloatNode",
                "floatValue",
                Float.class,
                FloatNodeRebuilder.class);

        return new FloatNode(floatValue);
    }
}
