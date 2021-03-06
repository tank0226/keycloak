/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.keycloak.testsuite.console.page.realm.clientpolicies;

import org.jboss.arquillian.graphene.page.Page;

/**
 * @author Vaclav Muzikar <vmuzikar@redhat.com>
 */
public class Condition extends BaseClientPoliciesPage {
    private static final String POLICY_NAME = "policyName";
    private static final String CONDITION_INDEX = "conditionIndex";

    @Page
    private ConditionForm form;

    @Override
    public String getUriFragment() {
        return super.getUriFragment() + "/policies-update/{" + POLICY_NAME + "}/update-condition/{" + CONDITION_INDEX + "}";
    }

    public void setUriParameters(String policyName, Integer conditionIndex) {
        setUriParameter(POLICY_NAME, policyName);
        setUriParameter(CONDITION_INDEX, conditionIndex.toString());
    }

    public ConditionForm form() {
        return form;
    }
}
