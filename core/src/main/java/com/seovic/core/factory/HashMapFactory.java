/*
 * Copyright 2009 Aleksandar Seovic
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

package com.seovic.core.factory;


import com.seovic.core.Factory;
import java.util.HashMap;
import java.util.Map;


/**
 * {@link Factory} implementation that creates a <tt>java.util.HashMap</tt>
 * instance.
 *
 * @author Aleksandar Seovic  2010.11.08
 */
public class HashMapFactory<K, V>
        extends AbstractFactory<Map<K, V>> {

    private static final long serialVersionUID = 2457955245305449232L;

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<K, V> create() {
        return new HashMap<K, V>();
    }
}