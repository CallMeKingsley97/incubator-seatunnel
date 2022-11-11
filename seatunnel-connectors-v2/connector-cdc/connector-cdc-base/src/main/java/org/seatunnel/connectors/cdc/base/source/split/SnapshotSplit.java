/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.seatunnel.connectors.cdc.base.source.split;

import org.apache.seatunnel.api.source.SourceSplit;
import org.apache.seatunnel.api.table.type.SeaTunnelRowType;

import io.debezium.relational.TableId;
import lombok.Getter;

@Getter
public class SnapshotSplit implements SourceSplit {
    private final String splitId;
    private final TableId tableId;
    private final SeaTunnelRowType splitKeyType;
    private final Object splitStart;
    private final Object splitEnd;

    public SnapshotSplit(
            String splitId,
            TableId tableId,
            SeaTunnelRowType splitKeyType,
            Object splitStart,
            Object splitEnd) {
        this.splitId = splitId;
        this.tableId = tableId;
        this.splitKeyType = splitKeyType;
        this.splitStart = splitStart;
        this.splitEnd = splitEnd;
    }

    @Override
    public String splitId() {
        return this.splitId;
    }
}