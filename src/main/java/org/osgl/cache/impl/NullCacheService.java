/*
 * Copyright (C) 2013 The Rythm Engine project
 * Gelin Luo <greenlaw110(at)gmail.com>
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
package org.osgl.cache.impl;

/*-
 * #%L
 * OSGL Cache API
 * %%
 * Copyright (C) 2017 OSGL (Open Source General Library)
 * %%
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
 * #L%
 */

import org.osgl.cache.CacheService;

/**
 * A do-nothing implementation of {@link org.osgl.cache.CacheService}
 */
public enum NullCacheService implements CacheService {

    INSTANCE;

    @Override
    public void put(String key, Object value, int ttl) {

    }

    @Override
    public void put(String key, Object value) {

    }

    @Override
    public void evict(String key) {

    }

    @Override
    public <T> T get(String key) {
        return null;
    }

    @Override
    public int incr(String s) {
        return 0;
    }

    @Override
    public int incr(String s, int i) {
        return 0;
    }

    @Override
    public int decr(String s) {
        return 0;
    }

    @Override
    public int decr(String s, int i) {
        return 0;
    }


    @Override
    public void clear() {

    }

    @Override
    public void setDefaultTTL(int ttl) {

    }

    @Override
    public void shutdown() {

    }

    @Override
    public void startup() {

    }

    @Override
    public State state() {
        return State.STARTED;
    }


}
