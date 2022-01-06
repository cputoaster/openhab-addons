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

import static org.openhab.binding.jbl.internal.JBLBindingConstants.*;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.thing.Thing;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.binding.BaseThingHandlerFactory;
import org.openhab.core.thing.binding.ThingHandler;
import org.openhab.core.thing.binding.ThingHandlerFactory;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The {@link JBLHandlerFactory} is responsible for creating things and thing
 * handlers.
 *
 * @author Andres Meyer - Initial contribution
 */
@NonNullByDefault
@Component(configurationPid = "binding.jbl", service = ThingHandlerFactory.class)
public class JBLHandlerFactory extends BaseThingHandlerFactory {

    private Logger logger = LoggerFactory.getLogger(JBLHandlerFactory.class);

    @Override
    public boolean supportsThingType(ThingTypeUID thingTypeUID) {
        return AV_THING_TYPES_UIDS.contains(thingTypeUID);
    }

    @Override
    protected @Nullable ThingHandler createHandler(Thing thing) {
        ThingTypeUID thingTypeUID = thing.getThingTypeUID();

        if (thingTypeUID.equals(JBL_SDP_55_THING_TYPE)) {
            return new JBLHandler(thing);
        }

        logger.error("Unexpected thing encountered in factory: {}", thingTypeUID.getAsString());
        return null;
    }
}
