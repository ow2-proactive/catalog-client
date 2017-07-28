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
 * This is catalog object model
 */
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class CatalogObject {

    private final int bucket_id;

    private final String name;

    private final String kind;

    private final String content_type;

    private final String commit_message;

    private ImmutableList<CatalogObjectMetadata> object_key_values;

    private ImmutableList<String> links;

    private String commit_time;

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
            bucketID = catalogObject.bucket_id;
            name = catalogObject.name;
            kind = catalogObject.kind;
            contentType = catalogObject.content_type;
            commitMessage = catalogObject.commit_message;
            objectKeyValues = Optional.ofNullable(catalogObject.object_key_values)
                               .map(metadata -> ImmutableList.copyOf(metadata))
                               .orElse(new ImmutableList.Builder<CatalogObjectMetadata>().build());
            links = Optional.ofNullable(catalogObject.links)
                            .map(links -> ImmutableList.copyOf(links))
                            .orElse(new ImmutableList.Builder<String>().build());
            commitTime = catalogObject.commit_time;
        }

        public Builder setObjectKeyValues(ImmutableList<CatalogObjectMetadata> object_key_values){
            this.objectKeyValues = object_key_values;
            return this;
        }

        public Builder setLinks(ImmutableList<String> links){
            this.links = links;
            return this;
        }

        public Builder setCommitTime(String commit_time){
            this.commitTime = commit_time;
            return this;
        }

        public CatalogObject build() {
            return new CatalogObject(bucketID, name, kind, contentType, commitMessage, objectKeyValues, links, commitTime);
        }
    }
}
