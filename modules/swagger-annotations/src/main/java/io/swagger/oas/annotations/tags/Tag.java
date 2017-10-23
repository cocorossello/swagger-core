/**
 * Copyright 2017 SmartBear Software
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.oas.annotations.tags;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import io.swagger.oas.annotations.ExternalDocumentation;

@Target({ ElementType.TYPE,  ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Tags.class)
@Inherited
public @interface Tag {

    /**
     * The name of this tag.
     *
     * @return the name of this tag
     */
    String name();

    /**
     * A short description for this tag.
     *
     * @return the description of this tag
     */
    String description() default "";

    /**
     * Additional external documentation for this tag.
     *
     * @return the external documentation for this tag
     */
    ExternalDocumentation externalDocs() default @ExternalDocumentation();
}