/*
 * ProActive Parallel Suite(TM):
 * The Open Source library for parallel and distributed
 * Workflows & Scheduling, Orchestration, Cloud Automation
 * and Big Data Analysis on Enterprise Grids & Clouds.
 *
 * Copyright (c) 2007 - 2017 ActiveEon
 * Contact: contact@activeeon.com
 *
 * This library is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation: version 3 of
 * the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * If needed, contact us to obtain a release under GPL Version 2 or 3
 * or a different license than the AGPL.
 */
package org.ow2.proactive.model;

import java.util.Optional;

import com.google.common.collect.ImmutableList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


/**
 * This is the catalog object model
 */
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class CatalogObject {

    private final int bucketId;

    private final String name;

    private final String kind;

    private final String contentType;

    private final String commitMessage;

    private ImmutableList<CatalogObjectMetadata> objectKeyValues;

    private ImmutableList<String> links;

    private String commitTime;

    @RequiredArgsConstructor
    public static class Builder {

        private final int bucketID;

        private final String name;

        private final String kind;

        private final String contentType;

        private final String commitMessage;

        private ImmutableList<CatalogObjectMetadata> objectKeyValues;

        private ImmutableList<String> links;

        private String commitTime;

        public Builder(CatalogObject catalogObject) {
            bucketID = catalogObject.bucketId;
            name = catalogObject.name;
            kind = catalogObject.kind;
            contentType = catalogObject.contentType;
            commitMessage = catalogObject.commitMessage;
            objectKeyValues = Optional.ofNullable(catalogObject.objectKeyValues)
                                      .map(metadata -> ImmutableList.copyOf(metadata))
                                      .orElse(new ImmutableList.Builder<CatalogObjectMetadata>().build());
            links = Optional.ofNullable(catalogObject.links)
                            .map(l -> ImmutableList.copyOf(l))
                            .orElse(new ImmutableList.Builder<String>().build());
            commitTime = catalogObject.commitTime;
        }

        public Builder setObjectKeyValues(ImmutableList<CatalogObjectMetadata> objectKeyValues) {
            this.objectKeyValues = objectKeyValues;
            return this;
        }

        public Builder setLinks(ImmutableList<String> links) {
            this.links = links;
            return this;
        }

        public Builder setCommitTime(String commitTime) {
            this.commitTime = commitTime;
            return this;
        }

        public CatalogObject build() {
            return new CatalogObject(bucketID,
                                     name,
                                     kind,
                                     contentType,
                                     commitMessage,
                                     objectKeyValues,
                                     links,
                                     commitTime);
        }
    }
}
