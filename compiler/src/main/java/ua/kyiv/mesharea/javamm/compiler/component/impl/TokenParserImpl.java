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

package ua.kyiv.mesharea.javamm.compiler.component.impl;

import ua.kyiv.mesharea.javamm.compiler.component.TokenParser;
import ua.kyiv.mesharea.javamm.compiler.model.TokenParserResult;

import java.util.List;

/**
 * @author mesharea
 * @link http://mesharea.kyiv.ua
 */
public class TokenParserImpl implements TokenParser {

    @Override
    public TokenParserResult parseLine(final String line, final boolean multilineCommentStarted) {
        final List<String> tokens = line.isEmpty() ? List.of() : List.of(line.trim().split(" "));
        return new TokenParserResult(tokens, false);
    }
}
