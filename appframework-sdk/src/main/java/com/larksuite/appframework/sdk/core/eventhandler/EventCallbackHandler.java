/*
 * Copyright (c) 2019 Bytedance Inc.  All rights reserved.
 * Use of this source code is governed by a MIT style
 * license that can be found in the LICENSE file.
 */

package com.larksuite.appframework.sdk.core.eventhandler;

import com.larksuite.appframework.sdk.core.InstanceContext;
import com.larksuite.appframework.sdk.core.protocol.event.BaseEvent;

public interface EventCallbackHandler<T extends BaseEvent> {

    Object handler(InstanceContext c, T event);
}
