/*******************************************************************************
 * Copyright (c) 2012 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the 
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0 
 * which accompanies this distribution. 
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at 
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     12/07/2012-2.5 Guy Pelletier 
 *       - 389090: JPA 2.1 DDL Generation Support
 ******************************************************************************/ 
package org.eclipse.persistence.testing.models.jpa21.advanced.xml.ddl;

import org.eclipse.persistence.testing.models.jpa21.advanced.enums.RunningStatus;

public class RunnerStatus {
    RunningStatus runningStatus;

    public RunningStatus getRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(RunningStatus runningStatus) {
        this.runningStatus = runningStatus;
    }
}