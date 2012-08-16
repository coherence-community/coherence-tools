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

package com.seovic.core;


import com.seovic.test.objects.Person;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * @author Aleksandar Seovic  2012.08.16
 */
public class ExtractorTest {
    @Test
    public void testConstants() {
        assertEquals("blah", Extractor.IDENTITY.extract("blah"));
        assertEquals(5, Extractor.IDENTITY.extract(5));
        assertEquals(new Person(1L, "Aleks"), Extractor.IDENTITY.extract(new Person(1L, "Aleks")));
    }
}
