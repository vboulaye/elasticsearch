/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.core.indexlifecycle.action;

import org.elasticsearch.test.AbstractStreamableTestCase;
import org.elasticsearch.xpack.core.indexlifecycle.action.DeleteLifecycleAction.Response;

public class DeleteLifecycleResponseTests extends AbstractStreamableTestCase<DeleteLifecycleAction.Response> {

    @Override
    protected Response createTestInstance() {
        return new Response(randomBoolean());
    }

    @Override
    protected Response createBlankInstance() {
        return new Response();
    }

    @Override
    protected Response mutateInstance(Response response) {
        return new Response(response.isAcknowledged() == false);
    }

}
