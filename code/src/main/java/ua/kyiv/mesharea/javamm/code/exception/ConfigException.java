/*
 * Copyright (c) 2024. http://mesharea.kyiv.ua
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
 *
 */

package ua.kyiv.mesharea.javamm.code.exception;

import static java.util.Objects.requireNonNull;

/**
 * @author mesharea
 * @link http://mesharea.kyiv.ua
 */
// system errors
public final class ConfigException extends RuntimeException {

    public ConfigException(final String message) {
        super(requireNonNull(message));
    }

    public ConfigException(final String message, final Throwable cause) {
        super(requireNonNull(message), requireNonNull(cause));
    }
}