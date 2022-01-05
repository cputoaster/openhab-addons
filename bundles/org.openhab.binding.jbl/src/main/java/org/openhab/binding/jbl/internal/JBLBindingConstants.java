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
    public static final ThingTypeUID BRIDGE_THING_TYPE = new ThingTypeUID(BINDING_ID, "jblAVR");
    public static final ThingTypeUID ZONE_THING_TYPE = new ThingTypeUID(BINDING_ID, "zone");

    public static final Set<ThingTypeUID> BRIDGE_THING_TYPES_UIDS = Collections.singleton(BRIDGE_THING_TYPE);
    public static final Set<ThingTypeUID> ZONE_THING_TYPES_UIDS = Collections.singleton(ZONE_THING_TYPE);

    // List of all Channel ids
    public static final String CHANNEL_POWER = "power";

    public enum Zone {
        Zone1 = 1,
        Zone2 = 2
    }

    public static class Models {
        public static final String JBL_SDP_55 = "JBL SDP-55";
    }
}
