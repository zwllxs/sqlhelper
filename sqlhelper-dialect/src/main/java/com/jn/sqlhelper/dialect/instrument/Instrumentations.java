/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the LGPL, Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at  http://www.gnu.org/licenses/lgpl-3.0.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jn.sqlhelper.dialect.instrument;

import com.jn.langx.annotation.Name;
import com.jn.langx.util.Preconditions;
import com.jn.langx.util.reflect.Reflects;

public class Instrumentations {
    public static String getAliasName(Instrumentation instrumentation) {
        Preconditions.checkNotNull(instrumentation);
        Name name = Reflects.getAnnotation(instrumentation.getClass(), Name.class);
        if (name != null) {
            return name.value();
        }
        return null;
    }
}
