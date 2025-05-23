/*
 * Copyright (c) 2024, RTE (http://www.rte-france.com)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.farao_community.farao.gridcapa.data_bridge.configuration;

/**
 * @author Marc Schwitzguebel {@literal <marc.schwitzguebel at rte-france.com>}
 * @author Vincent Bochet {@literal <vincent.bochet at rte-france.com>}
 */
public record FileMetadataConfiguration(FileType fileType, String fileRegex, String remoteFileRegex, Boolean doUnzip,
                                         String sourceDirectory, String sinkDirectory, String fileListPersistenceFile) {

    public FileMetadataConfiguration(FileType fileType, String fileRegex, String remoteFileRegex, Boolean doUnzip,
                                      String sourceDirectory, String sinkDirectory, String fileListPersistenceFile) {
        this.fileType = fileType;
        this.fileRegex = fileRegex;
        this.remoteFileRegex = remoteFileRegex;
        this.doUnzip = doUnzip != null ? doUnzip : true; // NOSONAR for readability reason
        this.sourceDirectory = sourceDirectory;
        this.sinkDirectory = sinkDirectory;
        this.fileListPersistenceFile = fileListPersistenceFile;
    }
}
