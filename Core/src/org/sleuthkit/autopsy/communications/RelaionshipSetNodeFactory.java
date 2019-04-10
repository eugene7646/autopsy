/*
 * Autopsy Forensic Browser
 *
 * Copyright 2017-2019 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.communications;

import java.util.Collection;
import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.sleuthkit.datamodel.BlackboardArtifact;

/**
 *
 */
public class RelaionshipSetNodeFactory extends ChildFactory<BlackboardArtifact> {

    private final Collection<BlackboardArtifact> artifacts;

    public RelaionshipSetNodeFactory(Collection<BlackboardArtifact> artifacts) {
        this.artifacts = artifacts;
    }

    @Override
    protected boolean createKeys(List<BlackboardArtifact> list) {
        list.addAll(artifacts);
        return true;
    }

    @Override
    protected Node createNodeForKey(BlackboardArtifact key) {
        return new RelationshipNode(key);
    }
}
