/*
 * Copyright (c) 2019 PANTHEON.tech and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.core.compat;

import org.opendaylight.mdsal.dom.api.DOMTransactionChain;
import org.opendaylight.mdsal.dom.api.DOMTransactionChainListener;

/**
 * Adapter between the legacy controller API-based DOMDataBroker and the mdsal API-based DOMDataBroker, equivalent
 * to PingPongDOMDataBroker.
 */
public class LegacyPingPongDOMDataBrokerAdapter extends AbstractLegacyDOMDataBrokerAdapter {
    public LegacyPingPongDOMDataBrokerAdapter(final org.opendaylight.mdsal.dom.api.DOMDataBroker delegate) {
        super(delegate);
    }

    @Override
    DOMTransactionChain createDelegateChain(DOMTransactionChainListener listener) {
        return delegate().createMergingTransactionChain(listener);
    }
}
