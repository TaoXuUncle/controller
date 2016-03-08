/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

/**
 * Generated file

 * Generated from: yang module name: netty-event-executor  yang module local name: netty-global-event-executor
 * Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
 * Generated at: Tue Nov 12 10:44:21 CET 2013
 *
 * Do not modify this file unless it is present under src/main directory
 */
package org.opendaylight.controller.config.yang.netty.eventexecutor;

import org.opendaylight.controller.config.yang.netty.eventexecutor.AutoCloseableEventExecutor.CloseableEventExecutorMixin;

public final class GlobalEventExecutorModule extends
        org.opendaylight.controller.config.yang.netty.eventexecutor.AbstractGlobalEventExecutorModule {

    public GlobalEventExecutorModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,
            org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public GlobalEventExecutorModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,
            org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,
            GlobalEventExecutorModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void validate() {
        super.validate();
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        return CloseableEventExecutorMixin.globalEventExecutor();
    }



}
