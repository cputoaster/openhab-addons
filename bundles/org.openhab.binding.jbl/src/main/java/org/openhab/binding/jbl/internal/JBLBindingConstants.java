/**
 * Copyright (c) 2010-2021 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.jbl.internal;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.thing.ThingTypeUID;

/**
 * The {@link JBLBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Andres Meyer - Initial contribution
 */
@NonNullByDefault
public class JBLBindingConstants {

    private static final String BINDING_ID = "jbl";

    // List of all Thing Type UIDs
    public static final ThingTypeUID JBL_SDP_55_THING_TYPE = new ThingTypeUID(BINDING_ID, "jbl_sdp_55");

    public static final Set<ThingTypeUID> AV_THING_TYPES_UIDS = Collections.singleton(JBL_SDP_55_THING_TYPE);

    // List of all Channel ids
    public static final String CHANNEL_DISPLAY_BRIGHTNESS = "display_brightness";

    public static final Set<String> CHANNELS_SYSTEM = Collections
            .unmodifiableSet(Stream.of(CHANNEL_DISPLAY_BRIGHTNESS).collect(Collectors.toSet()));
}
