/*
 * Copyright (c) 2017 Eclectic Logic LLC
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

package com.eclecticlogic.orc.api;

import com.eclecticlogic.orc.impl.bootstrap.OrcWriterBootstrap;
import com.eclecticlogic.orc.impl.SchemaSpiImpl;

import java.util.function.Supplier;

/**
 * Created by kabram
 */
public class Factory {

    public static <T> Schema<T> createSchema(Class<T> clz) {
        return new SchemaSpiImpl<T>(clz);
    }


    public static <T> OrcWriter<T> createWriter(Supplier<Schema<T>> schemaSupplier) {
        return OrcWriterBootstrap.create(schemaSupplier);
    }
}