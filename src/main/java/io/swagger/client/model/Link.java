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
package io.swagger.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Link
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-08T12:41:35.988+01:00")
public class Link {
    @JsonProperty("href")
    private String href = null;

    @JsonProperty("rel")
    private String rel = null;

    @JsonProperty("templated")
    private Boolean templated = null;

    public Link href(String href) {
        this.href = href;
        return this;
    }

    /**
    * Get href
    * @return href
    **/
    @ApiModelProperty(value = "")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Link rel(String rel) {
        this.rel = rel;
        return this;
    }

    /**
    * Get rel
    * @return rel
    **/
    @ApiModelProperty(value = "")
    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public Link templated(Boolean templated) {
        this.templated = templated;
        return this;
    }

    /**
    * Get templated
    * @return templated
    **/
    @ApiModelProperty(value = "")
    public Boolean isTemplated() {
        return templated;
    }

    public void setTemplated(Boolean templated) {
        this.templated = templated;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Link link = (Link) o;
        return Objects.equals(this.href, link.href) && Objects.equals(this.rel, link.rel) &&
               Objects.equals(this.templated, link.templated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, rel, templated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Link {\n");

        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
        sb.append("    templated: ").append(toIndentedString(templated)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
