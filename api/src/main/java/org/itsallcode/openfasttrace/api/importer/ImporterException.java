package org.itsallcode.openfasttrace.api.importer;

/*-
 * #%L
 \* OpenFastTrace
 * %%
 * Copyright (C) 2016 - 2017 itsallcode.org
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

/**
 * {@link Importer}s throw this exception when there is an error while
 * exporting.
 */
public class ImporterException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    /**
     * Creates a new {@link ImporterException}.
     * 
     * @param message
     *            the message for the exception.
     * @param cause
     *            the cause for the exception.
     */
    public ImporterException(final String message, final Throwable cause)
    {
        super(message, cause);
    }

    /**
     * Creates a new {@link ImporterException}.
     * 
     * @param message
     *            the message for the exception.
     */
    public ImporterException(final String message)
    {
        super(message);
    }
}
