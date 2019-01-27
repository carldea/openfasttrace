package org.itsallcode.openfasttrace.importer.input;

/*-
 * #%L
 * OpenFastTrace
 * %%
 * Copyright (C) 2016 - 2018 itsallcode.org
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

// Duplications in test code are ok
@SuppressWarnings("common-java:DuplicatedBlocks")
public class TestingFileInput implements InputFile
{
    private final Path path;

    private TestingFileInput(final Path path)
    {
        this.path = path;
    }

    public static InputFile forPath(final Path file)
    {
        return new TestingFileInput(file);
    }

    @Override
    public BufferedReader createReader() throws IOException
    {
        return Files.newBufferedReader(this.path, StandardCharsets.UTF_8);
    }

    @Override
    public String getPath()
    {
        return this.path.toString();
    }

    @Override
    public String toString()
    {
        return getPath();
    }

    @Override
    public boolean isRealFile()
    {
        return true;
    }

    @Override
    public Path toPath()
    {
        return this.path;
    }
}